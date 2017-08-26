'ArrayList' @ [35:18] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FunctionDescriptor

'functions' @ [37:20] ==> value-parameter functions: Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[ValueParameterDescriptorImpl]

'invoke' @ [38:13] ==> val invoke: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'name' @ [38:20] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'OperatorNameConventions' @ [38:28] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [38:52] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'invoke' @ [41:13] ==> val invoke: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'valueParameters' @ [41:20] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [41:36] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'invoke' @ [43:33] ==> val invoke: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'containingDeclaration' @ [43:40] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'classId' @ [43:82] ==> public val ClassifierDescriptorWithTypeParameters.classId: ClassId? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'if (containerClassId != null && isBuiltinFunctionClass(containerClassId)) {
            createSynthesizedFunctionWithFirstParameterAsReceiver(invoke)
        }
        else {
            val invokeDeclaration = invoke.overriddenDescriptors.singleOrNull()
                                    ?: error("No single overridden invoke for $invoke: ${invoke.overriddenDescriptors}")
            val synthesizedSuperFun = createSynthesizedFunctionWithFirstParameterAsReceiver(invokeDeclaration)
            val fakeOverride = synthesizedSuperFun.copy(
                    invoke.containingDeclaration,
                    synthesizedSuperFun.modality,
                    synthesizedSuperFun.visibility,
                    CallableMemberDescriptor.Kind.FAKE_OVERRIDE,
                    /* copyOverrides = */ false
            )
            fakeOverride.setSingleOverridden(synthesizedSuperFun)
            fakeOverride
        }' @ [44:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionDescriptor, elseBranch: FunctionDescriptor): FunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionDescriptor

