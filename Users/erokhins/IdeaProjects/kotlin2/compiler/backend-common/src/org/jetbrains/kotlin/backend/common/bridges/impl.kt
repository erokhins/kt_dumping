'generateBridges' @ [33:12] ==> public fun <Function : FunctionHandle, Signature> generateBridges(function: DescriptorBasedFunctionHandle, signature: (DescriptorBasedFunctionHandle) -> Signature): Set<Bridge<Signature>> defined in org.jetbrains.kotlin.backend.common.bridges[SimpleFunctionDescriptorImpl]
Inferred types:
    <Function : FunctionHandle> -> DescriptorBasedFunctionHandle
    <Signature> -> Signature

'DescriptorBasedFunctionHandle' @ [33:28] ==> public constructor DescriptorBasedFunctionHandle(descriptor: FunctionDescriptor, isBodyOwner: (DeclarationDescriptor) -> Boolean) defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[ClassConstructorDescriptorImpl]

'descriptor' @ [33:58] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.generateBridgesForFunctionDescriptor[ValueParameterDescriptorImpl]

'isBodyOwner' @ [33:70] ==> value-parameter isBodyOwner: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.backend.common.bridges.generateBridgesForFunctionDescriptor[ValueParameterDescriptorImpl]

'invoke' @ [33:86] ==> public abstract operator fun invoke(p1: FunctionDescriptor): Signature defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [33:96] ==> value-parameter it: DescriptorBasedFunctionHandle defined in org.jetbrains.kotlin.backend.common.bridges.generateBridgesForFunctionDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [33:99] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[PropertyDescriptorImpl]

'descriptor' @ [65:30] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[PropertyDescriptorImpl]

'overriddenDescriptors' @ [65:41] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'map' @ [65:63] ==> public inline fun <T, R> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.map(transform: ((FunctionDescriptor..FunctionDescriptor?)) -> DescriptorBasedFunctionHandle): List<DescriptorBasedFunctionHandle> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)
    <R> -> DescriptorBasedFunctionHandle

'DescriptorBasedFunctionHandle' @ [65:69] ==> public constructor DescriptorBasedFunctionHandle(descriptor: FunctionDescriptor, isBodyOwner: (DeclarationDescriptor) -> Boolean) defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[ClassConstructorDescriptorImpl]

'it' @ [65:99] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle.overridden.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [65:102] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'isBodyOwner' @ [65:112] ==> value-parameter isBodyOwner: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [68:13] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[PropertyDescriptorImpl]

'kind' @ [68:24] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [68:29] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'findInterfaceImplementation' @ [69:13] ==> public fun findInterfaceImplementation(descriptor: CallableMemberDescriptor): CallableMemberDescriptor? defined in org.jetbrains.kotlin.backend.common.bridges in file impl.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [69:41] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[PropertyDescriptorImpl]

'descriptor' @ [72:13] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[PropertyDescriptorImpl]

'modality' @ [72:24] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [72:36] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [72:45] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'invoke' @ [73:13] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [73:25] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[PropertyDescriptorImpl]

'containingDeclaration' @ [73:36] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'isInterface' @ [76:33] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [76:45] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[PropertyDescriptorImpl]

'containingDeclaration' @ [76:56] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'overridden' @ [78:36] ==> private final val overridden: List<DescriptorBasedFunctionHandle> defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[PropertyDescriptorImpl]

'descriptor' @ [81:16] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[PropertyDescriptorImpl]

'hashCode' @ [81:27] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[DeserializedSimpleFunctionDescriptor]

'other' @ [85:16] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle.equals[ValueParameterDescriptorImpl]

'descriptor' @ [85:58] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[PropertyDescriptorImpl]

'other' @ [85:72] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle.equals[ValueParameterDescriptorImpl]

'descriptor' @ [85:78] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[PropertyDescriptorImpl]

'descriptor' @ [89:16] ==> public final val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.DescriptorBasedFunctionHandle[PropertyDescriptorImpl]

'toString' @ [89:27] ==> public open fun toString(): String defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [100:9] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.findInterfaceImplementation[ValueParameterDescriptorImpl]

