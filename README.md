# BigData_GarbageCollection
가비지 컬렉션 (Garbage Collection)

👉 가비지 컬렉션 (Garbage Collection) 이란?

동적으로 할당했던 메모리 영역 중에서 더 이상 사용하지 않아 필요 없게 된 메모리를 식별하여 해당 메모리를 삭제하는 프로세스.


👉 GC가 필요한 이유

메모리는 한정되어 있는데, 프로그래머가 수동으로 메모리 해제를 일일이 해주지 않는다면, 사용되고 있는 메모리와 사용되지 않는 메모리가 계속 쌓이게 되어 메모리 누수(Memory leak)가 발생된다. 이를 해결하기 위해 가비지 컬렉션이 필요.


👉 어떤 매커니즘으로 동작?

기본적으로 가비지 컬렉션이 실행된다고 하면 Stop The World와 Mark and Sweep의 단계를 따른다.


① Stop The World

가비지 컬렉션을 실행하기 위해 애플리케이션의 실행을 멈추는 작업으로, 가비지 컬렉션이 실행될 때 가비지 컬렉션을 실행하는 쓰레드를 제외한 모든 쓰레드들의 작업이 중단되고, 가비지 컬렉션이 완료되면 재개된다.


② Mark and Sweep

Mark란 사용되는 메모리와 사용되지 않는 메모리를 식별하는 작업을 의미

Sweep이란 Mark단계에서 사용되지 않는다고 식별된 메모리를 해제하는 작업을 의미

따라서 Mark and Sweep은 사용되고 있는 메모리를 식별(Mark)하고, 식별(Mark)되지 않은 메모리를 제거

참조 : https://mangkyu.tistory.com/118
