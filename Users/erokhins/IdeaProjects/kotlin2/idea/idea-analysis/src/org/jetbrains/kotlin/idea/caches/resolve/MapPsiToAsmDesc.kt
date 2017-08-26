'when (type) {
        PsiType.VOID -> primitive(VOID_TYPE)

        PsiType.BOOLEAN -> primitive(BOOLEAN_TYPE)

        PsiType.CHAR -> primitive(CHAR_TYPE)
        PsiType.INT -> primitive(INT_TYPE)
        PsiType.BYTE -> primitive(BYTE_TYPE)
        PsiType.SHORT -> primitive(SHORT_TYPE)
        PsiType.LONG -> primitive(LONG_TYPE)

        PsiType.FLOAT -> primitive(FLOAT_TYPE)
        PsiType.DOUBLE -> primitive(DOUBLE_TYPE)

        is PsiArrayType -> "[" + typeDesc(type.componentType)

        is PsiClassType -> {
            val resolved = type.resolve()
            when (resolved) {
                is PsiTypeParameter -> resolved.superTypes.firstOrNull()?.let { typeDesc(it) } ?: "Ljava/lang/Object;"
                is PsiClass -> classDesc(resolved)
                null -> unknownSignature()
                else -> error("Resolved to unexpected $resolved of class ${resolved::class.java}" )
            }

        }
        else -> error("Unexpected type $type of class ${type::class.java}")
    }' @ [25:43] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String, entry6: String, entry7: String, entry8: String, entry9: String, entry10: String, entry11: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'type' @ [25:49] ==> value-parameter type: PsiType defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.typeDesc[ValueParameterDescriptorImpl]