'kind' @ [100:20] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [100:25] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'isOrOverridesSynthesized' @ [101:9] ==> public fun isOrOverridesSynthesized(descriptor: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [101:34] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.findInterfaceImplementation[ValueParameterDescriptorImpl]

'findImplementationFromInterface' @ [103:26] ==> public fun findImplementationFromInterface(descriptor: CallableMemberDescriptor): CallableMemberDescriptor? defined in org.jetbrains.kotlin.backend.common.bridges in file impl.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [103:58] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.findInterfaceImplementation[ValueParameterDescriptorImpl]

'firstSuperMethodFromKotlin' @ [104:34] ==> public fun firstSuperMethodFromKotlin(descriptor: CallableMemberDescriptor, implementation: CallableMemberDescriptor): CallableMemberDescriptor? defined in org.jetbrains.kotlin.backend.common.bridges in file impl.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [104:61] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.findInterfaceImplementation[ValueParameterDescriptorImpl]

'implementation' @ [104:73] ==> val implementation: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.findInterfaceImplementation[LocalVariableDescriptor]

'!' @ [106:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInterface' @ [106:26] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'immediateConcreteSuper' @ [106:38] ==> val immediateConcreteSuper: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.findInterfaceImplementation[LocalVariableDescriptor]

'containingDeclaration' @ [106:61] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'immediateConcreteSuper' @ [111:12] ==> val immediateConcreteSuper: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.findInterfaceImplementation[LocalVariableDescriptor]

'getOverriddenDeclarations' @ [119:37] ==> @NotNull public open fun getOverriddenDeclarations(@NotNull p0: CallableMemberDescriptor): (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'descriptor' @ [119:63] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.findImplementationFromInterface[ValueParameterDescriptorImpl]

'filterOutOverridden' @ [120:35] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> filterOutOverridden(@NotNull p0: (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>)): (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableMemberDescriptor

'overridden' @ [120:55] ==> val overridden: (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.backend.common.bridges.findImplementationFromInterface[LocalVariableDescriptor]

'filtered' @ [122:18] ==> val filtered: (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.backend.common.bridges.findImplementationFromInterface[LocalVariableDescriptor]

'firstOrNull' @ [122:27] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.firstOrNull(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): CallableMemberDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'it' @ [122:41] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.backend.common.bridges.findImplementationFromInterface.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [122:44] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [122:56] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [122:65] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'isClassOrEnumClass' @ [124:25] ==> public open fun isClassOrEnumClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'result' @ [124:44] ==> val result: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.findImplementationFromInterface[LocalVariableDescriptor]

'containingDeclaration' @ [124:51] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'result' @ [126:12] ==> val result: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.findImplementationFromInterface[LocalVariableDescriptor]

'descriptor' @ [138:12] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.firstSuperMethodFromKotlin[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [138:23] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'firstOrNull' @ [138:45] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.firstOrNull(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): CallableMemberDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'overridden' @ [139:9] ==> value-parameter overridden: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.backend.common.bridges.firstSuperMethodFromKotlin.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [139:20] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [139:32] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [139:41] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'overridden' @ [140:10] ==> value-parameter overridden: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.backend.common.bridges.firstSuperMethodFromKotlin.<anonymous>[ValueParameterDescriptorImpl]

'implementation' @ [140:24] ==> value-parameter implementation: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.firstSuperMethodFromKotlin[ValueParameterDescriptorImpl]

'overrides' @ [140:57] ==> public open fun <D : (CallableDescriptor..CallableDescriptor?)> overrides(@NotNull p0: (CallableMemberDescriptor..CallableMemberDescriptor?), @NotNull p1: (CallableMemberDescriptor..CallableMemberDescriptor?)): Boolean defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'overridden' @ [140:67] ==> value-parameter overridden: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.backend.common.bridges.firstSuperMethodFromKotlin.<anonymous>[ValueParameterDescriptorImpl]

'implementation' @ [140:79] ==> value-parameter implementation: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.firstSuperMethodFromKotlin[ValueParameterDescriptorImpl]

