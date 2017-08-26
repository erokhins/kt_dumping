'IntrinsicMethod' @ [25:19] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethod[JavaClassConstructorDescriptor]

'when (type) {
            Type.INT_TYPE, Type.CHAR_TYPE -> v.invokestatic(IntrinsicMethods.INTRINSICS_CLASS_NAME, "compare", "(II)I", false)
            Type.LONG_TYPE -> v.invokestatic(IntrinsicMethods.INTRINSICS_CLASS_NAME, "compare", "(JJ)I", false)
            Type.FLOAT_TYPE -> v.invokestatic("java/lang/Float", "compare", "(FF)I", false)
            Type.DOUBLE_TYPE -> v.invokestatic("java/lang/Double", "compare", "(DD)I", false)
            else -> throw UnsupportedOperationException()
        }' @ [27:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'type' @ [27:15] ==> value-parameter type: Type? defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo.genInvoke[ValueParameterDescriptorImpl]

'INT_TYPE' @ [28:18] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'CHAR_TYPE' @ [28:33] ==> public final val CHAR_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [28:46] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo.genInvoke[ValueParameterDescriptorImpl]

'invokestatic' @ [28:48] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'INTRINSICS_CLASS_NAME' @ [28:78] ==> public const final val INTRINSICS_CLASS_NAME: String defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethods[JavaPropertyDescriptor]

'LONG_TYPE' @ [29:18] ==> public final val LONG_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [29:31] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo.genInvoke[ValueParameterDescriptorImpl]

'invokestatic' @ [29:33] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'INTRINSICS_CLASS_NAME' @ [29:63] ==> public const final val INTRINSICS_CLASS_NAME: String defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethods[JavaPropertyDescriptor]

'FLOAT_TYPE' @ [30:18] ==> public final val FLOAT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [30:32] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo.genInvoke[ValueParameterDescriptorImpl]

'invokestatic' @ [30:34] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'DOUBLE_TYPE' @ [31:18] ==> public final val DOUBLE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [31:33] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo.genInvoke[ValueParameterDescriptorImpl]

'invokestatic' @ [31:35] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'UnsupportedOperationException' @ [32:27] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'comparisonOperandType' @ [37:29] ==> public open fun comparisonOperandType(left: (Type..Type?), right: (Type..Type?)): (Type..Type?) defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'method' @ [38:17] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo.toCallable[ValueParameterDescriptorImpl]

'dispatchReceiverType' @ [38:24] ==> public open val dispatchReceiverType: Type? defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'method' @ [38:48] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo.toCallable[ValueParameterDescriptorImpl]

'extensionReceiverType' @ [38:55] ==> public open val extensionReceiverType: Type? defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'method' @ [39:17] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo.toCallable[ValueParameterDescriptorImpl]

'parameterTypes' @ [39:24] ==> public open val parameterTypes: Array<Type> defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'single' @ [39:39] ==> public fun <T> Array<out Type>.single(): Type defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'createBinaryIntrinsicCallable' @ [41:16] ==> public fun createBinaryIntrinsicCallable(returnType: Type, valueParameterType: Type, thisType: Type? = ..., receiverType: Type? = ..., lambda: IntrinsicCallable.(v: InstructionAdapter) -> Unit): IntrinsicCallable defined in org.jetbrains.kotlin.codegen.intrinsics[SimpleFunctionDescriptorImpl]

'method' @ [41:46] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo.toCallable[ValueParameterDescriptorImpl]

'returnType' @ [41:53] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'parameterType' @ [41:65] ==> val parameterType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo.toCallable[LocalVariableDescriptor]

'parameterType' @ [41:80] ==> val parameterType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo.toCallable[LocalVariableDescriptor]

'genInvoke' @ [42:13] ==> private final fun genInvoke(type: Type?, v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo[SimpleFunctionDescriptorImpl]

'parameterType' @ [42:23] ==> val parameterType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo.toCallable[LocalVariableDescriptor]

'it' @ [42:38] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.CompareTo.toCallable.<anonymous>[ValueParameterDescriptorImpl]