'containerClassId' @ [44:31] ==> val containerClassId: ClassId? defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'isBuiltinFunctionClass' @ [44:59] ==> public fun isBuiltinFunctionClass(classId: ClassId): Boolean defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'containerClassId' @ [44:82] ==> val containerClassId: ClassId? defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'createSynthesizedFunctionWithFirstParameterAsReceiver' @ [45:13] ==> private fun createSynthesizedFunctionWithFirstParameterAsReceiver(descriptor: FunctionDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks[SimpleFunctionDescriptorImpl]

'invoke' @ [45:67] ==> val invoke: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'invoke' @ [48:37] ==> val invoke: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'overriddenDescriptors' @ [48:44] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'singleOrNull' @ [48:66] ==> public fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.singleOrNull(): FunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'error' @ [49:40] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'invoke' @ [49:80] ==> val invoke: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'invoke' @ [49:90] ==> val invoke: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'overriddenDescriptors' @ [49:97] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'createSynthesizedFunctionWithFirstParameterAsReceiver' @ [50:39] ==> private fun createSynthesizedFunctionWithFirstParameterAsReceiver(descriptor: FunctionDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks[SimpleFunctionDescriptorImpl]

'invokeDeclaration' @ [50:93] ==> val invokeDeclaration: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'synthesizedSuperFun' @ [51:32] ==> val synthesizedSuperFun: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'copy' @ [51:52] ==> @NotNull public abstract fun copy(p0: (DeclarationDescriptor..DeclarationDescriptor?), p1: (Modality..Modality?), p2: (Visibility..Visibility?), p3: (CallableMemberDescriptor.Kind..CallableMemberDescriptor.Kind?), p4: Boolean): FunctionDescriptor defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'invoke' @ [52:21] ==> val invoke: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'containingDeclaration' @ [52:28] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'synthesizedSuperFun' @ [53:21] ==> val synthesizedSuperFun: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'modality' @ [53:41] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'synthesizedSuperFun' @ [54:21] ==> val synthesizedSuperFun: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'visibility' @ [54:41] ==> public final val FunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [55:51] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'fakeOverride' @ [58:13] ==> val fakeOverride: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'setSingleOverridden' @ [58:26] ==> public fun CallableMemberDescriptor.setSingleOverridden(overridden: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'synthesizedSuperFun' @ [58:46] ==> val synthesizedSuperFun: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'fakeOverride' @ [59:13] ==> val fakeOverride: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'result' @ [62:9] ==> val result: ArrayList<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'add' @ [62:16] ==> public open fun add(element: FunctionDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'synthesized' @ [62:20] ==> val synthesized: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'substitute' @ [62:32] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'create' @ [62:59] ==> @NotNull public open fun create(@NotNull p0: KotlinType): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'invoke' @ [62:66] ==> val invoke: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [62:73] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [62:101] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'result' @ [65:12] ==> val result: ArrayList<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedInvokes[LocalVariableDescriptor]

'descriptor' @ [69:5] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedFunctionWithFirstParameterAsReceiver[ValueParameterDescriptorImpl]

'original' @ [69:16] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'newCopyBuilder' @ [69:25] ==> @NotNull public abstract fun newCopyBuilder(): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'apply' @ [69:42] ==> @InlineOnly public inline fun <T> FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)>.apply(block: (FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)>).() -> Unit): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CopyBuilder<out (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>

'setExtensionReceiverType' @ [70:9] ==> @NotNull public abstract fun setExtensionReceiverType(@Nullable p0: KotlinType?): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'descriptor' @ [70:34] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedFunctionWithFirstParameterAsReceiver[ValueParameterDescriptorImpl]

'original' @ [70:45] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'valueParameters' @ [70:54] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'first' @ [70:70] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.first(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'type' @ [70:78] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'setValueParameters' @ [71:9] ==> @NotNull public abstract fun setValueParameters(@NotNull p0: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'descriptor' @ [72:17] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedFunctionWithFirstParameterAsReceiver[ValueParameterDescriptorImpl]

'original' @ [72:28] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'valueParameters' @ [72:37] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'drop' @ [73:26] ==> public fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.drop(n: Int): List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'map' @ [74:26] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> ValueParameterDescriptor): List<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> ValueParameterDescriptor

'p' @ [74:37] ==> value-parameter p: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedFunctionWithFirstParameterAsReceiver.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [74:39] ==> public abstract fun copy(newOwner: CallableDescriptor, newName: Name, newIndex: Int): ValueParameterDescriptor defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [74:44] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedFunctionWithFirstParameterAsReceiver[ValueParameterDescriptorImpl]

'original' @ [74:55] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'identifier' @ [74:70] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'p' @ [74:85] ==> value-parameter p: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedFunctionWithFirstParameterAsReceiver.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [74:87] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'p' @ [74:101] ==> value-parameter p: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.tasks.createSynthesizedFunctionWithFirstParameterAsReceiver.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [74:103] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'build' @ [76:7] ==> @Nullable public abstract fun build(): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'descriptor' @ [79:9] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.isSynthesizedInvoke[ValueParameterDescriptorImpl]

'name' @ [79:20] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'OperatorNameConventions' @ [79:28] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [79:52] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'descriptor' @ [79:62] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.isSynthesizedInvoke[ValueParameterDescriptorImpl]

'descriptor' @ [81:36] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.isSynthesizedInvoke[ValueParameterDescriptorImpl]

'!' @ [82:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'real' @ [82:13] ==> var real: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.isSynthesizedInvoke[LocalVariableDescriptor]

'kind' @ [82:18] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [82:23] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'real' @ [84:9] ==> var real: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.isSynthesizedInvoke[LocalVariableDescriptor]

'real' @ [84:16] ==> var real: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.isSynthesizedInvoke[LocalVariableDescriptor]

'overriddenDescriptors' @ [84:21] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'singleOrNull' @ [84:43] ==> public fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.singleOrNull(): FunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'real' @ [87:12] ==> var real: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.isSynthesizedInvoke[LocalVariableDescriptor]

'kind' @ [87:17] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'SYNTHESIZED' @ [87:55] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'real' @ [88:12] ==> var real: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tasks.isSynthesizedInvoke[LocalVariableDescriptor]

'containingDeclaration' @ [88:17] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'getFunctionalClassKind' @ [88:39] ==> public fun DeclarationDescriptor.getFunctionalClassKind(): FunctionClassDescriptor.Kind? defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

