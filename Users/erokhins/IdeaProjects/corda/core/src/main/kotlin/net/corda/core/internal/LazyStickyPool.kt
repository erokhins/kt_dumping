'Random' @ [21:26] ==> public constructor Random() defined in java.util.Random[JavaClassConstructorDescriptor]

'Array' @ [22:25] ==> public constructor Array<T>(size: Int, init: (Int) -> LazyStickyPool.InstanceBox<A>) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> InstanceBox<A>

'size' @ [22:31] ==> value-parameter size: Int defined in net.corda.core.internal.LazyStickyPool.<init>[ValueParameterDescriptorImpl]

'InstanceBox' @ [22:39] ==> public constructor InstanceBox<A>() defined in net.corda.core.internal.LazyStickyPool.InstanceBox[ClassConstructorDescriptorImpl]
Inferred types:
    <A> -> A

'%' @ [25:16] ==> @SinceKotlin public final operator fun rem(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'abs' @ [25:21] ==> public open fun abs(p0: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'stickTo' @ [25:25] ==> value-parameter stickTo: Any defined in net.corda.core.internal.LazyStickyPool.toIndex[ValueParameterDescriptorImpl]

'hashCode' @ [25:33] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'boxes' @ [25:47] ==> private final val boxes: Array<LazyStickyPool.InstanceBox<A>> defined in net.corda.core.internal.LazyStickyPool[PropertyDescriptorImpl]

'size' @ [25:53] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'boxes' @ [29:19] ==> private final val boxes: Array<LazyStickyPool.InstanceBox<A>> defined in net.corda.core.internal.LazyStickyPool[PropertyDescriptorImpl]

'toIndex' @ [29:25] ==> private final fun toIndex(stickTo: Any): Int defined in net.corda.core.internal.LazyStickyPool[SimpleFunctionDescriptorImpl]

'stickTo' @ [29:33] ==> value-parameter stickTo: Any defined in net.corda.core.internal.LazyStickyPool.borrow[ValueParameterDescriptorImpl]

'synchronized' @ [30:24] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> LinkedBlockingQueue<A>): LinkedBlockingQueue<A> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> LinkedBlockingQueue<A>

'box' @ [30:37] ==> val box: LazyStickyPool.InstanceBox<A> defined in net.corda.core.internal.LazyStickyPool.borrow[LocalVariableDescriptor]

'box' @ [31:28] ==> val box: LazyStickyPool.InstanceBox<A> defined in net.corda.core.internal.LazyStickyPool.borrow[LocalVariableDescriptor]

'instance' @ [31:32] ==> public final var instance: LinkedBlockingQueue<A>? defined in net.corda.core.internal.LazyStickyPool.InstanceBox[PropertyDescriptorImpl]

'if (instance == null) {
                val newInstance = LinkedBlockingQueue(listOf(newInstance()))
                box.instance = newInstance
                newInstance
            } else {
                instance
            }' @ [32:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LinkedBlockingQueue<A>, elseBranch: LinkedBlockingQueue<A>): LinkedBlockingQueue<A>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LinkedBlockingQueue<A>

'instance' @ [32:17] ==> val instance: LinkedBlockingQueue<A>? defined in net.corda.core.internal.LazyStickyPool.borrow.<anonymous>[LocalVariableDescriptor]

