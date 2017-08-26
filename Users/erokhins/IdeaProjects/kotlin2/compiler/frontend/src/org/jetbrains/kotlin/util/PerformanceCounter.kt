'arrayListOf' @ [31:35] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<PerformanceCounter> /* = ArrayList<PerformanceCounter> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PerformanceCounter

'nanoTime' @ [35:42] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'synchronized' @ [38:32] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Array<PerformanceCounter>): Array<PerformanceCounter> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Array<PerformanceCounter>

'allCounters' @ [38:45] ==> private final val allCounters: ArrayList<PerformanceCounter> /* = ArrayList<PerformanceCounter> */ defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[PropertyDescriptorImpl]

'allCounters' @ [39:17] ==> private final val allCounters: ArrayList<PerformanceCounter> /* = ArrayList<PerformanceCounter> */ defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[PropertyDescriptorImpl]

'toTypedArray' @ [39:29] ==> public inline fun <reified T> Collection<PerformanceCounter>.toTypedArray(): Array<PerformanceCounter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PerformanceCounter

'countersCopy' @ [41:13] ==> val countersCopy: Array<PerformanceCounter> defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.report[LocalVariableDescriptor]

'forEach' @ [41:26] ==> public inline fun <T> Array<out PerformanceCounter>.forEach(action: (PerformanceCounter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PerformanceCounter

'it' @ [41:36] ==> value-parameter it: PerformanceCounter defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.report.<anonymous>[ValueParameterDescriptorImpl]

'report' @ [41:39] ==> public final fun report(consumer: (String) -> Unit): Unit defined in org.jetbrains.kotlin.util.PerformanceCounter[SimpleFunctionDescriptorImpl]

'consumer' @ [41:46] ==> value-parameter consumer: (String) -> Unit defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.report[ValueParameterDescriptorImpl]

'enabled' @ [45:13] ==> private final var enabled: Boolean defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[PropertyDescriptorImpl]

'enable' @ [45:23] ==> value-parameter enable: Boolean defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.setTimeCounterEnabled[ValueParameterDescriptorImpl]

'synchronized' @ [49:13] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'allCounters' @ [49:26] ==> private final val allCounters: ArrayList<PerformanceCounter> /* = ArrayList<PerformanceCounter> */ defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[PropertyDescriptorImpl]

'allCounters' @ [50:17] ==> private final val allCounters: ArrayList<PerformanceCounter> /* = ArrayList<PerformanceCounter> */ defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[PropertyDescriptorImpl]

'forEach' @ [50:29] ==> @HidesMembers public inline fun <T> Iterable<PerformanceCounter>.forEach(action: (PerformanceCounter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PerformanceCounter

'PerformanceCounter' @ [50:37] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'reset' @ [50:57] ==> public final fun reset(): Unit defined in org.jetbrains.kotlin.util.PerformanceCounter[SimpleFunctionDescriptorImpl]

'JvmOverloads' @ [54:9] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'if (reenterable)
                ReenterableCounter(name)
            else
                SimpleCounter(name)' @ [55:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PerformanceCounter, elseBranch: PerformanceCounter): PerformanceCounter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PerformanceCounter

'reenterable' @ [55:24] ==> value-parameter reenterable: Boolean = ... defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.create[ValueParameterDescriptorImpl]

'ReenterableCounter' @ [56:17] ==> public constructor ReenterableCounter(name: String) defined in org.jetbrains.kotlin.util.ReenterableCounter[ClassConstructorDescriptorImpl]

'name' @ [56:36] ==> value-parameter name: String defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.create[ValueParameterDescriptorImpl]

'SimpleCounter' @ [58:17] ==> public constructor SimpleCounter(name: String) defined in org.jetbrains.kotlin.util.SimpleCounter[ClassConstructorDescriptorImpl]

'name' @ [58:31] ==> value-parameter name: String defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.create[ValueParameterDescriptorImpl]

'CounterWithExclude' @ [61:93] ==> public constructor CounterWithExclude(name: String, vararg excludedCounters: PerformanceCounter) defined in org.jetbrains.kotlin.util.CounterWithExclude[ClassConstructorDescriptorImpl]

'name' @ [61:112] ==> value-parameter name: String defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.create[ValueParameterDescriptorImpl]

'excluded' @ [61:119] ==> value-parameter vararg excluded: PerformanceCounter defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.create[ValueParameterDescriptorImpl]

'threadLocal' @ [64:25] ==> value-parameter threadLocal: ThreadLocal<T> defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.getOrPut[ValueParameterDescriptorImpl]

'get' @ [64:37] ==> public open fun get(): (T..T?) defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'value' @ [65:17] ==> var value: (T..T?) defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.getOrPut[LocalVariableDescriptor]

'value' @ [66:17] ==> var value: (T..T?) defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.getOrPut[LocalVariableDescriptor]

'invoke' @ [66:25] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'threadLocal' @ [67:17] ==> value-parameter threadLocal: ThreadLocal<T> defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.getOrPut[ValueParameterDescriptorImpl]

'set' @ [67:29] ==> public open fun set(p0: (T..T?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'value' @ [67:33] ==> var value: (T..T?) defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.getOrPut[LocalVariableDescriptor]

'value' @ [69:20] ==> var value: (T..T?) defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion.getOrPut[LocalVariableDescriptor]

'ArrayList' @ [73:66] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CounterWithExclude

'synchronized' @ [79:9] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean

'allCounters' @ [79:22] ==> private final val allCounters: ArrayList<PerformanceCounter> /* = ArrayList<PerformanceCounter> */ defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[PropertyDescriptorImpl]

'allCounters' @ [80:13] ==> private final val allCounters: ArrayList<PerformanceCounter> /* = ArrayList<PerformanceCounter> */ defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[PropertyDescriptorImpl]

'add' @ [80:25] ==> public open fun add(element: PerformanceCounter): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'this' @ [80:29] ==> <this> defined in org.jetbrains.kotlin.util.PerformanceCounter[LazyClassReceiverParameterDescriptor]

'count' @ [85:9] ==> private final var count: Int defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'count' @ [89:9] ==> private final var count: Int defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'!' @ [90:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'enabled' @ [90:14] ==> private final var enabled: Boolean defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[PropertyDescriptorImpl]

'invoke' @ [90:30] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'excludedFrom' @ [92:9] ==> internal final val excludedFrom: MutableList<CounterWithExclude> defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'forEach' @ [92:22] ==> @HidesMembers public inline fun <T> Iterable<CounterWithExclude>.forEach(action: (CounterWithExclude) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CounterWithExclude

'it' @ [92:32] ==> value-parameter it: CounterWithExclude defined in org.jetbrains.kotlin.util.PerformanceCounter.time.<anonymous>[ValueParameterDescriptorImpl]

'enterExcludedMethod' @ [92:35] ==> public final fun enterExcludedMethod(): Unit defined in org.jetbrains.kotlin.util.CounterWithExclude[SimpleFunctionDescriptorImpl]

'countTime' @ [94:20] ==> protected abstract fun <T> countTime(block: () -> T): T defined in org.jetbrains.kotlin.util.PerformanceCounter[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'block' @ [94:30] ==> value-parameter block: () -> T defined in org.jetbrains.kotlin.util.PerformanceCounter.time[ValueParameterDescriptorImpl]

'excludedFrom' @ [97:13] ==> internal final val excludedFrom: MutableList<CounterWithExclude> defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'forEach' @ [97:26] ==> @HidesMembers public inline fun <T> Iterable<CounterWithExclude>.forEach(action: (CounterWithExclude) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CounterWithExclude

'it' @ [97:36] ==> value-parameter it: CounterWithExclude defined in org.jetbrains.kotlin.util.PerformanceCounter.time.<anonymous>[ValueParameterDescriptorImpl]

'exitExcludedMethod' @ [97:39] ==> public final fun exitExcludedMethod(): Unit defined in org.jetbrains.kotlin.util.CounterWithExclude[SimpleFunctionDescriptorImpl]

'count' @ [102:9] ==> private final var count: Int defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'totalTimeNanos' @ [103:9] ==> private final var totalTimeNanos: Long defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'totalTimeNanos' @ [107:9] ==> private final var totalTimeNanos: Long defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'delta' @ [107:27] ==> value-parameter delta: Long defined in org.jetbrains.kotlin.util.PerformanceCounter.incrementTime[ValueParameterDescriptorImpl]

'if (totalTimeNanos == 0L) {
            consumer("$name performed $count times")
        }
        else {
            val millis = TimeUnit.NANOSECONDS.toMillis(totalTimeNanos)
            consumer("$name performed $count times, total time $millis ms")
        }' @ [113:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'totalTimeNanos' @ [113:13] ==> private final var totalTimeNanos: Long defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'invoke' @ [114:13] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [114:24] ==> public final val name: String defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'count' @ [114:40] ==> private final var count: Int defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'toMillis' @ [117:47] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'totalTimeNanos' @ [117:56] ==> private final var totalTimeNanos: Long defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'invoke' @ [118:13] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [118:24] ==> public final val name: String defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'count' @ [118:40] ==> private final var count: Int defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'millis' @ [118:65] ==> val millis: Long defined in org.jetbrains.kotlin.util.PerformanceCounter.report[LocalVariableDescriptor]

'PerformanceCounter' @ [123:44] ==> protected constructor PerformanceCounter(name: String) defined in org.jetbrains.kotlin.util.PerformanceCounter[ClassConstructorDescriptorImpl]

'name' @ [123:63] ==> value-parameter name: String defined in org.jetbrains.kotlin.util.SimpleCounter.<init>[ValueParameterDescriptorImpl]

'PerformanceCounter' @ [125:25] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'currentTime' @ [125:44] ==> public final fun currentTime(): Long defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[SimpleFunctionDescriptorImpl]

'invoke' @ [127:20] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'incrementTime' @ [130:13] ==> protected final fun incrementTime(delta: Long): Unit defined in org.jetbrains.kotlin.util.SimpleCounter[SimpleFunctionDescriptorImpl]

'PerformanceCounter' @ [130:27] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'currentTime' @ [130:46] ==> public final fun currentTime(): Long defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[SimpleFunctionDescriptorImpl]

'startTime' @ [130:62] ==> val startTime: Long defined in org.jetbrains.kotlin.util.SimpleCounter.countTime[LocalVariableDescriptor]

'PerformanceCounter' @ [135:49] ==> protected constructor PerformanceCounter(name: String) defined in org.jetbrains.kotlin.util.PerformanceCounter[ClassConstructorDescriptorImpl]

'name' @ [135:68] ==> value-parameter name: String defined in org.jetbrains.kotlin.util.ReenterableCounter.<init>[ValueParameterDescriptorImpl]

'ThreadLocal' @ [137:39] ==> public constructor ThreadLocal<T : (Any..Any?)>() defined in java.lang.ThreadLocal[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MutableSet<ReenterableCounter>

'PerformanceCounter' @ [139:65] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'getOrPut' @ [139:84] ==> internal final inline fun <T> getOrPut(threadLocal: ThreadLocal<MutableSet<ReenterableCounter>>, default: () -> MutableSet<ReenterableCounter>): MutableSet<ReenterableCounter> defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> MutableSet<ReenterableCounter>

'enteredCounters' @ [139:93] ==> private final val enteredCounters: ThreadLocal<MutableSet<ReenterableCounter>> defined in org.jetbrains.kotlin.util.ReenterableCounter.Companion[PropertyDescriptorImpl]

'HashSet' @ [139:112] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ReenterableCounter

'add' @ [139:124] ==> public abstract fun add(element: ReenterableCounter): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'counter' @ [139:128] ==> value-parameter counter: ReenterableCounter defined in org.jetbrains.kotlin.util.ReenterableCounter.Companion.enterCounter[ValueParameterDescriptorImpl]

'enteredCounters' @ [142:13] ==> private final val enteredCounters: ThreadLocal<MutableSet<ReenterableCounter>> defined in org.jetbrains.kotlin.util.ReenterableCounter.Companion[PropertyDescriptorImpl]

'get' @ [142:29] ==> public open fun get(): (MutableSet<ReenterableCounter>..MutableSet<ReenterableCounter>?) defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'remove' @ [142:36] ==> public abstract fun remove(element: ReenterableCounter): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'counter' @ [142:43] ==> value-parameter counter: ReenterableCounter defined in org.jetbrains.kotlin.util.ReenterableCounter.Companion.leaveCounter[ValueParameterDescriptorImpl]

'PerformanceCounter' @ [147:25] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'currentTime' @ [147:44] ==> public final fun currentTime(): Long defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[SimpleFunctionDescriptorImpl]

'enterCounter' @ [148:24] ==> private final fun enterCounter(counter: ReenterableCounter): Boolean defined in org.jetbrains.kotlin.util.ReenterableCounter.Companion[SimpleFunctionDescriptorImpl]

'this' @ [148:37] ==> <this> defined in org.jetbrains.kotlin.util.ReenterableCounter[LazyClassReceiverParameterDescriptor]

'invoke' @ [150:20] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'needTime' @ [153:17] ==> val needTime: Boolean defined in org.jetbrains.kotlin.util.ReenterableCounter.countTime[LocalVariableDescriptor]

'incrementTime' @ [154:17] ==> protected final fun incrementTime(delta: Long): Unit defined in org.jetbrains.kotlin.util.ReenterableCounter[SimpleFunctionDescriptorImpl]

'PerformanceCounter' @ [154:31] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'currentTime' @ [154:50] ==> public final fun currentTime(): Long defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[SimpleFunctionDescriptorImpl]

'startTime' @ [154:66] ==> val startTime: Long defined in org.jetbrains.kotlin.util.ReenterableCounter.countTime[LocalVariableDescriptor]

'leaveCounter' @ [155:17] ==> private final fun leaveCounter(counter: ReenterableCounter): Unit defined in org.jetbrains.kotlin.util.ReenterableCounter.Companion[SimpleFunctionDescriptorImpl]

'this' @ [155:30] ==> <this> defined in org.jetbrains.kotlin.util.ReenterableCounter[LazyClassReceiverParameterDescriptor]

'PerformanceCounter' @ [167:95] ==> protected constructor PerformanceCounter(name: String) defined in org.jetbrains.kotlin.util.PerformanceCounter[ClassConstructorDescriptorImpl]

'name' @ [167:114] ==> value-parameter name: String defined in org.jetbrains.kotlin.util.CounterWithExclude.<init>[ValueParameterDescriptorImpl]

'ThreadLocal' @ [169:56] ==> public constructor ThreadLocal<T : (Any..Any?)>() defined in java.lang.ThreadLocal[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MutableMap<CounterWithExclude, CallStackWithTime>

'PerformanceCounter' @ [172:19] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'getOrPut' @ [172:38] ==> internal final inline fun <T> getOrPut(threadLocal: ThreadLocal<MutableMap<CounterWithExclude, CounterWithExclude.CallStackWithTime>>, default: () -> MutableMap<CounterWithExclude, CounterWithExclude.CallStackWithTime>): MutableMap<CounterWithExclude, CounterWithExclude.CallStackWithTime> defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> MutableMap<CounterWithExclude, CallStackWithTime>

'counterToCallStackMapThreadLocal' @ [172:47] ==> private final val counterToCallStackMapThreadLocal: ThreadLocal<MutableMap<CounterWithExclude, CounterWithExclude.CallStackWithTime>> defined in org.jetbrains.kotlin.util.CounterWithExclude.Companion[PropertyDescriptorImpl]

'HashMap' @ [172:83] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> CounterWithExclude
    <V : (Any..Any?)> -> CallStackWithTime

'getOrPut' @ [172:95] ==> public inline fun <K, V> MutableMap<CounterWithExclude, CounterWithExclude.CallStackWithTime>.getOrPut(key: CounterWithExclude, defaultValue: () -> CounterWithExclude.CallStackWithTime): CounterWithExclude.CallStackWithTime defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CounterWithExclude
    <V> -> CallStackWithTime

'counter' @ [172:104] ==> value-parameter counter: CounterWithExclude defined in org.jetbrains.kotlin.util.CounterWithExclude.Companion.getCallStack[ValueParameterDescriptorImpl]

'CallStackWithTime' @ [172:115] ==> public constructor CallStackWithTime() defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[ClassConstructorDescriptorImpl]

'excludedCounters' @ [176:9] ==> value-parameter vararg excludedCounters: PerformanceCounter defined in org.jetbrains.kotlin.util.CounterWithExclude.<init>[ValueParameterDescriptorImpl]

'forEach' @ [176:26] ==> public inline fun <T> Array<out PerformanceCounter>.forEach(action: (PerformanceCounter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PerformanceCounter

'it' @ [176:36] ==> value-parameter it: PerformanceCounter defined in org.jetbrains.kotlin.util.CounterWithExclude.<init>.<anonymous>[ValueParameterDescriptorImpl]

'excludedFrom' @ [176:39] ==> internal final val excludedFrom: MutableList<CounterWithExclude> defined in org.jetbrains.kotlin.util.PerformanceCounter[PropertyDescriptorImpl]

'add' @ [176:52] ==> public abstract fun add(element: CounterWithExclude): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'this' @ [176:56] ==> <this> defined in org.jetbrains.kotlin.util.CounterWithExclude[LazyClassReceiverParameterDescriptor]

'getCallStack' @ [180:17] ==> private final fun getCallStack(counter: CounterWithExclude): CounterWithExclude.CallStackWithTime defined in org.jetbrains.kotlin.util.CounterWithExclude.Companion[SimpleFunctionDescriptorImpl]

'this' @ [180:30] ==> <this> defined in org.jetbrains.kotlin.util.CounterWithExclude[LazyClassReceiverParameterDescriptor]

'incrementTime' @ [183:9] ==> protected final fun incrementTime(delta: Long): Unit defined in org.jetbrains.kotlin.util.CounterWithExclude[SimpleFunctionDescriptorImpl]

'callStack' @ [183:23] ==> private final val callStack: CounterWithExclude.CallStackWithTime defined in org.jetbrains.kotlin.util.CounterWithExclude[PropertyDescriptorImpl]

'push' @ [183:33] ==> public final fun push(usefulCall: Boolean): Long defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[SimpleFunctionDescriptorImpl]

'invoke' @ [185:20] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'incrementTime' @ [188:13] ==> protected final fun incrementTime(delta: Long): Unit defined in org.jetbrains.kotlin.util.CounterWithExclude[SimpleFunctionDescriptorImpl]

'callStack' @ [188:27] ==> private final val callStack: CounterWithExclude.CallStackWithTime defined in org.jetbrains.kotlin.util.CounterWithExclude[PropertyDescriptorImpl]

'pop' @ [188:37] ==> public final fun pop(usefulCall: Boolean): Long defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[SimpleFunctionDescriptorImpl]

'incrementTime' @ [193:9] ==> protected final fun incrementTime(delta: Long): Unit defined in org.jetbrains.kotlin.util.CounterWithExclude[SimpleFunctionDescriptorImpl]

'callStack' @ [193:23] ==> private final val callStack: CounterWithExclude.CallStackWithTime defined in org.jetbrains.kotlin.util.CounterWithExclude[PropertyDescriptorImpl]

'push' @ [193:33] ==> public final fun push(usefulCall: Boolean): Long defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[SimpleFunctionDescriptorImpl]

'incrementTime' @ [197:9] ==> protected final fun incrementTime(delta: Long): Unit defined in org.jetbrains.kotlin.util.CounterWithExclude[SimpleFunctionDescriptorImpl]

'callStack' @ [197:23] ==> private final val callStack: CounterWithExclude.CallStackWithTime defined in org.jetbrains.kotlin.util.CounterWithExclude[PropertyDescriptorImpl]

'pop' @ [197:33] ==> public final fun pop(usefulCall: Boolean): Long defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[SimpleFunctionDescriptorImpl]

'Stack' @ [201:33] ==> public constructor Stack<E : (Any..Any?)>() defined in java.util.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Boolean

'if (isEmpty()) false else peek()' @ [204:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Boolean..Boolean?), elseBranch: (Boolean..Boolean?)): (Boolean..Boolean?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Boolean..kotlin.Boolean?)

'isEmpty' @ [204:48] ==> public open fun isEmpty(): Boolean defined in java.util.Stack[JavaMethodDescriptor]

'peek' @ [204:70] ==> public open fun peek(): (Boolean..Boolean?) defined in java.util.Stack[JavaMethodDescriptor]

'if (callStack.peekOrFalse()) PerformanceCounter.currentTime() - intervalStartTime else 0' @ [207:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long, elseBranch: Long): Long[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long

'callStack' @ [207:29] ==> private final val callStack: Stack<Boolean> defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[PropertyDescriptorImpl]

'peekOrFalse' @ [207:39] ==> public final fun Stack<Boolean>.peekOrFalse(): (Boolean..Boolean?) defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[SimpleFunctionDescriptorImpl]

'PerformanceCounter' @ [207:54] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'currentTime' @ [207:73] ==> public final fun currentTime(): Long defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[SimpleFunctionDescriptorImpl]

'intervalStartTime' @ [207:89] ==> private final var intervalStartTime: Long defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[PropertyDescriptorImpl]

'callStack' @ [208:13] ==> private final val callStack: Stack<Boolean> defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[PropertyDescriptorImpl]

'invoke' @ [208:23] ==> public abstract operator fun Stack<Boolean>.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'intervalStartTime' @ [210:13] ==> private final var intervalStartTime: Long defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[PropertyDescriptorImpl]

'PerformanceCounter' @ [210:33] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'currentTime' @ [210:52] ==> public final fun currentTime(): Long defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[SimpleFunctionDescriptorImpl]

'delta' @ [211:20] ==> val delta: Long defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime.intervalUsefulTime[LocalVariableDescriptor]

'!' @ [215:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEnteredCounter' @ [215:18] ==> public final fun isEnteredCounter(): Boolean defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[SimpleFunctionDescriptorImpl]

'!' @ [215:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'usefulCall' @ [215:41] ==> value-parameter usefulCall: Boolean defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime.push[ValueParameterDescriptorImpl]

'intervalUsefulTime' @ [217:20] ==> private final fun intervalUsefulTime(callStackUpdate: Stack<Boolean>.() -> Unit): Long defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[SimpleFunctionDescriptorImpl]

'push' @ [217:41] ==> public open fun push(p0: (Boolean..Boolean?)): (Boolean..Boolean?) defined in java.util.Stack[JavaMethodDescriptor]

'usefulCall' @ [217:46] ==> value-parameter usefulCall: Boolean defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime.push[ValueParameterDescriptorImpl]

'!' @ [221:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEnteredCounter' @ [221:18] ==> public final fun isEnteredCounter(): Boolean defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[SimpleFunctionDescriptorImpl]

'assert' @ [223:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'callStack' @ [223:20] ==> private final val callStack: Stack<Boolean> defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[PropertyDescriptorImpl]

'peek' @ [223:30] ==> public open fun peek(): (Boolean..Boolean?) defined in java.util.Stack[JavaMethodDescriptor]

'usefulCall' @ [223:40] ==> value-parameter usefulCall: Boolean defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime.pop[ValueParameterDescriptorImpl]

'intervalUsefulTime' @ [224:20] ==> private final fun intervalUsefulTime(callStackUpdate: Stack<Boolean>.() -> Unit): Long defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[SimpleFunctionDescriptorImpl]

'pop' @ [224:41] ==> public open fun pop(): (Boolean..Boolean?) defined in java.util.Stack[JavaMethodDescriptor]

'!' @ [227:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callStack' @ [227:44] ==> private final val callStack: Stack<Boolean> defined in org.jetbrains.kotlin.util.CounterWithExclude.CallStackWithTime[PropertyDescriptorImpl]

'isEmpty' @ [227:54] ==> public open fun isEmpty(): Boolean defined in java.util.Stack[JavaMethodDescriptor]