'VOID' @ [26:17] ==> public final val VOID: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'primitive' @ [26:25] ==> private final fun primitive(asmType: Type): (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'VOID_TYPE' @ [26:35] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'BOOLEAN' @ [28:17] ==> public final val BOOLEAN: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'primitive' @ [28:28] ==> private final fun primitive(asmType: Type): (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'BOOLEAN_TYPE' @ [28:38] ==> public final val BOOLEAN_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'CHAR' @ [30:17] ==> public final val CHAR: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'primitive' @ [30:25] ==> private final fun primitive(asmType: Type): (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'CHAR_TYPE' @ [30:35] ==> public final val CHAR_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'INT' @ [31:17] ==> public final val INT: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'primitive' @ [31:24] ==> private final fun primitive(asmType: Type): (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'INT_TYPE' @ [31:34] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'BYTE' @ [32:17] ==> public final val BYTE: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'primitive' @ [32:25] ==> private final fun primitive(asmType: Type): (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'BYTE_TYPE' @ [32:35] ==> public final val BYTE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'SHORT' @ [33:17] ==> public final val SHORT: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'primitive' @ [33:26] ==> private final fun primitive(asmType: Type): (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'SHORT_TYPE' @ [33:36] ==> public final val SHORT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'LONG' @ [34:17] ==> public final val LONG: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'primitive' @ [34:25] ==> private final fun primitive(asmType: Type): (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'LONG_TYPE' @ [34:35] ==> public final val LONG_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'FLOAT' @ [36:17] ==> public final val FLOAT: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'primitive' @ [36:26] ==> private final fun primitive(asmType: Type): (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'FLOAT_TYPE' @ [36:36] ==> public final val FLOAT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'DOUBLE' @ [37:17] ==> public final val DOUBLE: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'primitive' @ [37:27] ==> private final fun primitive(asmType: Type): (String..String?) defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'DOUBLE_TYPE' @ [37:37] ==> public final val DOUBLE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'+' @ [39:28] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'typeDesc' @ [39:34] ==> public final fun typeDesc(type: PsiType): String defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'type' @ [39:43] ==> value-parameter type: PsiType defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.typeDesc[ValueParameterDescriptorImpl]

'componentType' @ [39:48] ==> public final val PsiArrayType.componentType: PsiType[MyPropertyDescriptor]

'type' @ [42:28] ==> value-parameter type: PsiType defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.typeDesc[ValueParameterDescriptorImpl]

'resolve' @ [42:33] ==> @Nullable public abstract fun resolve(): PsiClass? defined in com.intellij.psi.PsiClassType[JavaMethodDescriptor]

'when (resolved) {
                is PsiTypeParameter -> resolved.superTypes.firstOrNull()?.let { typeDesc(it) } ?: "Ljava/lang/Object;"
                is PsiClass -> classDesc(resolved)
                null -> unknownSignature()
                else -> error("Resolved to unexpected $resolved of class ${resolved::class.java}" )
            }' @ [43:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'resolved' @ [43:19] ==> val resolved: PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.typeDesc[LocalVariableDescriptor]

'resolved' @ [44:40] ==> val resolved: PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.typeDesc[LocalVariableDescriptor]

'superTypes' @ [44:49] ==> public final val PsiTypeParameter.superTypes: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>)[MyPropertyDescriptor]

'firstOrNull' @ [44:60] ==> public fun <T> Array<out (PsiClassType..PsiClassType?)>.firstOrNull(): PsiClassType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClassType..com.intellij.psi.PsiClassType?)

'let' @ [44:75] ==> @InlineOnly public inline fun <T, R> PsiClassType.let(block: (PsiClassType) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClassType
    <R> -> String

'typeDesc' @ [44:81] ==> public final fun typeDesc(type: PsiType): String defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'it' @ [44:90] ==> value-parameter it: PsiClassType defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.typeDesc.<anonymous>[ValueParameterDescriptorImpl]

'classDesc' @ [45:32] ==> private final fun classDesc(psiClass: PsiClass): String defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'resolved' @ [45:42] ==> val resolved: PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.typeDesc[LocalVariableDescriptor]

'unknownSignature' @ [46:25] ==> private final fun unknownSignature(): String defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'error' @ [47:25] ==> private final fun error(message: String): String defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'resolved' @ [47:56] ==> val resolved: PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.typeDesc[LocalVariableDescriptor]

'resolved' @ [47:76] ==> val resolved: PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.typeDesc[LocalVariableDescriptor]

'java' @ [47:92] ==> public val <T> KClass<out PsiClass>.java: Class<out PsiClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out PsiClass)

'error' @ [51:17] ==> private final fun error(message: String): String defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'type' @ [51:41] ==> value-parameter type: PsiType defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.typeDesc[ValueParameterDescriptorImpl]

'type' @ [51:57] ==> value-parameter type: PsiType defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.typeDesc[ValueParameterDescriptorImpl]

'java' @ [51:69] ==> public val <T> KClass<out PsiType>.java: Class<out PsiType> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out PsiType)

'buildString' @ [54:49] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [55:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'generateSequence' @ [56:23] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: PsiClass?, nextFunction: (PsiClass) -> PsiClass?): Sequence<PsiClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiClass

'psiClass' @ [56:40] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.classDesc[ValueParameterDescriptorImpl]

'it' @ [56:52] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.classDesc.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [56:55] ==> public final val PsiClass.containingClass: PsiClass?[MyPropertyDescriptor]

'toList' @ [56:73] ==> public fun <T> Sequence<PsiClass>.toList(): List<PsiClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'reversed' @ [56:82] ==> public fun <T> Iterable<PsiClass>.reversed(): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'append' @ [57:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'classes' @ [57:16] ==> val classes: List<PsiClass> defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.classDesc.<anonymous>[LocalVariableDescriptor]

'first' @ [57:24] ==> public fun <T> List<PsiClass>.first(): PsiClass defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'qualifiedName' @ [57:32] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'replace' @ [57:48] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'classes' @ [58:9] ==> val classes: List<PsiClass> defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.classDesc.<anonymous>[LocalVariableDescriptor]

'drop' @ [58:17] ==> public fun <T> Iterable<PsiClass>.drop(n: Int): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'forEach' @ [58:25] ==> @HidesMembers public inline fun <T> Iterable<PsiClass>.forEach(action: (PsiClass) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'append' @ [59:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [60:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [60:20] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.classDesc.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [60:23] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'append' @ [62:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'buildString' @ [65:52] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [66:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'psiMethod' @ [67:9] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.methodDesc[ValueParameterDescriptorImpl]

'parameterList' @ [67:19] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [67:33] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'forEach' @ [67:44] ==> public inline fun <T> Array<out (PsiParameter..PsiParameter?)>.forEach(action: ((PsiParameter..PsiParameter?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'append' @ [68:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'typeDesc' @ [68:20] ==> public final fun typeDesc(type: PsiType): String defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'it' @ [68:29] ==> value-parameter it: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.methodDesc.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [68:32] ==> public final val PsiParameter.type: PsiType[MyPropertyDescriptor]

'append' @ [70:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'psiMethod' @ [71:9] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.methodDesc[ValueParameterDescriptorImpl]

'returnType' @ [71:19] ==> public final val PsiMethod.returnType: PsiType?[MyPropertyDescriptor]

'let' @ [71:31] ==> @InlineOnly public inline fun <T, R> PsiType.let(block: (PsiType) -> (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiType
    <R> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'append' @ [72:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'typeDesc' @ [72:20] ==> public final fun typeDesc(type: PsiType): String defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'it' @ [72:29] ==> value-parameter it: PsiType defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.methodDesc.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'unknownSignature' @ [74:19] ==> private final fun unknownSignature(): String defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'LOG' @ [79:9] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[PropertyDescriptorImpl]

'error' @ [79:13] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'message' @ [79:19] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.error[ValueParameterDescriptorImpl]

'unknownSignature' @ [80:16] ==> private final fun unknownSignature(): String defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[SimpleFunctionDescriptorImpl]

'asmType' @ [82:44] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc.primitive[ValueParameterDescriptorImpl]

'descriptor' @ [82:52] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'getInstance' @ [84:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'this' @ [84:42] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.MapPsiToAsmDesc[LazyClassReceiverParameterDescriptor]

'java' @ [84:54] ==> public val <T> KClass<out MapPsiToAsmDesc>.java: Class<out MapPsiToAsmDesc> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out MapPsiToAsmDesc)

