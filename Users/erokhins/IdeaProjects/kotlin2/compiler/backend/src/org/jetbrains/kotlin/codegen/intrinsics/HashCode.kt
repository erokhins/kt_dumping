'IntrinsicMethod' @ [28:52] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethod[JavaClassConstructorDescriptor]

'method' @ [30:28] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.toCallable[ValueParameterDescriptorImpl]

'dispatchReceiverType' @ [30:35] ==> public open val dispatchReceiverType: Type? defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'method' @ [30:59] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.toCallable[ValueParameterDescriptorImpl]

'extensionReceiverType' @ [30:66] ==> public open val extensionReceiverType: Type? defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'error' @ [30:91] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'method' @ [30:125] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.toCallable[ValueParameterDescriptorImpl]

'JvmTarget' @ [31:33] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JVM_1_6' @ [31:43] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'jvmTarget' @ [31:54] ==> private final val jvmTarget: JvmTarget defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode[PropertyDescriptorImpl]

'!' @ [31:67] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPrimitive' @ [31:76] ==> public open fun isPrimitive(type: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'receiverType' @ [31:88] ==> val receiverType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.toCallable[LocalVariableDescriptor]

'IntrinsicCallable' @ [32:25] ==> public constructor IntrinsicCallable(returnType: Type, valueParameterTypes: List<Type>, dispatchReceiverType: Type?, extensionReceiverType: Type?, invoke: IntrinsicCallable.(v: InstructionAdapter) -> Unit = ...) defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicCallable[ClassConstructorDescriptorImpl]

'INT_TYPE' @ [33:22] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'emptyList' @ [34:17] ==> public fun <T> emptyList(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'if (useObjectHashCode) nullOrObject(method.dispatchReceiverType) else method.dispatchReceiverType' @ [35:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type?, elseBranch: Type?): Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type?

'useObjectHashCode' @ [35:21] ==> val useObjectHashCode: Boolean defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.toCallable[LocalVariableDescriptor]

'nullOrObject' @ [35:40] ==> public open fun nullOrObject(type: (Type..Type?)): (Type..Type?) defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode[JavaMethodDescriptor]

'method' @ [35:53] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.toCallable[ValueParameterDescriptorImpl]

'dispatchReceiverType' @ [35:60] ==> public open val dispatchReceiverType: Type? defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'method' @ [35:87] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.toCallable[ValueParameterDescriptorImpl]

'dispatchReceiverType' @ [35:94] ==> public open val dispatchReceiverType: Type? defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'if (useObjectHashCode) nullOrObject(method.extensionReceiverType) else method.extensionReceiverType' @ [36:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type?, elseBranch: Type?): Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type?

'useObjectHashCode' @ [36:21] ==> val useObjectHashCode: Boolean defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.toCallable[LocalVariableDescriptor]

'nullOrObject' @ [36:40] ==> public open fun nullOrObject(type: (Type..Type?)): (Type..Type?) defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode[JavaMethodDescriptor]

'method' @ [36:53] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.toCallable[ValueParameterDescriptorImpl]

'extensionReceiverType' @ [36:60] ==> public open val extensionReceiverType: Type? defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'method' @ [36:88] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.toCallable[ValueParameterDescriptorImpl]

'extensionReceiverType' @ [36:95] ==> public open val extensionReceiverType: Type? defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'v' @ [39:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.toCallable.<no name provided>.invokeIntrinsic[ValueParameterDescriptorImpl]

'invokeHashCode' @ [39:19] ==> public final fun InstructionAdapter.invokeHashCode(type: Type): Unit defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.Companion[SimpleFunctionDescriptorImpl]

'if (useObjectHashCode) AsmTypes.OBJECT_TYPE else receiverType' @ [39:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Type..Type?), elseBranch: (Type..Type?)): (Type..Type?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)

'useObjectHashCode' @ [39:38] ==> val useObjectHashCode: Boolean defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.toCallable[LocalVariableDescriptor]

'OBJECT_TYPE' @ [39:66] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'receiverType' @ [39:83] ==> val receiverType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.toCallable[LocalVariableDescriptor]

'if (AsmUtil.isPrimitive(type)) {
                val boxedType = AsmUtil.boxType(type)
                visitMethodInsn(Opcodes.INVOKESTATIC, boxedType.internalName, "hashCode", Type.getMethodDescriptor(Type.INT_TYPE, type), false)
            }
            else {
                visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false)
            }' @ [46:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isPrimitive' @ [46:25] ==> public open fun isPrimitive(type: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'type' @ [46:37] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.Companion.invokeHashCode[ValueParameterDescriptorImpl]

'boxType' @ [47:41] ==> @NotNull public open fun boxType(@NotNull type: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'type' @ [47:49] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.Companion.invokeHashCode[ValueParameterDescriptorImpl]

'visitMethodInsn' @ [48:17] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'INVOKESTATIC' @ [48:41] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'boxedType' @ [48:55] ==> val boxedType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.Companion.invokeHashCode[LocalVariableDescriptor]

'internalName' @ [48:65] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'getMethodDescriptor' @ [48:96] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'INT_TYPE' @ [48:121] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'type' @ [48:131] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.HashCode.Companion.invokeHashCode[ValueParameterDescriptorImpl]

'visitMethodInsn' @ [51:17] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'INVOKEVIRTUAL' @ [51:41] ==> public const final val INVOKEVIRTUAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

