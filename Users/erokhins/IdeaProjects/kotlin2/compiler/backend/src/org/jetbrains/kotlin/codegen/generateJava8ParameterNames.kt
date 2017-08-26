'!' @ [33:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'state' @ [33:10] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.generateParameterNames[ValueParameterDescriptorImpl]

'generateParametersMetadata' @ [33:16] ==> public final val generateParametersMetadata: Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'isSynthetic' @ [33:46] ==> value-parameter isSynthetic: Boolean defined in org.jetbrains.kotlin.codegen.generateParameterNames[ValueParameterDescriptorImpl]

'functionDescriptor' @ [37:20] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.generateParameterNames[ValueParameterDescriptorImpl]

'valueParameters' @ [37:39] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'iterator' @ [37:55] ==> public abstract fun iterator(): MutableIterator<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'jvmSignature' @ [38:32] ==> value-parameter jvmSignature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.generateParameterNames[ValueParameterDescriptorImpl]

'valueParameters' @ [38:45] ==> public final val JvmMethodSignature.valueParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>)[MyPropertyDescriptor]

'component1' @ [41:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [41:18] ==> public final operator fun component2(): (JvmMethodParameterSignature..JvmMethodParameterSignature?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'kotlinParameterTypes' @ [41:41] ==> val kotlinParameterTypes: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>) defined in org.jetbrains.kotlin.codegen.generateParameterNames[LocalVariableDescriptor]

'withIndex' @ [41:62] ==> public fun <T> Iterable<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>.withIndex(): Iterable<IndexedValue<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterSignature..org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterSignature?)

'parameterSignature' @ [42:20] ==> val parameterSignature: (JvmMethodParameterSignature..JvmMethodParameterSignature?) defined in org.jetbrains.kotlin.codegen.generateParameterNames[LocalVariableDescriptor]

'kind' @ [42:39] ==> public final val JvmMethodParameterSignature.kind: JvmMethodParameterKind[MyPropertyDescriptor]

'when (kind) {
            JvmMethodParameterKind.ENUM_NAME_OR_ORDINAL -> {
                isEnumName = !isEnumName
                if (!isEnumName) "\$enum\$name" else "\$enum\$ordinal"
            }
            JvmMethodParameterKind.RECEIVER -> AsmUtil.RECEIVER_NAME
            JvmMethodParameterKind.OUTER -> AsmUtil.CAPTURED_THIS_FIELD
            JvmMethodParameterKind.VALUE -> iterator.next().name.asString()

            JvmMethodParameterKind.CONSTRUCTOR_MARKER,
            JvmMethodParameterKind.SUPER_CALL_PARAM,
            JvmMethodParameterKind.CAPTURED_LOCAL_VARIABLE,
            JvmMethodParameterKind.THIS -> {
                //we can't generate null name cause of jdk problem #9045294
                "arg" + index
            }
        }' @ [44:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'kind' @ [44:26] ==> val kind: JvmMethodParameterKind defined in org.jetbrains.kotlin.codegen.generateParameterNames[LocalVariableDescriptor]

'ENUM_NAME_OR_ORDINAL' @ [45:36] ==> enum entry ENUM_NAME_OR_ORDINAL defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'isEnumName' @ [46:17] ==> var isEnumName: Boolean defined in org.jetbrains.kotlin.codegen.generateParameterNames[LocalVariableDescriptor]

