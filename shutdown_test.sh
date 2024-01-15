#!/bin/bash
# Find the process running 'execute_test.py' and kill it
pids=$(ps aux | grep 'python execute_test.py' | grep -v 'grep' | awk '{print $2}')
if [ -n "$pids" ]; then
    echo "Killing the following process IDs: $pids"
    kill $pids
else
    echo "No matching process found."
fi
