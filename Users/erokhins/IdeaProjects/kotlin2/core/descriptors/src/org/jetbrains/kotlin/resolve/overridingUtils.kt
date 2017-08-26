'dfs' @ [25:16] ==> public final fun <N : (Any..Any?), R : (Any..Any?)> dfs(@NotNull p0: (MutableCollection<(CallableDescriptor..CallableDescriptor?)>..Collection<(CallableDescriptor..CallableDescriptor?)>), @NotNull p1: ((CallableDescriptor..CallableDescriptor?)) -> (MutableIterable<(CallableDescriptor..CallableDescriptor?)>..Iterable<(CallableDescriptor..CallableDescriptor?)>), @NotNull p2: DFS.NodeHandler<(CallableDescriptor..CallableDescriptor?), (ArrayList<D>..ArrayList<D>?)>): (ArrayList<D>..ArrayList<D>?) defined in org.jetbrains.kotlin.utils.DFS[SamAdapterFunctionDescriptor]
Inferred types:
    <N : (Any..Any?)> -> CallableDescriptor
    <R : (Any..Any?)> -> ArrayList<D>

'listOf' @ [26:13] ==> public fun <T> listOf(element: D): List<D> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D

'this' @ [26:20] ==> <this> defined in org.jetbrains.kotlin.resolve.findTopMostOverriddenDescriptors[ReceiverParameterDescriptorImpl]

'current' @ [27:26] ==> value-parameter current: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.findTopMostOverriddenDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [27:34] ==> public final val CallableDescriptor.overriddenDescriptors: (MutableCollection<out (CallableDescriptor..CallableDescriptor?)>..Collection<(CallableDescriptor..CallableDescriptor?)>)[MyPropertyDescriptor]

'DFS.CollectingNodeHandler<CallableDescriptor, CallableDescriptor, ArrayList<D>>' @ [28:22] ==> protected/*protected and package*/ constructor CollectingNodeHandler<N : (Any..Any?), R : (Any..Any?), C : (MutableIterable<(CallableDescriptor..CallableDescriptor?)>..Iterable<(CallableDescriptor..CallableDescriptor?)>?)>(@NotNull p0: ArrayList<D>) defined in org.jetbrains.kotlin.utils.DFS.CollectingNodeHandler[JavaClassConstructorDescriptor]
Inferred types:
    <N : (Any..Any?)> -> CallableDescriptor
    <R : (Any..Any?)> -> CallableDescriptor
    <C : (MutableIterable<(R..R?)>..Iterable<(R..R?)>?)> -> ArrayList<D>

'ArrayList' @ [28:102] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> D

