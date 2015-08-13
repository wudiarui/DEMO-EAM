#!/usr/bin/env bash
#Step 0
echo "close hbase."
/home/user/workspace/hbase/bin/stop-hbase.sh
echo "closed.first step over."
#Step 1
echo "from master-Server zk stopping..."
/home/user/workspace/zookeeper/bin/zkServer.sh stop
ssh master2 "source /etc/profile;/home/user/workspace/zookeeper/bin/zkServer.sh stop"
for i in 1 2 3
do
echo "Slave $i zk shutdown..."
ssh Slave$i "source /etc/profile;/home/user/workspace/zookeeper/bin/zkServer.sh stop"
echo "Slave $i ZK Shutdown."
done
echo "Finish with All Zookeeper Services Started."

#Step 2
echo "Shutdown Ha-hadoop-env..."
/home/user/workspace/hadoop/sbin/hadoop-daemon.sh stop zkfc
ssh master2 "/home/user/workspace/hadoop/sbin/hadoop-daemon.sh stop zkfc"
echo "Finish with HA-hadoop-env Shutdown."

#Step 3
echo "Shutdown DataNode for all..."
/home/user/workspace/hadoop/sbin/stop-all.sh
echo "Finish with [DataNode and RSM] shutdown on master-h."

#Step 4
#echo "Startup Backup DataNode for all"
#ssh master2 "/home/user/workspace/hadoop/sbin/start-all.sh"
#echo "Backup DataNode in master-a."
