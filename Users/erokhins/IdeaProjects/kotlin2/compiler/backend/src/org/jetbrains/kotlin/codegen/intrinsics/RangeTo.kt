'IntrinsicMethod' @ [27:17] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethod[JavaClassConstructorDescriptor]

'rangeType' @ [29:22] ==> value-parameter rangeType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.rangeTypeToPrimitiveType[ValueParameterDescriptorImpl]

'internalName' @ [29:32] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'fqName' @ [30:20] ==> val fqName: (String..String?) defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.rangeTypeToPrimitiveType[LocalVariableDescriptor]

'substringAfter' @ [30:27] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substringBefore' @ [30:60] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (name) {
            "Double" -> DOUBLE_TYPE
            "Float" -> FLOAT_TYPE
            "Long" -> LONG_TYPE
            "Int" -> INT_TYPE
            "Short" -> SHORT_TYPE
            "Char" -> CHAR_TYPE
            "Byte" -> BYTE_TYPE
            else -> throw IllegalStateException("RangeTo intrinsic can only work for primitive types: $fqName")
        }' @ [31:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type, entry1: Type, entry2: Type, entry3: Type, entry4: Type, entry5: Type, entry6: Type, entry7: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type

'name' @ [31:22] ==> val name: String defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.rangeTypeToPrimitiveType[LocalVariableDescriptor]

'DOUBLE_TYPE' @ [32:25] ==> public final val DOUBLE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'FLOAT_TYPE' @ [33:24] ==> public final val FLOAT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'LONG_TYPE' @ [34:23] ==> public final val LONG_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'INT_TYPE' @ [35:22] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'SHORT_TYPE' @ [36:24] ==> public final val SHORT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'CHAR_TYPE' @ [37:23] ==> public final val CHAR_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'BYTE_TYPE' @ [38:23] ==> public final val BYTE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'IllegalStateException' @ [39:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'fqName' @ [39:104] ==> val fqName: (String..String?) defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.rangeTypeToPrimitiveType[LocalVariableDescriptor]

'rangeTypeToPrimitiveType' @ [44:23] ==> private final fun rangeTypeToPrimitiveType(rangeType: Type): Type defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo[SimpleFunctionDescriptorImpl]

'method' @ [44:48] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable[ValueParameterDescriptorImpl]

'returnType' @ [44:55] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'IntrinsicCallable' @ [45:25] ==> public constructor IntrinsicCallable(returnType: Type, valueParameterTypes: List<Type>, dispatchReceiverType: Type?, extensionReceiverType: Type?, invoke: IntrinsicCallable.(v: InstructionAdapter) -> Unit = ...) defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicCallable[ClassConstructorDescriptorImpl]

'method' @ [46:17] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable[ValueParameterDescriptorImpl]

'returnType' @ [46:24] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'method' @ [47:17] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable[ValueParameterDescriptorImpl]

'valueParameterTypes' @ [47:24] ==> public open val valueParameterTypes: List<Type> defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'map' @ [47:44] ==> public inline fun <T, R> Iterable<Type>.map(transform: (Type) -> Type): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> Type

'argType' @ [47:50] ==> val argType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable[LocalVariableDescriptor]

'nullOr' @ [48:17] ==> public open fun nullOr(type: (Type..Type?), newType: (Type..Type?)): (Type..Type?) defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo[JavaMethodDescriptor]

'method' @ [48:24] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable[ValueParameterDescriptorImpl]

'dispatchReceiverType' @ [48:31] ==> public open val dispatchReceiverType: Type? defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'argType' @ [48:53] ==> val argType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable[LocalVariableDescriptor]

'nullOr' @ [49:17] ==> public open fun nullOr(type: (Type..Type?), newType: (Type..Type?)): (Type..Type?) defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo[JavaMethodDescriptor]

'method' @ [49:24] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable[ValueParameterDescriptorImpl]

'extensionReceiverType' @ [49:31] ==> public open val extensionReceiverType: Type? defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'argType' @ [49:54] ==> val argType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable[LocalVariableDescriptor]

'v' @ [52:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable.<no name provided>.afterReceiverGeneration[ValueParameterDescriptorImpl]

'generateNewInstanceDupAndPlaceBeforeStackTop' @ [52:19] ==> public fun InstructionAdapter.generateNewInstanceDupAndPlaceBeforeStackTop(frameMap: FrameMap, topStackType: Type, newInstanceInternalName: String): Unit defined in org.jetbrains.kotlin.codegen in file codegenUtil.kt[SimpleFunctionDescriptorImpl]

'frameMap' @ [52:64] ==> value-parameter frameMap: FrameMap defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable.<no name provided>.afterReceiverGeneration[ValueParameterDescriptorImpl]

'argType' @ [52:74] ==> val argType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable[LocalVariableDescriptor]

'returnType' @ [52:83] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable.<no name provided>[PropertyDescriptorImpl]

'internalName' @ [52:94] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'v' @ [56:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable.<no name provided>.invokeIntrinsic[ValueParameterDescriptorImpl]

'invokespecial' @ [56:19] ==> public open fun invokespecial(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'returnType' @ [56:33] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable.<no name provided>[PropertyDescriptorImpl]

'internalName' @ [56:44] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'getMethodDescriptor' @ [56:73] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'VOID_TYPE' @ [56:98] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'argType' @ [56:109] ==> val argType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable[LocalVariableDescriptor]

'argType' @ [56:118] ==> val argType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.RangeTo.toCallable[LocalVariableDescriptor]

