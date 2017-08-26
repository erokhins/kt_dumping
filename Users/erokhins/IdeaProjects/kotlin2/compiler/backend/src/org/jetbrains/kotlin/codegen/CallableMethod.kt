'==' @ [40:50] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'INVOKEINTERFACE' @ [40:58] ==> public const final val INVOKEINTERFACE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'invokeOpcode' @ [40:77] ==> value-parameter invokeOpcode: Int defined in org.jetbrains.kotlin.codegen.CallableMethod.<init>[ValueParameterDescriptorImpl]

'signature' @ [43:13] ==> private final val signature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'valueParameters' @ [43:23] ==> public final val JvmMethodSignature.valueParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>)[MyPropertyDescriptor]

'signature' @ [46:17] ==> private final val signature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'valueParameters' @ [46:27] ==> public final val JvmMethodSignature.valueParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>)[MyPropertyDescriptor]

'filter' @ [46:43] ==> public inline fun <T> Iterable<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>.filter(predicate: ((JvmMethodParameterSignature..JvmMethodParameterSignature?)) -> Boolean): List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterSignature..org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterSignature?)

'it' @ [46:52] ==> value-parameter it: (JvmMethodParameterSignature..JvmMethodParameterSignature?) defined in org.jetbrains.kotlin.codegen.CallableMethod.<get-valueParameterTypes>.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [46:55] ==> public final val JvmMethodParameterSignature.kind: JvmMethodParameterKind[MyPropertyDescriptor]

'VALUE' @ [46:86] ==> enum entry VALUE defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'map' @ [46:94] ==> public inline fun <T, R> Iterable<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>.map(transform: ((JvmMethodParameterSignature..JvmMethodParameterSignature?)) -> Type): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterSignature..org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterSignature?)
    <R> -> Type

'it' @ [46:100] ==> value-parameter it: (JvmMethodParameterSignature..JvmMethodParameterSignature?) defined in org.jetbrains.kotlin.codegen.CallableMethod.<get-valueParameterTypes>.<anonymous>[ValueParameterDescriptorImpl]

'asmType' @ [46:103] ==> public final val JvmMethodParameterSignature.asmType: Type[MyPropertyDescriptor]

'signature' @ [49:13] ==> private final val signature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'asmMethod' @ [49:23] ==> public final val JvmMethodSignature.asmMethod: Method[MyPropertyDescriptor]

'getAsmMethod' @ [52:17] ==> public final fun getAsmMethod(): Method defined in org.jetbrains.kotlin.codegen.CallableMethod[SimpleFunctionDescriptorImpl]

'argumentTypes' @ [52:32] ==> public final val Method.argumentTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'v' @ [56:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.CallableMethod.genInvokeInstruction[ValueParameterDescriptorImpl]

'visitMethodInsn' @ [56:11] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'invokeOpcode' @ [57:17] ==> private final val invokeOpcode: Int defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'owner' @ [58:17] ==> public open val owner: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'internalName' @ [58:23] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'getAsmMethod' @ [59:17] ==> public final fun getAsmMethod(): Method defined in org.jetbrains.kotlin.codegen.CallableMethod[SimpleFunctionDescriptorImpl]

'name' @ [59:32] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'getAsmMethod' @ [60:17] ==> public final fun getAsmMethod(): Method defined in org.jetbrains.kotlin.codegen.CallableMethod[SimpleFunctionDescriptorImpl]

'descriptor' @ [60:32] ==> public final val Method.descriptor: (String..String?)[MyPropertyDescriptor]

'isInterfaceMethod' @ [61:17] ==> private final val isInterfaceMethod: Boolean defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'defaultImplOwner' @ [66:13] ==> private final val defaultImplOwner: Type? defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'IllegalStateException' @ [67:19] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'getAsmMethod' @ [70:22] ==> public final fun getAsmMethod(): Method defined in org.jetbrains.kotlin.codegen.CallableMethod[SimpleFunctionDescriptorImpl]

'if ("<init>" == method.name) {
            v.visitMethodInsn(INVOKESPECIAL, defaultImplOwner.internalName, "<init>", defaultMethodDesc, false)
        }
        else {
            v.visitMethodInsn(INVOKESTATIC, defaultImplOwner.internalName,
                              method.name + JvmAbi.DEFAULT_PARAMS_IMPL_SUFFIX, defaultMethodDesc, false)

            StackValue.coerce(Type.getReturnType(defaultMethodDesc), Type.getReturnType(signature.asmMethod.descriptor), v)
        }' @ [72:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'==' @ [72:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'method' @ [72:25] ==> val method: Method defined in org.jetbrains.kotlin.codegen.CallableMethod.genInvokeDefaultInstruction[LocalVariableDescriptor]

'name' @ [72:32] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'v' @ [73:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.CallableMethod.genInvokeDefaultInstruction[ValueParameterDescriptorImpl]

'visitMethodInsn' @ [73:15] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'INVOKESPECIAL' @ [73:31] ==> public const final val INVOKESPECIAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'defaultImplOwner' @ [73:46] ==> private final val defaultImplOwner: Type? defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'internalName' @ [73:63] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'defaultMethodDesc' @ [73:87] ==> private final val defaultMethodDesc: String defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'v' @ [76:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.CallableMethod.genInvokeDefaultInstruction[ValueParameterDescriptorImpl]

'visitMethodInsn' @ [76:15] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'INVOKESTATIC' @ [76:31] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'defaultImplOwner' @ [76:45] ==> private final val defaultImplOwner: Type? defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'internalName' @ [76:62] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'method' @ [77:31] ==> val method: Method defined in org.jetbrains.kotlin.codegen.CallableMethod.genInvokeDefaultInstruction[LocalVariableDescriptor]

'name' @ [77:38] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'DEFAULT_PARAMS_IMPL_SUFFIX' @ [77:52] ==> public const final val DEFAULT_PARAMS_IMPL_SUFFIX: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'defaultMethodDesc' @ [77:80] ==> private final val defaultMethodDesc: String defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'coerce' @ [79:24] ==> public open fun coerce(@NotNull fromType: Type, @NotNull toType: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'getReturnType' @ [79:36] ==> public open fun getReturnType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'defaultMethodDesc' @ [79:50] ==> private final val defaultMethodDesc: String defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'getReturnType' @ [79:75] ==> public open fun getReturnType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'signature' @ [79:89] ==> private final val signature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'asmMethod' @ [79:99] ==> public final val JvmMethodSignature.asmMethod: Method[MyPropertyDescriptor]

'descriptor' @ [79:109] ==> public final val Method.descriptor: (String..String?)[MyPropertyDescriptor]

'v' @ [79:122] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.CallableMethod.genInvokeDefaultInstruction[ValueParameterDescriptorImpl]

'signature' @ [84:17] ==> private final val signature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'returnType' @ [84:27] ==> public final val JvmMethodSignature.returnType: Type[MyPropertyDescriptor]

'invokeOpcode' @ [87:13] ==> private final val invokeOpcode: Int defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'INVOKESTATIC' @ [87:29] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'Printer.OPCODES[invokeOpcode]' @ [90:16] ==> public final operator fun get(index: Int): (String..String?) defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'OPCODES' @ [90:24] ==> public final val OPCODES: (Array<(String..String?)>..Array<out (String..String?)>?) defined in org.jetbrains.org.objectweb.asm.util.Printer[JavaPropertyDescriptor]

'invokeOpcode' @ [90:32] ==> private final val invokeOpcode: Int defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'owner' @ [90:48] ==> public open val owner: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'signature' @ [90:55] ==> private final val signature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