'LinkedBlockingQueue' @ [33:35] ==> public constructor LinkedBlockingQueue<E : (Any..Any?)>(p0: (MutableCollection<out (A..A?)>..Collection<(A..A?)>?)) defined in java.util.concurrent.LinkedBlockingQueue[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A

'listOf' @ [33:55] ==> public fun <T> listOf(element: A): List<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'invoke' @ [33:62] ==> public abstract operator fun invoke(): A defined in kotlin.Function0[FunctionInvokeDescriptor]

'box' @ [34:17] ==> val box: LazyStickyPool.InstanceBox<A> defined in net.corda.core.internal.LazyStickyPool.borrow[LocalVariableDescriptor]

'instance' @ [34:21] ==> public final var instance: LinkedBlockingQueue<A>? defined in net.corda.core.internal.LazyStickyPool.InstanceBox[PropertyDescriptorImpl]

'newInstance' @ [34:32] ==> val newInstance: LinkedBlockingQueue<A> defined in net.corda.core.internal.LazyStickyPool.borrow.<anonymous>[LocalVariableDescriptor]

'newInstance' @ [35:17] ==> val newInstance: LinkedBlockingQueue<A> defined in net.corda.core.internal.LazyStickyPool.borrow.<anonymous>[LocalVariableDescriptor]

'instance' @ [37:17] ==> val instance: LinkedBlockingQueue<A>? defined in net.corda.core.internal.LazyStickyPool.borrow.<anonymous>[LocalVariableDescriptor]

'instance' @ [40:16] ==> val instance: LinkedBlockingQueue<A> defined in net.corda.core.internal.LazyStickyPool.borrow[LocalVariableDescriptor]

'take' @ [40:25] ==> public open fun take(): (A..A?) defined in java.util.concurrent.LinkedBlockingQueue[JavaMethodDescriptor]

'random' @ [44:25] ==> private final val random: Random defined in net.corda.core.internal.LazyStickyPool[PropertyDescriptorImpl]

'nextInt' @ [44:32] ==> public open fun nextInt(): Int defined in java.util.Random[JavaMethodDescriptor]

'borrow' @ [45:24] ==> public final fun borrow(stickTo: Any): A defined in net.corda.core.internal.LazyStickyPool[SimpleFunctionDescriptorImpl]

'randomInt' @ [45:31] ==> val randomInt: Int defined in net.corda.core.internal.LazyStickyPool.borrow[LocalVariableDescriptor]

'Pair' @ [46:16] ==> public constructor Pair<out A, out B>(first: Int, second: A) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> A

'randomInt' @ [46:21] ==> val randomInt: Int defined in net.corda.core.internal.LazyStickyPool.borrow[LocalVariableDescriptor]

'instance' @ [46:32] ==> val instance: A defined in net.corda.core.internal.LazyStickyPool.borrow[LocalVariableDescriptor]

'boxes' @ [50:19] ==> private final val boxes: Array<LazyStickyPool.InstanceBox<A>> defined in net.corda.core.internal.LazyStickyPool[PropertyDescriptorImpl]

'toIndex' @ [50:25] ==> private final fun toIndex(stickTo: Any): Int defined in net.corda.core.internal.LazyStickyPool[SimpleFunctionDescriptorImpl]

'stickTo' @ [50:33] ==> value-parameter stickTo: Any defined in net.corda.core.internal.LazyStickyPool.release[ValueParameterDescriptorImpl]

'box' @ [51:9] ==> val box: LazyStickyPool.InstanceBox<A> defined in net.corda.core.internal.LazyStickyPool.release[LocalVariableDescriptor]

'instance' @ [51:13] ==> public final var instance: LinkedBlockingQueue<A>? defined in net.corda.core.internal.LazyStickyPool.InstanceBox[PropertyDescriptorImpl]

'add' @ [51:24] ==> public open fun add(element: (A..A?)): Boolean defined in java.util.concurrent.LinkedBlockingQueue[JavaMethodDescriptor]

'instance' @ [51:28] ==> value-parameter instance: A defined in net.corda.core.internal.LazyStickyPool.release[ValueParameterDescriptorImpl]

'component1' @ [55:14] ==> public final operator fun component1(): Any defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [55:23] ==> public final operator fun component2(): A defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (stickToOrNull == null) {
            borrow()
        } else {
            Pair(stickToOrNull, borrow(stickToOrNull))
        }' @ [55:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<Any, A>, elseBranch: Pair<Any, A>): Pair<Any, A>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Any, A>

'stickToOrNull' @ [55:39] ==> value-parameter stickToOrNull: Any? = ... defined in net.corda.core.internal.LazyStickyPool.run[ValueParameterDescriptorImpl]

'borrow' @ [56:13] ==> public final fun borrow(): Pair<Any, A> defined in net.corda.core.internal.LazyStickyPool[SimpleFunctionDescriptorImpl]

'Pair' @ [58:13] ==> public constructor Pair<out A, out B>(first: Any, second: A) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Any
    <out B> -> A

'stickToOrNull' @ [58:18] ==> value-parameter stickToOrNull: Any? = ... defined in net.corda.core.internal.LazyStickyPool.run[ValueParameterDescriptorImpl]

'borrow' @ [58:33] ==> public final fun borrow(stickTo: Any): A defined in net.corda.core.internal.LazyStickyPool[SimpleFunctionDescriptorImpl]

'stickToOrNull' @ [58:40] ==> value-parameter stickToOrNull: Any? = ... defined in net.corda.core.internal.LazyStickyPool.run[ValueParameterDescriptorImpl]

'invoke' @ [61:20] ==> public abstract operator fun invoke(p1: A): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'instance' @ [61:33] ==> val instance: A defined in net.corda.core.internal.LazyStickyPool.run[LocalVariableDescriptor]

'release' @ [63:13] ==> public final fun release(stickTo: Any, instance: A): Unit defined in net.corda.core.internal.LazyStickyPool[SimpleFunctionDescriptorImpl]

'stickTo' @ [63:21] ==> val stickTo: Any defined in net.corda.core.internal.LazyStickyPool.run[LocalVariableDescriptor]

'instance' @ [63:30] ==> val instance: A defined in net.corda.core.internal.LazyStickyPool.run[LocalVariableDescriptor]

'boxes' @ [68:16] ==> private final val boxes: Array<LazyStickyPool.InstanceBox<A>> defined in net.corda.core.internal.LazyStickyPool[PropertyDescriptorImpl]

'map' @ [68:22] ==> public inline fun <T, R> Array<out LazyStickyPool.InstanceBox<A>>.map(transform: (LazyStickyPool.InstanceBox<A>) -> A?): List<A?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InstanceBox<A>
    <R> -> A?

'it' @ [68:28] ==> value-parameter it: LazyStickyPool.InstanceBox<A> defined in net.corda.core.internal.LazyStickyPool.close.<anonymous>[ValueParameterDescriptorImpl]

'instance' @ [68:31] ==> public final var instance: LinkedBlockingQueue<A>? defined in net.corda.core.internal.LazyStickyPool.InstanceBox[PropertyDescriptorImpl]

'poll' @ [68:41] ==> public open fun poll(): (A..A?) defined in java.util.concurrent.LinkedBlockingQueue[JavaMethodDescriptor]

'filterNotNull' @ [68:50] ==> public fun <T : Any> Iterable<A?>.filterNotNull(): List<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> A