'!' @ [46:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEnumName' @ [46:31] ==> var isEnumName: Boolean defined in org.jetbrains.kotlin.codegen.generateParameterNames[LocalVariableDescriptor]

'if (!isEnumName) "\$enum\$name" else "\$enum\$ordinal"' @ [47:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'!' @ [47:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEnumName' @ [47:22] ==> var isEnumName: Boolean defined in org.jetbrains.kotlin.codegen.generateParameterNames[LocalVariableDescriptor]

'RECEIVER' @ [49:36] ==> enum entry RECEIVER defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'RECEIVER_NAME' @ [49:56] ==> public const final val RECEIVER_NAME: String defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaPropertyDescriptor]

'OUTER' @ [50:36] ==> enum entry OUTER defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'CAPTURED_THIS_FIELD' @ [50:53] ==> public const final val CAPTURED_THIS_FIELD: String defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaPropertyDescriptor]

'VALUE' @ [51:36] ==> enum entry VALUE defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'iterator' @ [51:45] ==> val iterator: MutableIterator<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in org.jetbrains.kotlin.codegen.generateParameterNames[LocalVariableDescriptor]

'next' @ [51:54] ==> public abstract fun next(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'name' @ [51:61] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [51:66] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'CONSTRUCTOR_MARKER' @ [53:36] ==> enum entry CONSTRUCTOR_MARKER defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'SUPER_CALL_PARAM' @ [54:36] ==> enum entry SUPER_CALL_PARAM defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'CAPTURED_LOCAL_VARIABLE' @ [55:36] ==> enum entry CAPTURED_LOCAL_VARIABLE defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'THIS' @ [56:36] ==> enum entry THIS defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'+' @ [58:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'index' @ [58:25] ==> val index: Int defined in org.jetbrains.kotlin.codegen.generateParameterNames[LocalVariableDescriptor]

'when (kind) {
            JvmMethodParameterKind.ENUM_NAME_OR_ORDINAL -> Opcodes.ACC_SYNTHETIC
            JvmMethodParameterKind.RECEIVER -> Opcodes.ACC_MANDATED
            JvmMethodParameterKind.OUTER -> Opcodes.ACC_MANDATED
            JvmMethodParameterKind.VALUE -> 0

            JvmMethodParameterKind.CONSTRUCTOR_MARKER,
            JvmMethodParameterKind.SUPER_CALL_PARAM,
            JvmMethodParameterKind.CAPTURED_LOCAL_VARIABLE,
            JvmMethodParameterKind.THIS -> Opcodes.ACC_SYNTHETIC
        }' @ [66:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int, entry4: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'kind' @ [66:28] ==> val kind: JvmMethodParameterKind defined in org.jetbrains.kotlin.codegen.generateParameterNames[LocalVariableDescriptor]

'ENUM_NAME_OR_ORDINAL' @ [67:36] ==> enum entry ENUM_NAME_OR_ORDINAL defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'ACC_SYNTHETIC' @ [67:68] ==> public const final val ACC_SYNTHETIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'RECEIVER' @ [68:36] ==> enum entry RECEIVER defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'ACC_MANDATED' @ [68:56] ==> public const final val ACC_MANDATED: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'OUTER' @ [69:36] ==> enum entry OUTER defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'ACC_MANDATED' @ [69:53] ==> public const final val ACC_MANDATED: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'VALUE' @ [70:36] ==> enum entry VALUE defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'CONSTRUCTOR_MARKER' @ [72:36] ==> enum entry CONSTRUCTOR_MARKER defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'SUPER_CALL_PARAM' @ [73:36] ==> enum entry SUPER_CALL_PARAM defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'CAPTURED_LOCAL_VARIABLE' @ [74:36] ==> enum entry CAPTURED_LOCAL_VARIABLE defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'THIS' @ [75:36] ==> enum entry THIS defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'ACC_SYNTHETIC' @ [75:52] ==> public const final val ACC_SYNTHETIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'mv' @ [78:9] ==> value-parameter mv: MethodVisitor defined in org.jetbrains.kotlin.codegen.generateParameterNames[ValueParameterDescriptorImpl]

'visitParameter' @ [78:12] ==> public open fun visitParameter(p0: (String..String?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'name' @ [78:27] ==> val name: String defined in org.jetbrains.kotlin.codegen.generateParameterNames[LocalVariableDescriptor]

'access' @ [78:33] ==> val access: Int defined in org.jetbrains.kotlin.codegen.generateParameterNames[LocalVariableDescriptor]

