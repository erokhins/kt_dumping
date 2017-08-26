'IntrinsicMethod' @ [30:17] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod[ClassConstructorDescriptorImpl]

'rangeType' @ [32:22] ==> value-parameter rangeType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.rangeTypeToPrimitiveType[ValueParameterDescriptorImpl]

'internalName' @ [32:32] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'fqName' @ [33:20] ==> val fqName: (String..String?) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.rangeTypeToPrimitiveType[LocalVariableDescriptor]

'substringAfter' @ [33:27] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substringBefore' @ [33:60] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (name) {
            "Double" -> DOUBLE_TYPE
            "Float" -> FLOAT_TYPE
            "Long" -> LONG_TYPE
            "Int" -> INT_TYPE
            "Short" -> SHORT_TYPE
            "Char" -> CHAR_TYPE
            "Byte" -> BYTE_TYPE
            else -> throw IllegalStateException("RangeTo intrinsic can only work for primitive types: $fqName")
        }' @ [34:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type, entry1: Type, entry2: Type, entry3: Type, entry4: Type, entry5: Type, entry6: Type, entry7: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type

'name' @ [34:22] ==> val name: String defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.rangeTypeToPrimitiveType[LocalVariableDescriptor]

'DOUBLE_TYPE' @ [35:25] ==> public final val DOUBLE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'FLOAT_TYPE' @ [36:24] ==> public final val FLOAT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'LONG_TYPE' @ [37:23] ==> public final val LONG_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'INT_TYPE' @ [38:22] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'SHORT_TYPE' @ [39:24] ==> public final val SHORT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'CHAR_TYPE' @ [40:23] ==> public final val CHAR_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'BYTE_TYPE' @ [41:23] ==> public final val BYTE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'IllegalStateException' @ [42:27] ==> public constructor IllegalStateException(p0: (String..String?)) defined in java.lang.IllegalStateException[JavaClassConstructorDescriptor]

'fqName' @ [42:104] ==> val fqName: (String..String?) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.rangeTypeToPrimitiveType[LocalVariableDescriptor]

'rangeTypeToPrimitiveType' @ [47:23] ==> private final fun rangeTypeToPrimitiveType(rangeType: Type): Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo[SimpleFunctionDescriptorImpl]

'signature' @ [47:48] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable[ValueParameterDescriptorImpl]

'returnType' @ [47:58] ==> public final val JvmMethodSignature.returnType: Type[MyPropertyDescriptor]

'IrIntrinsicFunction' @ [48:24] ==> public constructor IrIntrinsicFunction(expression: IrMemberAccessExpression, signature: JvmMethodSignature, context: JvmBackendContext, argsTypes: List<Type> = ...) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[ClassConstructorDescriptorImpl]

'expression' @ [48:44] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable[ValueParameterDescriptorImpl]

'signature' @ [48:56] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable[ValueParameterDescriptorImpl]

'context' @ [48:67] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable[ValueParameterDescriptorImpl]

'listOf' @ [48:76] ==> public fun <T> listOf(element: Type): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'argType' @ [48:83] ==> val argType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable[LocalVariableDescriptor]

'signature' @ [48:94] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable[ValueParameterDescriptorImpl]

'valueParameters' @ [48:104] ==> public final val JvmMethodSignature.valueParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>)[MyPropertyDescriptor]

'map' @ [48:120] ==> public inline fun <T, R> Iterable<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>.map(transform: ((JvmMethodParameterSignature..JvmMethodParameterSignature?)) -> Type): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterSignature..org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterSignature?)
    <R> -> Type

'argType' @ [48:126] ==> val argType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable[LocalVariableDescriptor]

'v' @ [50:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable.<no name provided>.genInvokeInstruction[ValueParameterDescriptorImpl]

'invokespecial' @ [50:19] ==> public open fun invokespecial(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'signature' @ [50:33] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable[ValueParameterDescriptorImpl]

'returnType' @ [50:43] ==> public final val JvmMethodSignature.returnType: Type[MyPropertyDescriptor]

'internalName' @ [50:54] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'getMethodDescriptor' @ [50:83] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'VOID_TYPE' @ [50:108] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'argType' @ [50:119] ==> val argType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable[LocalVariableDescriptor]

'argType' @ [50:128] ==> val argType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable[LocalVariableDescriptor]

'v' @ [54:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'anew' @ [54:19] ==> public open fun anew(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'returnType' @ [54:24] ==> public open val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable.<no name provided>[PropertyDescriptorImpl]

'v' @ [55:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'dup' @ [55:19] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'super' @ [56:24] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable.<no name provided>[LazyClassReceiverParameterDescriptor]

'invoke' @ [56:30] ==> public open fun invoke(v: InstructionAdapter, codegen: ExpressionCodegen, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[SimpleFunctionDescriptorImpl]

'v' @ [56:37] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'codegen' @ [56:40] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'data' @ [56:49] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.intrinsics.RangeTo.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

