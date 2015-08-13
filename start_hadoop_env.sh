#!/usr/bin/env bash

#Step 1
echo "from master-Server zk startup..."
/home/user/workspace/zookeeper/bin/zkServer.sh start
ssh master2 "source /etc/profile;/home/user/workspace/zookeeper/bin/zkServer.sh start"
for i in 1 2 3
do
echo "Slave $i zk startup..."
ssh Slave$i "source /etc/profile;/home/user/workspace/zookeeper/bin/zkServer.sh start"
echo "Slave $i ZK started."
done
echo "Finish with All Zookeeper Services Started."

#Step 2
echo "Startup Ha-hadoop-env..."
/home/user/workspace/hadoop/sbin/hadoop-daemon.sh start zkfc
ssh master2 "/home/user/workspace/hadoop/sbin/hadoop-daemon.sh start zkfc"
echo "Finish with HA-hadoop-env started."

#Step 3
echo "Startup DataNode for all..."
/home/user/workspace/hadoop/sbin/start-all.sh
echo "Finish with [DataNode and RSM] shutdown on master-h."

#Step 4
echo "Startup Backup DataNode for all"
ssh master2 "/home/user/workspace/hadoop/sbin/start-all.sh"
echo "Backup DataNode in master-ha."

#Step 5
echo "Startup HBase's hmaster,nodeclient"
/home/user/workspace/hbase/bin/start-hbase.sh
echo "HBase Started"