'current' @ [30:25] ==> value-parameter current: CallableDescriptor defined in org.jetbrains.kotlin.resolve.findTopMostOverriddenDescriptors.<no name provided>.afterChildren[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [30:33] ==> public final val CallableDescriptor.overriddenDescriptors: (MutableCollection<out (CallableDescriptor..CallableDescriptor?)>..Collection<(CallableDescriptor..CallableDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [30:55] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'Suppress' @ [31:25] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'result' @ [32:25] ==> @NotNull protected/*protected and package*/ final val result: ArrayList<D> defined in org.jetbrains.kotlin.resolve.findTopMostOverriddenDescriptors.<no name provided>[JavaPropertyDescriptor]

'add' @ [32:32] ==> public open fun add(element: D): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'current' @ [32:36] ==> value-parameter current: CallableDescriptor defined in org.jetbrains.kotlin.resolve.findTopMostOverriddenDescriptors.<no name provided>.afterChildren[ValueParameterDescriptorImpl]

'findTopMostOverriddenDescriptors' @ [40:12] ==> public fun <D : CallableDescriptor> D.findTopMostOverriddenDescriptors(): List<D> defined in org.jetbrains.kotlin.resolve[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'mapTo' @ [40:47] ==> public inline fun <T, R, C : MutableCollection<in D>> Iterable<D>.mapTo(destination: LinkedHashSet<D>, transform: (D) -> D): LinkedHashSet<D> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D
    <R> -> D
    <C : MutableCollection<in R>> -> LinkedHashSet<D>

'LinkedHashSet' @ [40:53] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> D

'Suppress' @ [41:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'it' @ [42:10] ==> value-parameter it: D defined in org.jetbrains.kotlin.resolve.findOriginalTopMostOverriddenDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [42:13] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'size' @ [52:9] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'this' @ [52:27] ==> <this> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[ReceiverParameterDescriptorImpl]

'LinkedList' @ [53:17] ==> public constructor LinkedList<E : (Any..Any?)>(p0: (MutableCollection<out (H..H?)>..Collection<(H..H?)>?)) defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> H

'this' @ [53:31] ==> <this> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[ReceiverParameterDescriptorImpl]

'SmartSet' @ [54:18] ==> public companion object defined in org.jetbrains.kotlin.utils.SmartSet[FakeCallableDescriptorForObject]

'create' @ [54:27] ==> @JvmStatic public final fun <T> create(): SmartSet<H> defined in org.jetbrains.kotlin.utils.SmartSet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> H

'queue' @ [56:12] ==> val queue: LinkedList<H> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'isNotEmpty' @ [56:18] ==> @InlineOnly public inline fun <T> Collection<H>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> H

'queue' @ [57:29] ==> val queue: LinkedList<H> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'first' @ [57:35] ==> public fun <T> List<H>.first(): H defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> H

'SmartSet' @ [59:33] ==> public companion object defined in org.jetbrains.kotlin.utils.SmartSet[FakeCallableDescriptorForObject]

'create' @ [59:42] ==> @JvmStatic public final fun <T> create(): SmartSet<H> defined in org.jetbrains.kotlin.utils.SmartSet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> H

'extractMembersOverridableInBothWays' @ [62:32] ==> @NotNull public open fun <H : (Any..Any?)> extractMembersOverridableInBothWays(@NotNull overrider: H, @NotNull @Mutable extractFrom: MutableCollection<(H..H?)>, @NotNull descriptorByHandle: ((H..H?)) -> (CallableDescriptor..CallableDescriptor?), @NotNull onConflict: ((H..H?)) -> (Unit..Unit?)): (MutableCollection<(H..H?)>..Collection<(H..H?)>) defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]
Inferred types:
    <H : (Any..Any?)> -> H

'nextHandle' @ [62:68] ==> val nextHandle: H defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'queue' @ [62:80] ==> val queue: LinkedList<H> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'descriptorByHandle' @ [62:87] ==> value-parameter descriptorByHandle: H.() -> CallableDescriptor defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[ValueParameterDescriptorImpl]

'conflictedHandles' @ [62:109] ==> val conflictedHandles: SmartSet<H> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'add' @ [62:127] ==> public open fun add(element: H): Boolean defined in org.jetbrains.kotlin.utils.SmartSet[DeserializedSimpleFunctionDescriptor]

'it' @ [62:131] ==> value-parameter it: (H..H?) defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup.<anonymous>[ValueParameterDescriptorImpl]

'overridableGroup' @ [64:13] ==> val overridableGroup: (MutableCollection<(H..H?)>..Collection<(H..H?)>) defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'size' @ [64:30] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'conflictedHandles' @ [64:43] ==> val conflictedHandles: SmartSet<H> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'isEmpty' @ [64:61] ==> public open fun isEmpty(): Boolean defined in org.jetbrains.kotlin.utils.SmartSet[JavaMethodDescriptor]

'result' @ [65:13] ==> val result: SmartSet<H> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'add' @ [65:20] ==> public open fun add(element: H): Boolean defined in org.jetbrains.kotlin.utils.SmartSet[DeserializedSimpleFunctionDescriptor]

'overridableGroup' @ [65:24] ==> val overridableGroup: (MutableCollection<(H..H?)>..Collection<(H..H?)>) defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'single' @ [65:41] ==> public fun <T> Iterable<(H..H?)>.single(): (H..H?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (H..H?)

'selectMostSpecificMember' @ [69:43] ==> @NotNull public open fun <H : (Any..Any?)> selectMostSpecificMember(@NotNull overridables: (MutableCollection<(H..H?)>..Collection<(H..H?)>), @NotNull descriptorByHandle: ((H..H?)) -> (CallableDescriptor..CallableDescriptor?)): H defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]
Inferred types:
    <H : (Any..Any?)> -> H

'overridableGroup' @ [69:68] ==> val overridableGroup: (MutableCollection<(H..H?)>..Collection<(H..H?)>) defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'descriptorByHandle' @ [69:86] ==> value-parameter descriptorByHandle: H.() -> CallableDescriptor defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[ValueParameterDescriptorImpl]

'mostSpecific' @ [70:38] ==> val mostSpecific: H defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'invoke' @ [70:51] ==> public abstract operator fun H.invoke(): CallableDescriptor defined in kotlin.Function1[FunctionInvokeDescriptor]

'overridableGroup' @ [72:9] ==> val overridableGroup: (MutableCollection<(H..H?)>..Collection<(H..H?)>) defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'filterNotTo' @ [72:26] ==> public inline fun <T, C : MutableCollection<in (H..H?)>> Iterable<(H..H?)>.filterNotTo(destination: SmartSet<H>, predicate: ((H..H?)) -> Boolean): SmartSet<H> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (H..H?)
    <C : MutableCollection<in T>> -> SmartSet<H>

'conflictedHandles' @ [72:38] ==> val conflictedHandles: SmartSet<H> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'isMoreSpecific' @ [73:28] ==> public open fun isMoreSpecific(@NotNull a: CallableDescriptor, @NotNull b: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'mostSpecificDescriptor' @ [73:43] ==> val mostSpecificDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'it' @ [73:67] ==> value-parameter it: (H..H?) defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [73:70] ==> public abstract operator fun H.invoke(): CallableDescriptor defined in kotlin.Function1[FunctionInvokeDescriptor]

'conflictedHandles' @ [76:13] ==> val conflictedHandles: SmartSet<H> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'isNotEmpty' @ [76:31] ==> @InlineOnly public inline fun <T> Collection<(H..H?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (H..H?)

'result' @ [77:13] ==> val result: SmartSet<H> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'addAll' @ [77:20] ==> public open fun addAll(elements: Collection<(H..H?)>): Boolean defined in org.jetbrains.kotlin.utils.SmartSet[JavaMethodDescriptor]

'conflictedHandles' @ [77:27] ==> val conflictedHandles: SmartSet<H> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'result' @ [80:9] ==> val result: SmartSet<H> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'add' @ [80:16] ==> public open fun add(element: H): Boolean defined in org.jetbrains.kotlin.utils.SmartSet[DeserializedSimpleFunctionDescriptor]

'mostSpecific' @ [80:20] ==> val mostSpecific: H defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'result' @ [82:12] ==> val result: SmartSet<H> defined in org.jetbrains.kotlin.resolve.selectMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'selectMostSpecificInEachOverridableGroup' @ [86:21] ==> public fun <H : Any> Collection<D>.selectMostSpecificInEachOverridableGroup(descriptorByHandle: D.() -> CallableDescriptor): Collection<D> defined in org.jetbrains.kotlin.resolve[SimpleFunctionDescriptorImpl]
Inferred types:
    <H : Any> -> D

'this' @ [86:64] ==> <this> defined in org.jetbrains.kotlin.resolve.retainMostSpecificInEachOverridableGroup.<anonymous>[ReceiverParameterDescriptorImpl]

'size' @ [87:9] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'newResult' @ [87:17] ==> val newResult: Collection<D> defined in org.jetbrains.kotlin.resolve.retainMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

'size' @ [87:27] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'retainAll' @ [88:5] ==> public abstract fun retainAll(elements: Collection<D>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'newResult' @ [88:15] ==> val newResult: Collection<D> defined in org.jetbrains.kotlin.resolve.retainMostSpecificInEachOverridableGroup[LocalVariableDescriptor]

