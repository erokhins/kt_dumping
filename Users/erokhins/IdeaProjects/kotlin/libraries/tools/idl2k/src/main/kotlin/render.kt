'commented' @ [24:9] ==> value-parameter commented: Boolean = ... defined in org.jetbrains.idl2k.indent[ValueParameterDescriptorImpl]

'append' @ [25:9] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'..' @ [27:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'level' @ [27:18] ==> value-parameter level: Int defined in org.jetbrains.idl2k.indent[ValueParameterDescriptorImpl]

'append' @ [28:9] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'if (arg.vararg) {
        append("vararg ")
    }
    else {
        when (modality) {
            MemberModality.OVERRIDE -> append("override ")
            MemberModality.ABSTRACT -> append("abstract ")
            MemberModality.OPEN -> append("open ")
            MemberModality.FINAL -> {}
        }
    }' @ [33:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'arg' @ [33:9] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.renderAttributeDeclaration[ValueParameterDescriptorImpl]

'vararg' @ [33:13] ==> public final var vararg: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'append' @ [34:9] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'when (modality) {
            MemberModality.OVERRIDE -> append("override ")
            MemberModality.ABSTRACT -> append("abstract ")
            MemberModality.OPEN -> append("open ")
            MemberModality.FINAL -> {}
        }' @ [37:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Any..Any?), entry1: (Any..Any?), entry2: (Any..Any?), entry3: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'modality' @ [37:15] ==> value-parameter modality: MemberModality defined in org.jetbrains.idl2k.renderAttributeDeclaration[ValueParameterDescriptorImpl]

'OVERRIDE' @ [38:28] ==> enum entry OVERRIDE defined in org.jetbrains.idl2k.MemberModality[FakeCallableDescriptorForObject]

'append' @ [38:40] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'ABSTRACT' @ [39:28] ==> enum entry ABSTRACT defined in org.jetbrains.idl2k.MemberModality[FakeCallableDescriptorForObject]

'append' @ [39:40] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'OPEN' @ [40:28] ==> enum entry OPEN defined in org.jetbrains.idl2k.MemberModality[FakeCallableDescriptorForObject]

'append' @ [40:36] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'FINAL' @ [41:28] ==> enum entry FINAL defined in org.jetbrains.idl2k.MemberModality[FakeCallableDescriptorForObject]

'append' @ [45:5] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'when(arg.kind) {
        AttributeKind.VAL -> "val "
        AttributeKind.VAR -> "var "
        AttributeKind.ARGUMENT -> ""
    }' @ [45:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'arg' @ [45:17] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.renderAttributeDeclaration[ValueParameterDescriptorImpl]

'kind' @ [45:21] ==> public final val kind: AttributeKind defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'VAL' @ [46:23] ==> enum entry VAL defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'VAR' @ [47:23] ==> enum entry VAR defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'ARGUMENT' @ [48:23] ==> enum entry ARGUMENT defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'append' @ [50:5] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'arg' @ [50:12] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.renderAttributeDeclaration[ValueParameterDescriptorImpl]

'name' @ [50:16] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'replaceKeywords' @ [50:21] ==> private fun String.replaceKeywords(): String defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'append' @ [51:5] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'append' @ [52:5] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'arg' @ [52:12] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.renderAttributeDeclaration[ValueParameterDescriptorImpl]

'type' @ [52:16] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'render' @ [52:21] ==> public abstract fun render(): String defined in org.jetbrains.idl2k.Type[SimpleFunctionDescriptorImpl]

'arg' @ [53:9] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.renderAttributeDeclaration[ValueParameterDescriptorImpl]

'initializer' @ [53:13] ==> public final val initializer: String? defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'omitDefaults' @ [54:13] ==> value-parameter omitDefaults: Boolean = ... defined in org.jetbrains.idl2k.renderAttributeDeclaration[ValueParameterDescriptorImpl]

'append' @ [55:13] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'append' @ [58:9] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'append' @ [59:9] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'arg' @ [59:16] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.renderAttributeDeclaration[ValueParameterDescriptorImpl]

'initializer' @ [59:20] ==> public final val initializer: String? defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'replaceWrongConstants' @ [59:32] ==> private fun String.replaceWrongConstants(type: Type): String defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'arg' @ [59:54] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.renderAttributeDeclaration[ValueParameterDescriptorImpl]

'type' @ [59:58] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'omitDefaults' @ [61:13] ==> value-parameter omitDefaults: Boolean = ... defined in org.jetbrains.idl2k.renderAttributeDeclaration[ValueParameterDescriptorImpl]

'append' @ [62:13] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'indent' @ [68:5] ==> private fun <O : Appendable /* = Appendable */> Appendable /* = Appendable */.indent(commented: Boolean = ..., level: Int): Unit defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <O : Appendable /* = Appendable */> -> Appendable

'commented' @ [68:12] ==> value-parameter commented: Boolean defined in org.jetbrains.idl2k.renderAttributeDeclarationAsProperty[ValueParameterDescriptorImpl]

'level' @ [68:23] ==> value-parameter level: Int defined in org.jetbrains.idl2k.renderAttributeDeclarationAsProperty[ValueParameterDescriptorImpl]

'arg' @ [70:9] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.renderAttributeDeclarationAsProperty[ValueParameterDescriptorImpl]

'name' @ [70:13] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'keywords' @ [70:21] ==> private val keywords: Set<String> defined in org.jetbrains.idl2k in file render.kt[PropertyDescriptorImpl]

'append' @ [71:9] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'arg' @ [71:29] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.renderAttributeDeclarationAsProperty[ValueParameterDescriptorImpl]

'name' @ [71:33] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'renderAttributeDeclaration' @ [74:5] ==> private fun Appendable /* = Appendable */.renderAttributeDeclaration(arg: GenerateAttribute, modality: MemberModality, omitDefaults: Boolean = ...): Unit defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'arg' @ [74:32] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.renderAttributeDeclarationAsProperty[ValueParameterDescriptorImpl]

'modality' @ [74:37] ==> value-parameter modality: MemberModality defined in org.jetbrains.idl2k.renderAttributeDeclarationAsProperty[ValueParameterDescriptorImpl]

'omitDefaults' @ [74:47] ==> value-parameter omitDefaults: Boolean = ... defined in org.jetbrains.idl2k.renderAttributeDeclarationAsProperty[ValueParameterDescriptorImpl]

'appendln' @ [76:5] ==> public fun Appendable /* = Appendable */.appendln(): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arg' @ [77:9] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.renderAttributeDeclarationAsProperty[ValueParameterDescriptorImpl]

'getterNoImpl' @ [77:13] ==> public val GenerateAttribute.getterNoImpl: Boolean defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'indent' @ [78:9] ==> private fun <O : Appendable /* = Appendable */> Appendable /* = Appendable */.indent(commented: Boolean = ..., level: Int): Unit defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <O : Appendable /* = Appendable */> -> Appendable

'commented' @ [78:16] ==> value-parameter commented: Boolean defined in org.jetbrains.idl2k.renderAttributeDeclarationAsProperty[ValueParameterDescriptorImpl]

'level' @ [78:27] ==> value-parameter level: Int defined in org.jetbrains.idl2k.renderAttributeDeclarationAsProperty[ValueParameterDescriptorImpl]

'appendln' @ [79:9] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arg' @ [81:9] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.renderAttributeDeclarationAsProperty[ValueParameterDescriptorImpl]

'setterNoImpl' @ [81:13] ==> public val GenerateAttribute.setterNoImpl: Boolean defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'indent' @ [82:9] ==> private fun <O : Appendable /* = Appendable */> Appendable /* = Appendable */.indent(commented: Boolean = ..., level: Int): Unit defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <O : Appendable /* = Appendable */> -> Appendable

'commented' @ [82:16] ==> value-parameter commented: Boolean defined in org.jetbrains.idl2k.renderAttributeDeclarationAsProperty[ValueParameterDescriptorImpl]

'level' @ [82:27] ==> value-parameter level: Int defined in org.jetbrains.idl2k.renderAttributeDeclarationAsProperty[ValueParameterDescriptorImpl]

'appendln' @ [83:9] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'setOf' @ [87:24] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'if (this.startsWith("0x")) BigInteger(this.substring(2), 16) else BigInteger(this)' @ [89:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BigInteger, elseBranch: BigInteger): BigInteger[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BigInteger

'this' @ [89:34] ==> <this> defined in org.jetbrains.idl2k.parse[ReceiverParameterDescriptorImpl]

'startsWith' @ [89:39] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'BigInteger' @ [89:57] ==> public constructor BigInteger(p0: (String..String?), p1: Int) defined in java.math.BigInteger[JavaClassConstructorDescriptor]

'this' @ [89:68] ==> <this> defined in org.jetbrains.idl2k.parse[ReceiverParameterDescriptorImpl]

'substring' @ [89:73] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'BigInteger' @ [89:96] ==> public constructor BigInteger(p0: (String..String?)) defined in java.math.BigInteger[JavaClassConstructorDescriptor]

'this' @ [89:107] ==> <this> defined in org.jetbrains.idl2k.parse[ReceiverParameterDescriptorImpl]

'when {
    this == "null" && type.nullable -> "null"
    this == "definedExternally" || type is SimpleType && type.type == "Int" && parse() > BigInteger.valueOf(Int.MAX_VALUE.toLong()) -> "definedExternally"
    type is SimpleType && type.type == "Double" && this.matches("[0-9]+".toRegex()) -> "${this}.0"
    else -> this
}' @ [90:56] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'this' @ [91:5] ==> <this> defined in org.jetbrains.idl2k.replaceWrongConstants[ReceiverParameterDescriptorImpl]

'type' @ [91:23] ==> value-parameter type: Type defined in org.jetbrains.idl2k.replaceWrongConstants[ValueParameterDescriptorImpl]

'nullable' @ [91:28] ==> public abstract val nullable: Boolean defined in org.jetbrains.idl2k.Type[PropertyDescriptorImpl]

'this' @ [92:5] ==> <this> defined in org.jetbrains.idl2k.replaceWrongConstants[ReceiverParameterDescriptorImpl]

'type' @ [92:36] ==> value-parameter type: Type defined in org.jetbrains.idl2k.replaceWrongConstants[ValueParameterDescriptorImpl]

'type' @ [92:58] ==> value-parameter type: Type defined in org.jetbrains.idl2k.replaceWrongConstants[ValueParameterDescriptorImpl]

'type' @ [92:63] ==> public final val type: String defined in org.jetbrains.idl2k.SimpleType[PropertyDescriptorImpl]

'parse' @ [92:80] ==> private fun String.parse(): BigInteger defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'valueOf' @ [92:101] ==> public open fun valueOf(p0: Long): (BigInteger..BigInteger?) defined in java.math.BigInteger[JavaMethodDescriptor]

'MAX_VALUE' @ [92:113] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'toLong' @ [92:123] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'type' @ [93:5] ==> value-parameter type: Type defined in org.jetbrains.idl2k.replaceWrongConstants[ValueParameterDescriptorImpl]

'type' @ [93:27] ==> value-parameter type: Type defined in org.jetbrains.idl2k.replaceWrongConstants[ValueParameterDescriptorImpl]

'type' @ [93:32] ==> public final val type: String defined in org.jetbrains.idl2k.SimpleType[PropertyDescriptorImpl]

'this' @ [93:52] ==> <this> defined in org.jetbrains.idl2k.replaceWrongConstants[ReceiverParameterDescriptorImpl]

'matches' @ [93:57] ==> @InlineOnly public infix inline fun CharSequence.matches(regex: Regex): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [93:74] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [93:91] ==> <this> defined in org.jetbrains.idl2k.replaceWrongConstants[ReceiverParameterDescriptorImpl]

'this' @ [94:13] ==> <this> defined in org.jetbrains.idl2k.replaceWrongConstants[ReceiverParameterDescriptorImpl]

'if (this in keywords) this + "_" else this' @ [96:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [96:44] ==> <this> defined in org.jetbrains.idl2k.replaceKeywords[ReceiverParameterDescriptorImpl]

'keywords' @ [96:52] ==> private val keywords: Set<String> defined in org.jetbrains.idl2k in file render.kt[PropertyDescriptorImpl]

'this' @ [96:62] ==> <this> defined in org.jetbrains.idl2k.replaceKeywords[ReceiverParameterDescriptorImpl]

'this' @ [96:78] ==> <this> defined in org.jetbrains.idl2k.replaceKeywords[ReceiverParameterDescriptorImpl]

'args' @ [99:9] ==> value-parameter args: List<GenerateAttribute> defined in org.jetbrains.idl2k.renderArgumentsDeclaration[ValueParameterDescriptorImpl]

'joinTo' @ [99:14] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<GenerateAttribute>.joinTo(buffer: Appendable /* = Appendable */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((GenerateAttribute) -> CharSequence)? = ...): Appendable /* = Appendable */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <A : Appendable /* = Appendable */> -> Appendable

'this' @ [99:21] ==> <this> defined in org.jetbrains.idl2k.renderArgumentsDeclaration[ReceiverParameterDescriptorImpl]

'StringBuilder' @ [100:13] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'apply' @ [100:29] ==> @InlineOnly public inline fun <T> StringBuilder /* = StringBuilder */.apply(block: StringBuilder /* = StringBuilder */.() -> Unit): StringBuilder /* = StringBuilder */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder

'renderAttributeDeclaration' @ [100:37] ==> private fun Appendable /* = Appendable */.renderAttributeDeclaration(arg: GenerateAttribute, modality: MemberModality, omitDefaults: Boolean = ...): Unit defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'it' @ [100:64] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.renderArgumentsDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'if (it.override) MemberModality.OVERRIDE else MemberModality.FINAL' @ [100:68] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MemberModality, elseBranch: MemberModality): MemberModality[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MemberModality

'it' @ [100:72] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.renderArgumentsDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'override' @ [100:75] ==> public final val override: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'OVERRIDE' @ [100:100] ==> enum entry OVERRIDE defined in org.jetbrains.idl2k.MemberModality[FakeCallableDescriptorForObject]

'FINAL' @ [100:129] ==> enum entry FINAL defined in org.jetbrains.idl2k.MemberModality[FakeCallableDescriptorForObject]

'omitDefaults' @ [100:136] ==> value-parameter omitDefaults: Boolean = ... defined in org.jetbrains.idl2k.renderArgumentsDeclaration[ValueParameterDescriptorImpl]

'call' @ [103:57] ==> value-parameter call: GenerateFunctionCall defined in org.jetbrains.idl2k.renderCall[ValueParameterDescriptorImpl]

'name' @ [103:62] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateFunctionCall[PropertyDescriptorImpl]

'replaceKeywords' @ [103:67] ==> private fun String.replaceKeywords(): String defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'call' @ [103:88] ==> value-parameter call: GenerateFunctionCall defined in org.jetbrains.idl2k.renderCall[ValueParameterDescriptorImpl]

'arguments' @ [103:93] ==> public final val arguments: List<String> defined in org.jetbrains.idl2k.GenerateFunctionCall[PropertyDescriptorImpl]

'joinToString' @ [103:103] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [103:146] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'replaceKeywords' @ [103:154] ==> private fun String.replaceKeywords(): String defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'indent' @ [106:5] ==> private fun <O : Appendable /* = Appendable */> Appendable /* = Appendable */.indent(commented: Boolean = ..., level: Int): Unit defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <O : Appendable /* = Appendable */> -> Appendable

'commented' @ [106:12] ==> value-parameter commented: Boolean defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'level' @ [106:23] ==> value-parameter level: Int = ... defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'f' @ [108:9] ==> value-parameter f: GenerateFunction defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'nativeGetterOrSetter' @ [108:11] ==> public final val nativeGetterOrSetter: NativeGetterOrSetter defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'NONE' @ [108:56] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'append' @ [109:9] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'override' @ [111:9] ==> value-parameter override: Boolean defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'append' @ [112:9] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'f' @ [114:9] ==> value-parameter f: GenerateFunction defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'nativeGetterOrSetter' @ [114:11] ==> public final val nativeGetterOrSetter: NativeGetterOrSetter defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'NONE' @ [114:56] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'append' @ [115:9] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'f' @ [118:9] ==> value-parameter f: GenerateFunction defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'name' @ [118:11] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'keywords' @ [118:19] ==> private val keywords: Set<String> defined in org.jetbrains.idl2k in file render.kt[PropertyDescriptorImpl]

'append' @ [119:9] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'f' @ [119:29] ==> value-parameter f: GenerateFunction defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'name' @ [119:31] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'append' @ [121:5] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'f' @ [122:9] ==> value-parameter f: GenerateFunction defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'nativeGetterOrSetter' @ [122:11] ==> public final val nativeGetterOrSetter: NativeGetterOrSetter defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'NONE' @ [122:56] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'append' @ [123:9] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'owner' @ [123:18] ==> value-parameter owner: String defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'append' @ [125:5] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'f' @ [125:12] ==> value-parameter f: GenerateFunction defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'name' @ [125:14] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'replaceKeywords' @ [125:19] ==> private fun String.replaceKeywords(): String defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'renderArgumentsDeclaration' @ [126:5] ==> private fun Appendable /* = Appendable */.renderArgumentsDeclaration(args: List<GenerateAttribute>, omitDefaults: Boolean = ...): Appendable /* = Appendable */ defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'f' @ [126:32] ==> value-parameter f: GenerateFunction defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'arguments' @ [126:34] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'override' @ [126:45] ==> value-parameter override: Boolean defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'append' @ [127:5] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'f' @ [127:17] ==> value-parameter f: GenerateFunction defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'returnType' @ [127:19] ==> public final val returnType: Type defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'render' @ [127:30] ==> public abstract fun render(): String defined in org.jetbrains.idl2k.Type[SimpleFunctionDescriptorImpl]

'when (f.nativeGetterOrSetter) {
        NativeGetterOrSetter.GETTER -> {
            append(" = asDynamic()[${f.arguments[0].name}]")
        }
        NativeGetterOrSetter.SETTER -> {
            append(" { asDynamic()[${f.arguments[0].name}] = ${f.arguments[1].name}; }")
        }
        NativeGetterOrSetter.NONE -> {}
    }' @ [129:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Any..Any?), entry1: (Any..Any?), entry2: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'f' @ [129:11] ==> value-parameter f: GenerateFunction defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'nativeGetterOrSetter' @ [129:13] ==> public final val nativeGetterOrSetter: NativeGetterOrSetter defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'GETTER' @ [130:30] ==> enum entry GETTER defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'append' @ [131:13] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'f' @ [131:38] ==> value-parameter f: GenerateFunction defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'arguments' @ [131:40] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'name' @ [131:53] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'SETTER' @ [133:30] ==> enum entry SETTER defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'append' @ [134:13] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'f' @ [134:38] ==> value-parameter f: GenerateFunction defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'arguments' @ [134:40] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'name' @ [134:53] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'f' @ [134:64] ==> value-parameter f: GenerateFunction defined in org.jetbrains.idl2k.renderFunctionDeclaration[ValueParameterDescriptorImpl]

'arguments' @ [134:66] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'name' @ [134:79] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'NONE' @ [136:30] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'appendln' @ [139:5] ==> public fun Appendable /* = Appendable */.appendln(): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'none' @ [142:51] ==> public inline fun <T> Iterable<GenerateAttribute>.none(predicate: (GenerateAttribute) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'it' @ [142:58] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.hasNoVars.<anonymous>[ValueParameterDescriptorImpl]

'isVar' @ [142:61] ==> public val GenerateAttribute.isVar: Boolean defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'in' @ [144:61] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'parent' @ [144:63] ==> value-parameter parent: String defined in org.jetbrains.idl2k.isCommented[ValueParameterDescriptorImpl]

'name' @ [144:71] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'commentOutDeclarations' @ [144:80] ==> public val commentOutDeclarations: Set<String> defined in org.jetbrains.idl2k in file config.kt[PropertyDescriptorImpl]

'in' @ [144:106] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'parent' @ [144:108] ==> value-parameter parent: String defined in org.jetbrains.idl2k.isCommented[ValueParameterDescriptorImpl]

'name' @ [144:116] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'type' @ [144:124] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'render' @ [144:129] ==> public abstract fun render(): String defined in org.jetbrains.idl2k.Type[SimpleFunctionDescriptorImpl]

'commentOutDeclarations' @ [144:143] ==> public val commentOutDeclarations: Set<String> defined in org.jetbrains.idl2k in file config.kt[PropertyDescriptorImpl]

'in' @ [146:9] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'parent' @ [146:11] ==> value-parameter parent: String defined in org.jetbrains.idl2k.isCommented[ValueParameterDescriptorImpl]

'name' @ [146:19] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'commentOutDeclarations' @ [146:28] ==> public val commentOutDeclarations: Set<String> defined in org.jetbrains.idl2k in file config.kt[PropertyDescriptorImpl]

'in' @ [146:54] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'parent' @ [146:56] ==> value-parameter parent: String defined in org.jetbrains.idl2k.isCommented[ValueParameterDescriptorImpl]

'name' @ [146:64] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'arguments' @ [146:71] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'size' @ [146:81] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'commentOutDeclarations' @ [146:92] ==> public val commentOutDeclarations: Set<String> defined in org.jetbrains.idl2k in file config.kt[PropertyDescriptorImpl]

'in' @ [147:97] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'owner' @ [147:99] ==> value-parameter owner: String defined in org.jetbrains.idl2k.isRequiredFunctionArgument[ValueParameterDescriptorImpl]

'functionName' @ [147:106] ==> value-parameter functionName: String defined in org.jetbrains.idl2k.isRequiredFunctionArgument[ValueParameterDescriptorImpl]

'name' @ [147:120] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'requiredArguments' @ [147:129] ==> public val requiredArguments: Set<String> defined in org.jetbrains.idl2k in file config.kt[PropertyDescriptorImpl]

'copy' @ [148:69] ==> public final fun copy(name: String = ..., returnType: Type = ..., arguments: List<GenerateAttribute> = ..., nativeGetterOrSetter: NativeGetterOrSetter = ..., static: Boolean = ..., override: Boolean = ...): GenerateFunction defined in org.jetbrains.idl2k.GenerateFunction[SimpleFunctionDescriptorImpl]

'arguments' @ [148:86] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'map' @ [148:96] ==> public inline fun <T, R> Iterable<GenerateAttribute>.map(transform: (GenerateAttribute) -> GenerateAttribute): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <R> -> GenerateAttribute

'arg' @ [148:109] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.fixRequiredArguments.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [148:113] ==> public final fun copy(name: String = ..., type: Type = ..., initializer: String? = ..., getterSetterNoImpl: Boolean = ..., kind: AttributeKind = ..., override: Boolean = ..., vararg: Boolean = ..., static: Boolean = ..., required: Boolean = ...): GenerateAttribute defined in org.jetbrains.idl2k.GenerateAttribute[SimpleFunctionDescriptorImpl]

'if (arg.isRequiredFunctionArgument(parent, name)) null else arg.initializer' @ [148:132] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'arg' @ [148:136] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.fixRequiredArguments.<anonymous>[ValueParameterDescriptorImpl]

'isRequiredFunctionArgument' @ [148:140] ==> private fun GenerateAttribute.isRequiredFunctionArgument(owner: String, functionName: String): Boolean defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'parent' @ [148:167] ==> value-parameter parent: String defined in org.jetbrains.idl2k.fixRequiredArguments[ValueParameterDescriptorImpl]

'name' @ [148:175] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'arg' @ [148:192] ==> value-parameter arg: GenerateAttribute defined in org.jetbrains.idl2k.fixRequiredArguments.<anonymous>[ValueParameterDescriptorImpl]

'initializer' @ [148:196] ==> public final val initializer: String? defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'iface' @ [151:64] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [151:70] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'mdnCache' @ [152:9] ==> value-parameter mdnCache: MDNDocumentationCache? = ... defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'checkInCache' @ [152:19] ==> public final fun checkInCache(url: String): Boolean? defined in org.jetbrains.idl2k.MDNDocumentationCache[SimpleFunctionDescriptorImpl]

'url' @ [152:32] ==> val url: String defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'appendln' @ [153:9] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [154:9] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'iface' @ [154:48] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [154:54] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'url' @ [154:62] ==> val url: String defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'appendln' @ [155:9] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'allTypes' @ [158:28] ==> value-parameter allTypes: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'keys' @ [158:37] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'enums' @ [158:44] ==> value-parameter enums: List<EnumDefinition> defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'map' @ [158:50] ==> public inline fun <T, R> Iterable<EnumDefinition>.map(transform: (EnumDefinition) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EnumDefinition
    <R> -> String

'it' @ [158:56] ==> value-parameter it: EnumDefinition defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [158:59] ==> public final val name: String defined in org.jetbrains.idl2k.EnumDefinition[PropertyDescriptorImpl]

'append' @ [160:5] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'markerAnnotation' @ [161:9] ==> value-parameter markerAnnotation: Boolean = ... defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'append' @ [162:9] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'when (iface.kind) {
        GenerateDefinitionKind.CLASS -> append("open class ")
        GenerateDefinitionKind.ABSTRACT_CLASS -> append("abstract class ")
        GenerateDefinitionKind.INTERFACE -> append("interface ")
    }' @ [164:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Appendable..Appendable?), entry1: (Appendable..Appendable?), entry2: (Appendable..Appendable?)): (Appendable..Appendable?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (java.lang.Appendable..java.lang.Appendable?)

'iface' @ [164:11] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'kind' @ [164:17] ==> public final val kind: GenerateDefinitionKind defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'CLASS' @ [165:32] ==> enum entry CLASS defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'append' @ [165:41] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'ABSTRACT_CLASS' @ [166:32] ==> enum entry ABSTRACT_CLASS defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'append' @ [166:50] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'INTERFACE' @ [167:32] ==> enum entry INTERFACE defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'append' @ [167:45] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'iface' @ [170:25] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'allSuperTypes' @ [170:31] ==> public fun GenerateTraitOrClass.allSuperTypes(all: Map<String, GenerateTraitOrClass>): List<GenerateTraitOrClass> defined in org.jetbrains.idl2k in file typeMappings.kt[SimpleFunctionDescriptorImpl]

'allTypes' @ [170:45] ==> value-parameter allTypes: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'kotlinBuiltinInterfaces' @ [170:56] ==> public val kotlinBuiltinInterfaces: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k in file config.kt[PropertyDescriptorImpl]

'allSuperTypes' @ [171:30] ==> val allSuperTypes: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'map' @ [171:44] ==> public inline fun <T, R> Iterable<GenerateTraitOrClass>.map(transform: (GenerateTraitOrClass) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass
    <R> -> String

'it' @ [171:50] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [171:53] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'toSet' @ [171:60] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'append' @ [173:5] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'iface' @ [173:12] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [173:18] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'iface' @ [174:19] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'primaryConstructor' @ [174:25] ==> public final val primaryConstructor: ConstructorWithSuperTypeCall? defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'primary' @ [175:9] ==> val primary: ConstructorWithSuperTypeCall? defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'primary' @ [175:29] ==> val primary: ConstructorWithSuperTypeCall? defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'constructor' @ [175:37] ==> public final val constructor: GenerateFunction defined in org.jetbrains.idl2k.ConstructorWithSuperTypeCall[PropertyDescriptorImpl]

'arguments' @ [175:49] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'isNotEmpty' @ [175:59] ==> @InlineOnly public inline fun <T> Collection<GenerateAttribute>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'iface' @ [175:75] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'secondaryConstructors' @ [175:81] ==> public final val secondaryConstructors: List<ConstructorWithSuperTypeCall> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'isNotEmpty' @ [175:103] ==> @InlineOnly public inline fun <T> Collection<ConstructorWithSuperTypeCall>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorWithSuperTypeCall

'renderArgumentsDeclaration' @ [176:9] ==> private fun Appendable /* = Appendable */.renderArgumentsDeclaration(args: List<GenerateAttribute>, omitDefaults: Boolean = ...): Appendable /* = Appendable */ defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'primary' @ [176:36] ==> val primary: ConstructorWithSuperTypeCall? defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'constructor' @ [176:44] ==> public final val constructor: GenerateFunction defined in org.jetbrains.idl2k.ConstructorWithSuperTypeCall[PropertyDescriptorImpl]

'fixRequiredArguments' @ [176:56] ==> private fun GenerateFunction.fixRequiredArguments(parent: String): GenerateFunction defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'iface' @ [176:77] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [176:83] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'arguments' @ [176:89] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'dynamicIfUnknownType' @ [176:99] ==> public fun List<GenerateAttribute>.dynamicIfUnknownType(allTypes: Set<String>, standardTypes: Set<Type> = ...): List<GenerateAttribute> defined in org.jetbrains.idl2k in file model.kt[SimpleFunctionDescriptorImpl]

'allTypesAndEnums' @ [176:120] ==> val allTypesAndEnums: Set<String> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'inheritanceExclude' @ [179:29] ==> public val inheritanceExclude: Map<String, Set<String>> defined in org.jetbrains.idl2k in file config.kt[PropertyDescriptorImpl]

'iface' @ [179:48] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [179:54] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'emptySet' @ [179:63] ==> public fun <T> emptySet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'iface' @ [181:21] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'superTypes' @ [181:27] ==> public final val superTypes: List<String> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'filter' @ [181:38] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [181:47] ==> value-parameter it: String defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'allSuperTypesNames' @ [181:53] ==> val allSuperTypesNames: Set<String> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'filter' @ [181:74] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [181:83] ==> value-parameter it: String defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'superTypesExclude' @ [181:90] ==> val superTypesExclude: Set<String> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'typeNamesToUnions' @ [182:22] ==> value-parameter typeNamesToUnions: Map<String, List<String>> defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'iface' @ [182:40] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [182:46] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'emptyList' @ [182:55] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'iface' @ [183:22] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'superTypes' @ [183:28] ==> public final val superTypes: List<String> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'filter' @ [183:39] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [183:48] ==> value-parameter it: String defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'substringBefore' @ [183:51] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'kotlinBuiltinInterfaces' @ [183:75] ==> public val kotlinBuiltinInterfaces: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k in file config.kt[PropertyDescriptorImpl]

'superTypesWithCalls' @ [185:9] ==> val superTypesWithCalls: List<String> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'isNotEmpty' @ [185:29] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'superTypesWithCalls' @ [186:9] ==> val superTypesWithCalls: List<String> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'joinTo' @ [186:29] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<String>.joinTo(buffer: Appendable /* = Appendable */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): Appendable /* = Appendable */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <A : Appendable /* = Appendable */> -> Appendable

'this' @ [186:36] ==> <this> defined in org.jetbrains.idl2k.render[ReceiverParameterDescriptorImpl]

'appendln' @ [189:5] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'iface' @ [191:5] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'secondaryConstructors' @ [191:11] ==> public final val secondaryConstructors: List<ConstructorWithSuperTypeCall> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'forEach' @ [191:33] ==> @HidesMembers public inline fun <T> Iterable<ConstructorWithSuperTypeCall>.forEach(action: (ConstructorWithSuperTypeCall) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorWithSuperTypeCall

'indent' @ [192:9] ==> private fun <O : Appendable /* = Appendable */> Appendable /* = Appendable */.indent(commented: Boolean = ..., level: Int): Unit defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <O : Appendable /* = Appendable */> -> Appendable

'append' @ [193:9] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'renderArgumentsDeclaration' @ [194:9] ==> private fun Appendable /* = Appendable */.renderArgumentsDeclaration(args: List<GenerateAttribute>, omitDefaults: Boolean = ...): Appendable /* = Appendable */ defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'secondary' @ [194:36] ==> value-parameter secondary: ConstructorWithSuperTypeCall defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [194:46] ==> public final val constructor: GenerateFunction defined in org.jetbrains.idl2k.ConstructorWithSuperTypeCall[PropertyDescriptorImpl]

'fixRequiredArguments' @ [194:58] ==> private fun GenerateFunction.fixRequiredArguments(parent: String): GenerateFunction defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'iface' @ [194:79] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [194:85] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'arguments' @ [194:91] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'dynamicIfUnknownType' @ [194:101] ==> public fun List<GenerateAttribute>.dynamicIfUnknownType(allTypes: Set<String>, standardTypes: Set<Type> = ...): List<GenerateAttribute> defined in org.jetbrains.idl2k in file model.kt[SimpleFunctionDescriptorImpl]

'allTypesAndEnums' @ [194:122] ==> val allTypesAndEnums: Set<String> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'appendln' @ [196:9] ==> public fun Appendable /* = Appendable */.appendln(): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'allSuperTypes' @ [199:27] ==> val allSuperTypes: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'flatMap' @ [199:41] ==> public inline fun <T, R> Iterable<GenerateTraitOrClass>.flatMap(transform: (GenerateTraitOrClass) -> Iterable<GenerateAttribute>): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass
    <R> -> GenerateAttribute

'it' @ [199:51] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'memberAttributes' @ [199:54] ==> public final val memberAttributes: MutableList<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'distinct' @ [199:73] ==> public fun <T> Iterable<GenerateAttribute>.distinct(): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'superAttributes' @ [200:33] ==> val superAttributes: List<GenerateAttribute> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'groupBy' @ [200:49] ==> public inline fun <T, K> Iterable<GenerateAttribute>.groupBy(keySelector: (GenerateAttribute) -> String): Map<String, List<GenerateAttribute>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <K> -> String

'it' @ [200:59] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [200:62] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'allSuperTypes' @ [201:26] ==> val allSuperTypes: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'flatMap' @ [201:40] ==> public inline fun <T, R> Iterable<GenerateTraitOrClass>.flatMap(transform: (GenerateTraitOrClass) -> Iterable<GenerateFunction>): List<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass
    <R> -> GenerateFunction

'it' @ [201:50] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'memberFunctions' @ [201:53] ==> public final val memberFunctions: MutableList<GenerateFunction> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'distinct' @ [201:71] ==> public fun <T> Iterable<GenerateFunction>.distinct(): List<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'superAttributes' @ [202:27] ==> val superAttributes: List<GenerateAttribute> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'map' @ [202:43] ==> public inline fun <T, R> Iterable<GenerateAttribute>.map(transform: (GenerateAttribute) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <R> -> String

'it' @ [202:49] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [202:52] ==> public val GenerateAttribute.signature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'superFunctions' @ [202:70] ==> val superFunctions: List<GenerateFunction> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'map' @ [202:85] ==> public inline fun <T, R> Iterable<GenerateFunction>.map(transform: (GenerateFunction) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction
    <R> -> String

'it' @ [202:91] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [202:94] ==> public val GenerateFunction.signature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'iface' @ [204:5] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'memberAttributes' @ [204:11] ==> public final val memberAttributes: MutableList<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'filter' @ [205:10] ==> public inline fun <T> Iterable<GenerateAttribute>.filter(predicate: (GenerateAttribute) -> Boolean): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'!' @ [206:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [206:18] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'static' @ [206:21] ==> public final val static: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'it' @ [207:21] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'isVar' @ [207:24] ==> public val GenerateAttribute.isVar: Boolean defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'it' @ [207:34] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'isVal' @ [207:37] ==> public val GenerateAttribute.isVal: Boolean defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'superAttributesByName' @ [207:46] ==> val superAttributesByName: Map<String, List<GenerateAttribute>> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'it' @ [207:68] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [207:71] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'hasNoVars' @ [207:78] ==> private fun List<GenerateAttribute>.hasNoVars(): Boolean defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'map' @ [209:10] ==> public inline fun <T, R> Iterable<GenerateAttribute>.map(transform: (GenerateAttribute) -> GenerateAttribute): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <R> -> GenerateAttribute

'it' @ [209:16] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'dynamicIfUnknownType' @ [209:19] ==> public fun GenerateAttribute.dynamicIfUnknownType(allTypes: Set<String>, standardTypes: Set<Type> = ...): GenerateAttribute defined in org.jetbrains.idl2k in file model.kt[SimpleFunctionDescriptorImpl]

'allTypesAndEnums' @ [209:40] ==> val allTypesAndEnums: Set<String> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'groupBy' @ [210:10] ==> public inline fun <T, K> Iterable<GenerateAttribute>.groupBy(keySelector: (GenerateAttribute) -> String): Map<String, List<GenerateAttribute>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <K> -> String

'it' @ [210:20] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [210:23] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'mapValues' @ [211:10] ==> public inline fun <K, V, R> Map<out String, List<GenerateAttribute>>.mapValues(transform: (Map.Entry<String, List<GenerateAttribute>>) -> List<GenerateAttribute>): Map<String, List<GenerateAttribute>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<GenerateAttribute>
    <R> -> List<GenerateAttribute>

'it' @ [211:22] ==> value-parameter it: Map.Entry<String, List<GenerateAttribute>> defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [211:25] ==> public abstract val value: List<GenerateAttribute> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'filter' @ [211:31] ==> public inline fun <T> Iterable<GenerateAttribute>.filter(predicate: (GenerateAttribute) -> Boolean): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'!in' @ [211:40] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'iface' @ [211:43] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [211:49] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'it' @ [211:57] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [211:60] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'commentOutDeclarations' @ [211:71] ==> public val commentOutDeclarations: Set<String> defined in org.jetbrains.idl2k in file config.kt[PropertyDescriptorImpl]

'!in' @ [211:97] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'iface' @ [211:100] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [211:106] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'it' @ [211:114] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [211:117] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'it' @ [211:126] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [211:129] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'render' @ [211:134] ==> public abstract fun render(): String defined in org.jetbrains.idl2k.Type[SimpleFunctionDescriptorImpl]

'commentOutDeclarations' @ [211:149] ==> public val commentOutDeclarations: Set<String> defined in org.jetbrains.idl2k in file config.kt[PropertyDescriptorImpl]

'filterValues' @ [212:10] ==> public inline fun <K, V> Map<out String, List<GenerateAttribute>>.filterValues(predicate: (List<GenerateAttribute>) -> Boolean): Map<String, List<GenerateAttribute>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<GenerateAttribute>

'it' @ [212:25] ==> value-parameter it: List<GenerateAttribute> defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [212:28] ==> @InlineOnly public inline fun <T> Collection<GenerateAttribute>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'reduceValues' @ [213:10] ==> internal fun <K, V> Map<String, List<GenerateAttribute>>.reduceValues(reduce: (GenerateAttribute, GenerateAttribute) -> GenerateAttribute = ...): Map<String, GenerateAttribute> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> GenerateAttribute

'merge' @ [213:25] ==> private fun merge(a: GenerateAttribute, b: GenerateAttribute): GenerateAttribute defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'values' @ [213:32] ==> public abstract val values: Collection<GenerateAttribute> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'forEach' @ [213:39] ==> @HidesMembers public inline fun <T> Iterable<GenerateAttribute>.forEach(action: (GenerateAttribute) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'when {
                attribute.signature in superSignatures -> MemberModality.OVERRIDE
                iface.kind == GenerateDefinitionKind.CLASS && attribute.isVal -> MemberModality.OPEN
                iface.kind == GenerateDefinitionKind.ABSTRACT_CLASS -> MemberModality.OPEN
                else -> MemberModality.FINAL
            }' @ [214:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MemberModality, entry1: MemberModality, entry2: MemberModality, entry3: MemberModality): MemberModality[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MemberModality

'attribute' @ [215:17] ==> value-parameter attribute: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [215:27] ==> public val GenerateAttribute.signature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'superSignatures' @ [215:40] ==> val superSignatures: List<String> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'OVERRIDE' @ [215:74] ==> enum entry OVERRIDE defined in org.jetbrains.idl2k.MemberModality[FakeCallableDescriptorForObject]

'iface' @ [216:17] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'kind' @ [216:23] ==> public final val kind: GenerateDefinitionKind defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'CLASS' @ [216:54] ==> enum entry CLASS defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'attribute' @ [216:63] ==> value-parameter attribute: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'isVal' @ [216:73] ==> public val GenerateAttribute.isVal: Boolean defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'OPEN' @ [216:97] ==> enum entry OPEN defined in org.jetbrains.idl2k.MemberModality[FakeCallableDescriptorForObject]

'iface' @ [217:17] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'kind' @ [217:23] ==> public final val kind: GenerateDefinitionKind defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'ABSTRACT_CLASS' @ [217:54] ==> enum entry ABSTRACT_CLASS defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'OPEN' @ [217:87] ==> enum entry OPEN defined in org.jetbrains.idl2k.MemberModality[FakeCallableDescriptorForObject]

'FINAL' @ [218:40] ==> enum entry FINAL defined in org.jetbrains.idl2k.MemberModality[FakeCallableDescriptorForObject]

'if (attribute.name in superAttributesByName && attribute.signature !in superSignatures) {
                System.err.println("Property ${iface.name}.${attribute.name} has different type in super type(s) so will not be generated: ")
                for ((superTypeName, attributes) in allSuperTypes.map { it.name to it.memberAttributes.filter { it.name == attribute.name }.distinct() }) {
                    for (superAttribute in attributes) {
                        System.err.println("  $superTypeName.${attribute.name}: ${superAttribute.type.render()}")
                    }
                }
            } else if (modality == MemberModality.OVERRIDE
                    && attribute.kindNotChanged(superAttributesByName)
                    && (iface.kind == GenerateDefinitionKind.INTERFACE || attribute.hasSuperImplementation(allSuperTypes))
            ) {
                // then don't generate
            } else {
                renderAttributeDeclarationAsProperty(attribute,
                        modality = modality,
                        commented = attribute.isCommented(iface.name),
                        omitDefaults = iface.kind == GenerateDefinitionKind.INTERFACE,
                        level = 1
                )
            }' @ [221:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'attribute' @ [221:17] ==> value-parameter attribute: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [221:27] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'superAttributesByName' @ [221:35] ==> val superAttributesByName: Map<String, List<GenerateAttribute>> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'attribute' @ [221:60] ==> value-parameter attribute: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [221:70] ==> public val GenerateAttribute.signature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'superSignatures' @ [221:84] ==> val superSignatures: List<String> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'err' @ [222:24] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [222:28] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'iface' @ [222:48] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [222:54] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'attribute' @ [222:62] ==> value-parameter attribute: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [222:72] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'component1' @ [223:23] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [223:38] ==> public final operator fun component2(): List<GenerateAttribute> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'allSuperTypes' @ [223:53] ==> val allSuperTypes: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'map' @ [223:67] ==> public inline fun <T, R> Iterable<GenerateTraitOrClass>.map(transform: (GenerateTraitOrClass) -> Pair<String, List<GenerateAttribute>>): List<Pair<String, List<GenerateAttribute>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass
    <R> -> Pair<String, List<GenerateAttribute>>

'it' @ [223:73] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [223:76] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'it' @ [223:84] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'memberAttributes' @ [223:87] ==> public final val memberAttributes: MutableList<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'filter' @ [223:104] ==> public inline fun <T> Iterable<GenerateAttribute>.filter(predicate: (GenerateAttribute) -> Boolean): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'it' @ [223:113] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [223:116] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'attribute' @ [223:124] ==> value-parameter attribute: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [223:134] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'distinct' @ [223:141] ==> public fun <T> Iterable<GenerateAttribute>.distinct(): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'attributes' @ [224:44] ==> val attributes: List<GenerateAttribute> defined in org.jetbrains.idl2k.render.<anonymous>[LocalVariableDescriptor]

'err' @ [225:32] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [225:36] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'superTypeName' @ [225:48] ==> val superTypeName: String defined in org.jetbrains.idl2k.render.<anonymous>[LocalVariableDescriptor]

'attribute' @ [225:64] ==> value-parameter attribute: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [225:74] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'superAttribute' @ [225:83] ==> val superAttribute: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[LocalVariableDescriptor]

'type' @ [225:98] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'render' @ [225:103] ==> public abstract fun render(): String defined in org.jetbrains.idl2k.Type[SimpleFunctionDescriptorImpl]

'if (modality == MemberModality.OVERRIDE
                    && attribute.kindNotChanged(superAttributesByName)
                    && (iface.kind == GenerateDefinitionKind.INTERFACE || attribute.hasSuperImplementation(allSuperTypes))
            ) {
                // then don't generate
            } else {
                renderAttributeDeclarationAsProperty(attribute,
                        modality = modality,
                        commented = attribute.isCommented(iface.name),
                        omitDefaults = iface.kind == GenerateDefinitionKind.INTERFACE,
                        level = 1
                )
            }' @ [228:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'modality' @ [228:24] ==> val modality: MemberModality defined in org.jetbrains.idl2k.render.<anonymous>[LocalVariableDescriptor]

'OVERRIDE' @ [228:51] ==> enum entry OVERRIDE defined in org.jetbrains.idl2k.MemberModality[FakeCallableDescriptorForObject]

'attribute' @ [229:24] ==> value-parameter attribute: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'kindNotChanged' @ [229:34] ==> private fun GenerateAttribute.kindNotChanged(superAttributesByName: Map<String, List<GenerateAttribute>>): Boolean defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'superAttributesByName' @ [229:49] ==> val superAttributesByName: Map<String, List<GenerateAttribute>> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'iface' @ [230:25] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'kind' @ [230:31] ==> public final val kind: GenerateDefinitionKind defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'INTERFACE' @ [230:62] ==> enum entry INTERFACE defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'attribute' @ [230:75] ==> value-parameter attribute: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'hasSuperImplementation' @ [230:85] ==> private fun GenerateAttribute.hasSuperImplementation(allSuperTypes: List<GenerateTraitOrClass>): Boolean defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'allSuperTypes' @ [230:108] ==> val allSuperTypes: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'renderAttributeDeclarationAsProperty' @ [234:17] ==> private fun Appendable /* = Appendable */.renderAttributeDeclarationAsProperty(arg: GenerateAttribute, modality: MemberModality, commented: Boolean, level: Int, omitDefaults: Boolean = ...): Unit defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'attribute' @ [234:54] ==> value-parameter attribute: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [235:36] ==> val modality: MemberModality defined in org.jetbrains.idl2k.render.<anonymous>[LocalVariableDescriptor]

'attribute' @ [236:37] ==> value-parameter attribute: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'isCommented' @ [236:47] ==> private fun GenerateAttribute.isCommented(parent: String): Boolean defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'iface' @ [236:59] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [236:65] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'iface' @ [237:40] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'kind' @ [237:46] ==> public final val kind: GenerateDefinitionKind defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'INTERFACE' @ [237:77] ==> enum entry INTERFACE defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'iface' @ [242:27] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'memberFunctions' @ [242:33] ==> public final val memberFunctions: MutableList<GenerateFunction> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'filter' @ [242:49] ==> public inline fun <T> Iterable<GenerateFunction>.filter(predicate: (GenerateFunction) -> Boolean): List<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'it' @ [242:59] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'superFunctions' @ [242:66] ==> val superFunctions: List<GenerateFunction> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'it' @ [242:84] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'override' @ [242:87] ==> public final val override: Boolean defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'!' @ [242:100] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [242:101] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'static' @ [242:104] ==> public final val static: Boolean defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'map' @ [243:14] ==> public inline fun <T, R> Iterable<GenerateFunction>.map(transform: (GenerateFunction) -> GenerateFunction): List<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction
    <R> -> GenerateFunction

'it' @ [243:20] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'dynamicIfUnknownType' @ [243:23] ==> public fun GenerateFunction.dynamicIfUnknownType(allTypes: Set<String>): GenerateFunction defined in org.jetbrains.idl2k in file model.kt[SimpleFunctionDescriptorImpl]

'allTypesAndEnums' @ [243:44] ==> val allTypesAndEnums: Set<String> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'groupBy' @ [243:64] ==> public inline fun <T, K> Iterable<GenerateFunction>.groupBy(keySelector: (GenerateFunction) -> String): Map<String, List<GenerateFunction>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction
    <K> -> String

'it' @ [243:74] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [243:77] ==> public val GenerateFunction.signature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'reduceValues' @ [243:89] ==> internal fun <K, V> Map<String, List<GenerateFunction>>.reduceValues(reduce: (GenerateFunction, GenerateFunction) -> GenerateFunction = ...): Map<String, GenerateFunction> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> GenerateFunction

'betterFunction' @ [243:104] ==> public fun betterFunction(f1: GenerateFunction, f2: GenerateFunction): GenerateFunction defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'values' @ [243:120] ==> public abstract val values: Collection<GenerateFunction> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'renderFunctionDeclaration' @ [246:9] ==> private fun Appendable /* = Appendable */.renderFunctionDeclaration(owner: String, f: GenerateFunction, override: Boolean, commented: Boolean, level: Int = ...): Unit defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'iface' @ [247:17] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [247:23] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'function' @ [247:29] ==> value-parameter function: GenerateFunction defined in org.jetbrains.idl2k.render.doRenderFunction[ValueParameterDescriptorImpl]

'fixRequiredArguments' @ [247:38] ==> private fun GenerateFunction.fixRequiredArguments(parent: String): GenerateFunction defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'iface' @ [247:59] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [247:65] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'function' @ [248:17] ==> value-parameter function: GenerateFunction defined in org.jetbrains.idl2k.render.doRenderFunction[ValueParameterDescriptorImpl]

'signature' @ [248:26] ==> public val GenerateFunction.signature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'superSignatures' @ [248:39] ==> val superSignatures: List<String> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'function' @ [248:58] ==> value-parameter function: GenerateFunction defined in org.jetbrains.idl2k.render.doRenderFunction[ValueParameterDescriptorImpl]

'override' @ [248:67] ==> public final val override: Boolean defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'function' @ [249:29] ==> value-parameter function: GenerateFunction defined in org.jetbrains.idl2k.render.doRenderFunction[ValueParameterDescriptorImpl]

'isCommented' @ [249:38] ==> private fun GenerateFunction.isCommented(parent: String): Boolean defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'iface' @ [249:50] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [249:56] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'level' @ [250:25] ==> value-parameter level: Int = ... defined in org.jetbrains.idl2k.render.doRenderFunction[ValueParameterDescriptorImpl]

'memberFunctions' @ [254:5] ==> val memberFunctions: Collection<GenerateFunction> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'filter' @ [254:21] ==> public inline fun <T> Iterable<GenerateFunction>.filter(predicate: (GenerateFunction) -> Boolean): List<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'it' @ [254:30] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'nativeGetterOrSetter' @ [254:33] ==> public final val nativeGetterOrSetter: NativeGetterOrSetter defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'NONE' @ [254:78] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'forEach' @ [254:85] ==> @HidesMembers public inline fun <T> Iterable<GenerateFunction>.forEach(action: (GenerateFunction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'doRenderFunction' @ [254:95] ==> local final fun doRenderFunction(function: GenerateFunction, level: Int = ...): Unit defined in org.jetbrains.idl2k.render[SimpleFunctionDescriptorImpl]

'it' @ [254:112] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'iface' @ [256:28] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'memberAttributes' @ [256:34] ==> public final val memberAttributes: MutableList<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'filter' @ [256:51] ==> public inline fun <T> Iterable<GenerateAttribute>.filter(predicate: (GenerateAttribute) -> Boolean): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'it' @ [256:60] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'static' @ [256:63] ==> public final val static: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'iface' @ [257:27] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'memberFunctions' @ [257:33] ==> public final val memberFunctions: MutableList<GenerateFunction> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'filter' @ [257:49] ==> public inline fun <T> Iterable<GenerateFunction>.filter(predicate: (GenerateFunction) -> Boolean): List<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'it' @ [257:58] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'static' @ [257:61] ==> public final val static: Boolean defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'iface' @ [259:9] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'constants' @ [259:15] ==> public final val constants: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'isNotEmpty' @ [259:25] ==> @InlineOnly public inline fun <T> Collection<GenerateAttribute>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'staticAttributes' @ [259:41] ==> val staticAttributes: List<GenerateAttribute> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'isNotEmpty' @ [259:58] ==> @InlineOnly public inline fun <T> Collection<GenerateAttribute>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'staticFunctions' @ [259:74] ==> val staticFunctions: List<GenerateFunction> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'isNotEmpty' @ [259:90] ==> @InlineOnly public inline fun <T> Collection<GenerateFunction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'appendln' @ [260:9] ==> public fun Appendable /* = Appendable */.appendln(): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indent' @ [261:9] ==> private fun <O : Appendable /* = Appendable */> Appendable /* = Appendable */.indent(commented: Boolean = ..., level: Int): Unit defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <O : Appendable /* = Appendable */> -> Appendable

'appendln' @ [262:9] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'iface' @ [263:9] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'constants' @ [263:15] ==> public final val constants: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'forEach' @ [263:25] ==> @HidesMembers public inline fun <T> Iterable<GenerateAttribute>.forEach(action: (GenerateAttribute) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'renderAttributeDeclarationAsProperty' @ [264:13] ==> private fun Appendable /* = Appendable */.renderAttributeDeclarationAsProperty(arg: GenerateAttribute, modality: MemberModality, commented: Boolean, level: Int, omitDefaults: Boolean = ...): Unit defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'it' @ [264:50] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'FINAL' @ [264:69] ==> enum entry FINAL defined in org.jetbrains.idl2k.MemberModality[FakeCallableDescriptorForObject]

'it' @ [264:99] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'isCommented' @ [264:102] ==> private fun GenerateAttribute.isCommented(parent: String): Boolean defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'iface' @ [264:114] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [264:120] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'staticAttributes' @ [266:9] ==> val staticAttributes: List<GenerateAttribute> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'forEach' @ [266:26] ==> @HidesMembers public inline fun <T> Iterable<GenerateAttribute>.forEach(action: (GenerateAttribute) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'renderAttributeDeclarationAsProperty' @ [267:13] ==> private fun Appendable /* = Appendable */.renderAttributeDeclarationAsProperty(arg: GenerateAttribute, modality: MemberModality, commented: Boolean, level: Int, omitDefaults: Boolean = ...): Unit defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'it' @ [267:50] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'FINAL' @ [267:69] ==> enum entry FINAL defined in org.jetbrains.idl2k.MemberModality[FakeCallableDescriptorForObject]

'it' @ [267:99] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'isCommented' @ [267:102] ==> private fun GenerateAttribute.isCommented(parent: String): Boolean defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'iface' @ [267:114] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [267:120] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'staticFunctions' @ [269:9] ==> val staticFunctions: List<GenerateFunction> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'forEach' @ [269:25] ==> @HidesMembers public inline fun <T> Iterable<GenerateFunction>.forEach(action: (GenerateFunction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'renderFunctionDeclaration' @ [270:13] ==> private fun Appendable /* = Appendable */.renderFunctionDeclaration(owner: String, f: GenerateFunction, override: Boolean, commented: Boolean, level: Int = ...): Unit defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'iface' @ [270:39] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [270:45] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'it' @ [270:51] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'fixRequiredArguments' @ [270:54] ==> private fun GenerateFunction.fixRequiredArguments(parent: String): GenerateFunction defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'iface' @ [270:75] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [270:81] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'it' @ [270:129] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'isCommented' @ [270:132] ==> private fun GenerateFunction.isCommented(parent: String): Boolean defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'iface' @ [270:144] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [270:150] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'indent' @ [272:9] ==> private fun <O : Appendable /* = Appendable */> Appendable /* = Appendable */.indent(commented: Boolean = ..., level: Int): Unit defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <O : Appendable /* = Appendable */> -> Appendable

'appendln' @ [273:9] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [276:5] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'memberFunctions' @ [277:5] ==> val memberFunctions: Collection<GenerateFunction> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'filter' @ [277:21] ==> public inline fun <T> Iterable<GenerateFunction>.filter(predicate: (GenerateFunction) -> Boolean): List<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'it' @ [277:30] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'nativeGetterOrSetter' @ [277:33] ==> public final val nativeGetterOrSetter: NativeGetterOrSetter defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'NONE' @ [277:78] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'forEach' @ [277:85] ==> @HidesMembers public inline fun <T> Iterable<GenerateFunction>.forEach(action: (GenerateFunction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'doRenderFunction' @ [277:95] ==> local final fun doRenderFunction(function: GenerateFunction, level: Int = ...): Unit defined in org.jetbrains.idl2k.render[SimpleFunctionDescriptorImpl]

'it' @ [277:112] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'appendln' @ [278:5] ==> public fun Appendable /* = Appendable */.appendln(): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'iface' @ [280:9] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'generateBuilderFunction' @ [280:15] ==> public final val generateBuilderFunction: Boolean defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'renderBuilderFunction' @ [281:9] ==> public fun Appendable /* = Appendable */.renderBuilderFunction(dictionary: GenerateTraitOrClass, allSuperTypes: List<GenerateTraitOrClass>, allTypes: Set<String>): Unit defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'iface' @ [281:31] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'allSuperTypes' @ [281:38] ==> val allSuperTypes: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'allTypesAndEnums' @ [281:53] ==> val allTypesAndEnums: Set<String> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'superAttributesByName' @ [285:109] ==> value-parameter superAttributesByName: Map<String, List<GenerateAttribute>> defined in org.jetbrains.idl2k.kindNotChanged[ValueParameterDescriptorImpl]

'name' @ [285:131] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'orEmpty' @ [285:137] ==> @InlineOnly public inline fun <T> List<GenerateAttribute>?.orEmpty(): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'all' @ [285:147] ==> public inline fun <T> Iterable<GenerateAttribute>.all(predicate: (GenerateAttribute) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'it' @ [285:153] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.kindNotChanged.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [285:156] ==> public final val kind: AttributeKind defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'kind' @ [285:164] ==> public final val kind: AttributeKind defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'allSuperTypes' @ [287:99] ==> value-parameter allSuperTypes: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.hasSuperImplementation[ValueParameterDescriptorImpl]

'any' @ [287:113] ==> public inline fun <T> Iterable<GenerateTraitOrClass>.any(predicate: (GenerateTraitOrClass) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass

'st' @ [287:125] ==> value-parameter st: GenerateTraitOrClass defined in org.jetbrains.idl2k.hasSuperImplementation.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [287:128] ==> public final val kind: GenerateDefinitionKind defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'INTERFACE' @ [287:159] ==> enum entry INTERFACE defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'st' @ [287:172] ==> value-parameter st: GenerateTraitOrClass defined in org.jetbrains.idl2k.hasSuperImplementation.<anonymous>[ValueParameterDescriptorImpl]

'memberAttributes' @ [287:175] ==> public final val memberAttributes: MutableList<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'any' @ [287:192] ==> public inline fun <T> Iterable<GenerateAttribute>.any(predicate: (GenerateAttribute) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'it' @ [287:198] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.hasSuperImplementation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [287:201] ==> public val GenerateAttribute.signature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'signature' @ [287:214] ==> public val GenerateAttribute.signature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'dictionary' @ [290:19] ==> value-parameter dictionary: GenerateTraitOrClass defined in org.jetbrains.idl2k.renderBuilderFunction[ValueParameterDescriptorImpl]

'memberAttributes' @ [290:30] ==> public final val memberAttributes: MutableList<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'allSuperTypes' @ [290:49] ==> value-parameter allSuperTypes: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.renderBuilderFunction[ValueParameterDescriptorImpl]

'flatMap' @ [290:63] ==> public inline fun <T, R> Iterable<GenerateTraitOrClass>.flatMap(transform: (GenerateTraitOrClass) -> Iterable<GenerateAttribute>): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass
    <R> -> GenerateAttribute

'it' @ [290:73] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.renderBuilderFunction.<anonymous>[ValueParameterDescriptorImpl]

'memberAttributes' @ [290:76] ==> public final val memberAttributes: MutableList<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'distinctBy' @ [291:14] ==> public inline fun <T, K> Iterable<GenerateAttribute>.distinctBy(selector: (GenerateAttribute) -> String): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <K> -> String

'it' @ [291:27] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.renderBuilderFunction.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [291:30] ==> public val GenerateAttribute.signature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'map' @ [292:14] ==> public inline fun <T, R> Iterable<GenerateAttribute>.map(transform: (GenerateAttribute) -> GenerateAttribute): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <R> -> GenerateAttribute

'it' @ [292:20] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.renderBuilderFunction.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [292:23] ==> public final fun copy(name: String = ..., type: Type = ..., initializer: String? = ..., getterSetterNoImpl: Boolean = ..., kind: AttributeKind = ..., override: Boolean = ..., vararg: Boolean = ..., static: Boolean = ..., required: Boolean = ...): GenerateAttribute defined in org.jetbrains.idl2k.GenerateAttribute[SimpleFunctionDescriptorImpl]

'ARGUMENT' @ [292:49] ==> enum entry ARGUMENT defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'dynamicIfUnknownType' @ [293:14] ==> public fun List<GenerateAttribute>.dynamicIfUnknownType(allTypes: Set<String>, standardTypes: Set<Type> = ...): List<GenerateAttribute> defined in org.jetbrains.idl2k in file model.kt[SimpleFunctionDescriptorImpl]

'allTypes' @ [293:35] ==> value-parameter allTypes: Set<String> defined in org.jetbrains.idl2k.renderBuilderFunction[ValueParameterDescriptorImpl]

'map' @ [294:14] ==> public inline fun <T, R> Iterable<GenerateAttribute>.map(transform: (GenerateAttribute) -> GenerateAttribute): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <R> -> GenerateAttribute

'if (it.initializer == null && (it.type.nullable || it.type == DynamicType) && !it.required) it.copy(initializer = "null") else it' @ [294:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: GenerateAttribute, elseBranch: GenerateAttribute): GenerateAttribute[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> GenerateAttribute

'it' @ [294:24] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.renderBuilderFunction.<anonymous>[ValueParameterDescriptorImpl]

'initializer' @ [294:27] ==> public final val initializer: String? defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'it' @ [294:51] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.renderBuilderFunction.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [294:54] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'nullable' @ [294:59] ==> public abstract val nullable: Boolean defined in org.jetbrains.idl2k.Type[PropertyDescriptorImpl]

'it' @ [294:71] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.renderBuilderFunction.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [294:74] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'DynamicType' @ [294:82] ==> public object DynamicType : Type defined in org.jetbrains.idl2k in file types.kt[FakeCallableDescriptorForObject]

'!' @ [294:98] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [294:99] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.renderBuilderFunction.<anonymous>[ValueParameterDescriptorImpl]

'required' @ [294:102] ==> public final val required: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'it' @ [294:112] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.renderBuilderFunction.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [294:115] ==> public final fun copy(name: String = ..., type: Type = ..., initializer: String? = ..., getterSetterNoImpl: Boolean = ..., kind: AttributeKind = ..., override: Boolean = ..., vararg: Boolean = ..., static: Boolean = ..., required: Boolean = ...): GenerateAttribute defined in org.jetbrains.idl2k.GenerateAttribute[SimpleFunctionDescriptorImpl]

'it' @ [294:147] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.renderBuilderFunction.<anonymous>[ValueParameterDescriptorImpl]

'appendln' @ [296:5] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [297:5] ==> public abstract fun append(p0: (CharSequence..CharSequence?)): (Appendable..Appendable?) defined in java.lang.Appendable[JavaMethodDescriptor]

'dictionary' @ [297:33] ==> value-parameter dictionary: GenerateTraitOrClass defined in org.jetbrains.idl2k.renderBuilderFunction[ValueParameterDescriptorImpl]

'name' @ [297:44] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'renderArgumentsDeclaration' @ [298:5] ==> private fun Appendable /* = Appendable */.renderArgumentsDeclaration(args: List<GenerateAttribute>, omitDefaults: Boolean = ...): Appendable /* = Appendable */ defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'fields' @ [298:32] ==> val fields: List<GenerateAttribute> defined in org.jetbrains.idl2k.renderBuilderFunction[LocalVariableDescriptor]

'appendln' @ [299:5] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'dictionary' @ [299:19] ==> value-parameter dictionary: GenerateTraitOrClass defined in org.jetbrains.idl2k.renderBuilderFunction[ValueParameterDescriptorImpl]

'name' @ [299:30] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'indent' @ [301:5] ==> private fun <O : Appendable /* = Appendable */> Appendable /* = Appendable */.indent(commented: Boolean = ..., level: Int): Unit defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <O : Appendable /* = Appendable */> -> Appendable

'appendln' @ [302:5] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [303:5] ==> public fun Appendable /* = Appendable */.appendln(): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fields' @ [305:19] ==> val fields: List<GenerateAttribute> defined in org.jetbrains.idl2k.renderBuilderFunction[LocalVariableDescriptor]

'indent' @ [306:9] ==> private fun <O : Appendable /* = Appendable */> Appendable /* = Appendable */.indent(commented: Boolean = ..., level: Int): Unit defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <O : Appendable /* = Appendable */> -> Appendable

'appendln' @ [307:9] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'field' @ [307:25] ==> val field: GenerateAttribute defined in org.jetbrains.idl2k.renderBuilderFunction[LocalVariableDescriptor]

'name' @ [307:31] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'field' @ [307:44] ==> val field: GenerateAttribute defined in org.jetbrains.idl2k.renderBuilderFunction[LocalVariableDescriptor]

'name' @ [307:50] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'replaceKeywords' @ [307:55] ==> private fun String.replaceKeywords(): String defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'appendln' @ [310:5] ==> public fun Appendable /* = Appendable */.appendln(): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indent' @ [312:5] ==> private fun <O : Appendable /* = Appendable */> Appendable /* = Appendable */.indent(commented: Boolean = ..., level: Int): Unit defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <O : Appendable /* = Appendable */> -> Appendable

'appendln' @ [313:5] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [315:5] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [316:5] ==> public fun Appendable /* = Appendable */.appendln(): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'f1' @ [320:9] ==> value-parameter f1: GenerateFunction defined in org.jetbrains.idl2k.betterFunction[ValueParameterDescriptorImpl]

'copy' @ [320:12] ==> public final fun copy(name: String = ..., returnType: Type = ..., arguments: List<GenerateAttribute> = ..., nativeGetterOrSetter: NativeGetterOrSetter = ..., static: Boolean = ..., override: Boolean = ...): GenerateFunction defined in org.jetbrains.idl2k.GenerateFunction[SimpleFunctionDescriptorImpl]

'f1' @ [321:29] ==> value-parameter f1: GenerateFunction defined in org.jetbrains.idl2k.betterFunction[ValueParameterDescriptorImpl]

'arguments' @ [321:32] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'zip' @ [322:26] ==> public infix fun <T, R> Iterable<GenerateAttribute>.zip(other: Iterable<GenerateAttribute>): List<Pair<GenerateAttribute, GenerateAttribute>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <R> -> GenerateAttribute

'f2' @ [322:30] ==> value-parameter f2: GenerateFunction defined in org.jetbrains.idl2k.betterFunction[ValueParameterDescriptorImpl]

'arguments' @ [322:33] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'map' @ [323:26] ==> public inline fun <T, R> Iterable<Pair<GenerateAttribute, GenerateAttribute>>.map(transform: (Pair<GenerateAttribute, GenerateAttribute>) -> GenerateAttribute): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<GenerateAttribute, GenerateAttribute>
    <R> -> GenerateAttribute

'it' @ [323:32] ==> value-parameter it: Pair<GenerateAttribute, GenerateAttribute> defined in org.jetbrains.idl2k.betterFunction.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [323:35] ==> public final val first: GenerateAttribute defined in kotlin.Pair[DeserializedPropertyDescriptor]

'copy' @ [323:41] ==> public final fun copy(name: String = ..., type: Type = ..., initializer: String? = ..., getterSetterNoImpl: Boolean = ..., kind: AttributeKind = ..., override: Boolean = ..., vararg: Boolean = ..., static: Boolean = ..., required: Boolean = ...): GenerateAttribute defined in org.jetbrains.idl2k.GenerateAttribute[SimpleFunctionDescriptorImpl]

'it' @ [323:53] ==> value-parameter it: Pair<GenerateAttribute, GenerateAttribute> defined in org.jetbrains.idl2k.betterFunction.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [323:56] ==> private fun <F, T> Pair<GenerateAttribute, GenerateAttribute>.map(block: (GenerateAttribute) -> Type): Pair<Type, Type> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <F> -> GenerateAttribute
    <T> -> Type

'it' @ [323:62] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.betterFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [323:65] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'betterType' @ [323:72] ==> private fun Pair<Type, Type>.betterType(): Type defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'it' @ [323:93] ==> value-parameter it: Pair<GenerateAttribute, GenerateAttribute> defined in org.jetbrains.idl2k.betterFunction.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [323:96] ==> private fun <F, T> Pair<GenerateAttribute, GenerateAttribute>.map(block: (GenerateAttribute) -> String): Pair<String, String> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <F> -> GenerateAttribute
    <T> -> String

'it' @ [323:102] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.betterFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [323:105] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'betterName' @ [323:112] ==> private fun Pair<String, String>.betterName(): String defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [324:40] ==> public fun <T> listOf(vararg elements: NativeGetterOrSetter): List<NativeGetterOrSetter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NativeGetterOrSetter

'f1' @ [324:47] ==> value-parameter f1: GenerateFunction defined in org.jetbrains.idl2k.betterFunction[ValueParameterDescriptorImpl]

'nativeGetterOrSetter' @ [324:50] ==> public final val nativeGetterOrSetter: NativeGetterOrSetter defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'f2' @ [324:72] ==> value-parameter f2: GenerateFunction defined in org.jetbrains.idl2k.betterFunction[ValueParameterDescriptorImpl]

'nativeGetterOrSetter' @ [324:75] ==> public final val nativeGetterOrSetter: NativeGetterOrSetter defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'firstOrNull' @ [325:26] ==> public inline fun <T> Iterable<NativeGetterOrSetter>.firstOrNull(predicate: (NativeGetterOrSetter) -> Boolean): NativeGetterOrSetter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NativeGetterOrSetter

'it' @ [325:40] ==> value-parameter it: NativeGetterOrSetter defined in org.jetbrains.idl2k.betterFunction.<anonymous>[ValueParameterDescriptorImpl]

'NONE' @ [325:67] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'NONE' @ [325:98] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'invoke' @ [328:54] ==> public abstract operator fun invoke(p1: F): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'first' @ [328:60] ==> public final val first: F defined in kotlin.Pair[DeserializedPropertyDescriptor]

'invoke' @ [328:70] ==> public abstract operator fun invoke(p1: F): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'second' @ [328:76] ==> public final val second: F defined in kotlin.Pair[DeserializedPropertyDescriptor]

'if (first is DynamicType || first is AnyType) first else second' @ [329:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'first' @ [329:49] ==> public final val first: Type defined in kotlin.Pair[DeserializedPropertyDescriptor]

'first' @ [329:73] ==> public final val first: Type defined in kotlin.Pair[DeserializedPropertyDescriptor]

'first' @ [329:91] ==> public final val first: Type defined in kotlin.Pair[DeserializedPropertyDescriptor]

'second' @ [329:102] ==> public final val second: Type defined in kotlin.Pair[DeserializedPropertyDescriptor]

'if (((0..9).map(Int::toString) + listOf("arg")).none { first.toLowerCase().contains(it) }) first else second' @ [330:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'+' @ [330:54] ==> public operator fun <T> Collection<String>.plus(elements: Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'..' @ [330:55] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'map' @ [330:61] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'Int' @ [330:65] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'toString' @ [330:70] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [330:82] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'none' @ [330:97] ==> public inline fun <T> Iterable<String>.none(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'first' @ [330:104] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toLowerCase' @ [330:110] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'contains' @ [330:124] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [330:133] ==> value-parameter it: String defined in org.jetbrains.idl2k.betterName.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [330:140] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'second' @ [330:151] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'a' @ [333:9] ==> value-parameter a: AttributeKind defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'b' @ [333:14] ==> value-parameter b: AttributeKind defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'a' @ [334:16] ==> value-parameter a: AttributeKind defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'a' @ [337:9] ==> value-parameter a: AttributeKind defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'VAR' @ [337:28] ==> enum entry VAR defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'b' @ [337:35] ==> value-parameter b: AttributeKind defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'VAR' @ [337:54] ==> enum entry VAR defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'VAR' @ [338:30] ==> enum entry VAR defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'a' @ [341:12] ==> value-parameter a: AttributeKind defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'require' @ [345:5] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'a' @ [345:13] ==> value-parameter a: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'name' @ [345:15] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'b' @ [345:23] ==> value-parameter b: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'name' @ [345:25] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'when {
        a.type.dropNullable() == b.type.dropNullable() -> a.type.withNullability(a.type.nullable || b.type.nullable)
        else -> DynamicType
    }' @ [347:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type, entry1: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type

'a' @ [348:9] ==> value-parameter a: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'type' @ [348:11] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'dropNullable' @ [348:16] ==> public fun <T : Type> Type.dropNullable(): Type defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> Type

'b' @ [348:34] ==> value-parameter b: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'type' @ [348:36] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'dropNullable' @ [348:41] ==> public fun <T : Type> Type.dropNullable(): Type defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> Type

'a' @ [348:59] ==> value-parameter a: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'type' @ [348:61] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'withNullability' @ [348:66] ==> public fun <T : Type> Type.withNullability(nullable: Boolean): Type defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> Type

'a' @ [348:82] ==> value-parameter a: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'type' @ [348:84] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'nullable' @ [348:89] ==> public abstract val nullable: Boolean defined in org.jetbrains.idl2k.Type[PropertyDescriptorImpl]

'b' @ [348:101] ==> value-parameter b: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'type' @ [348:103] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'nullable' @ [348:108] ==> public abstract val nullable: Boolean defined in org.jetbrains.idl2k.Type[PropertyDescriptorImpl]

'DynamicType' @ [349:17] ==> public object DynamicType : Type defined in org.jetbrains.idl2k in file types.kt[FakeCallableDescriptorForObject]

'GenerateAttribute' @ [352:12] ==> public constructor GenerateAttribute(name: String, type: Type, initializer: String?, getterSetterNoImpl: Boolean, kind: AttributeKind, override: Boolean, vararg: Boolean, static: Boolean, required: Boolean) defined in org.jetbrains.idl2k.GenerateAttribute[ClassConstructorDescriptorImpl]

'a' @ [353:13] ==> value-parameter a: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'name' @ [353:15] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'type' @ [354:13] ==> val type: Type defined in org.jetbrains.idl2k.merge[LocalVariableDescriptor]

'a' @ [355:13] ==> value-parameter a: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'initializer' @ [355:15] ==> public final val initializer: String? defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'b' @ [355:30] ==> value-parameter b: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'initializer' @ [355:32] ==> public final val initializer: String? defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'a' @ [356:13] ==> value-parameter a: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'getterSetterNoImpl' @ [356:15] ==> public final val getterSetterNoImpl: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'b' @ [356:37] ==> value-parameter b: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'getterSetterNoImpl' @ [356:39] ==> public final val getterSetterNoImpl: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'merge' @ [357:13] ==> private fun merge(a: AttributeKind, b: AttributeKind): AttributeKind defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'a' @ [357:19] ==> value-parameter a: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'kind' @ [357:21] ==> public final val kind: AttributeKind defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'b' @ [357:27] ==> value-parameter b: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'kind' @ [357:29] ==> public final val kind: AttributeKind defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'a' @ [358:13] ==> value-parameter a: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'override' @ [358:15] ==> public final val override: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'a' @ [359:13] ==> value-parameter a: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'vararg' @ [359:15] ==> public final var vararg: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'a' @ [360:13] ==> value-parameter a: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'static' @ [360:15] ==> public final val static: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'a' @ [361:13] ==> value-parameter a: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'required' @ [361:15] ==> public final val required: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'b' @ [361:27] ==> value-parameter b: GenerateAttribute defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'required' @ [361:29] ==> public final val required: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'groupBy' @ [365:61] ==> public inline fun <T, K> Iterable<Pair<K, V>>.groupBy(keySelector: (Pair<K, V>) -> K): Map<K, List<Pair<K, V>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<K, V>
    <K> -> K

'it' @ [365:71] ==> value-parameter it: Pair<K, V> defined in org.jetbrains.idl2k.toMultiMap.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [365:74] ==> public final val first: K defined in kotlin.Pair[DeserializedPropertyDescriptor]

'mapValues' @ [365:82] ==> public inline fun <K, V, R> Map<out K, List<Pair<K, V>>>.mapValues(transform: (Map.Entry<K, List<Pair<K, V>>>) -> List<V>): Map<K, List<V>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> List<Pair<K, V>>
    <R> -> List<V>

'it' @ [365:94] ==> value-parameter it: Map.Entry<K, List<Pair<K, V>>> defined in org.jetbrains.idl2k.toMultiMap.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [365:97] ==> public abstract val value: List<Pair<K, V>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'map' @ [365:103] ==> public inline fun <T, R> Iterable<Pair<K, V>>.map(transform: (Pair<K, V>) -> V): List<V> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<K, V>
    <R> -> V

'it' @ [365:109] ==> value-parameter it: Pair<K, V> defined in org.jetbrains.idl2k.toMultiMap.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [365:112] ==> public final val second: V defined in kotlin.Pair[DeserializedPropertyDescriptor]

'appendln' @ [368:5] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [369:5] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'enumDefinition' @ [369:43] ==> value-parameter enumDefinition: EnumDefinition defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [369:58] ==> public final val name: String defined in org.jetbrains.idl2k.EnumDefinition[PropertyDescriptorImpl]

'indent' @ [370:5] ==> private fun <O : Appendable /* = Appendable */> Appendable /* = Appendable */.indent(commented: Boolean = ..., level: Int): Unit defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <O : Appendable /* = Appendable */> -> Appendable

'appendln' @ [371:5] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [372:5] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'enumDefinition' @ [374:19] ==> value-parameter enumDefinition: EnumDefinition defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'entries' @ [374:34] ==> public final val entries: List<String> defined in org.jetbrains.idl2k.EnumDefinition[PropertyDescriptorImpl]

'mapEnumConstant' @ [375:25] ==> public fun mapEnumConstant(entry: String): String defined in org.jetbrains.idl2k.util in file utils.kt[SimpleFunctionDescriptorImpl]

'entry' @ [375:41] ==> val entry: String defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'appendln' @ [376:9] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [376:18] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'enumDefinition' @ [376:39] ==> value-parameter enumDefinition: EnumDefinition defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [376:54] ==> public final val name: String defined in org.jetbrains.idl2k.EnumDefinition[PropertyDescriptorImpl]

'entryName' @ [376:71] ==> val entryName: String defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'enumDefinition' @ [376:84] ==> value-parameter enumDefinition: EnumDefinition defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [376:99] ==> public final val name: String defined in org.jetbrains.idl2k.EnumDefinition[PropertyDescriptorImpl]

'entry' @ [377:29] ==> val entry: String defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'enumDefinition' @ [377:62] ==> value-parameter enumDefinition: EnumDefinition defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'name' @ [377:77] ==> public final val name: String defined in org.jetbrains.idl2k.EnumDefinition[PropertyDescriptorImpl]

'appendln' @ [380:5] ==> public fun Appendable /* = Appendable */.appendln(): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ifaces' @ [384:25] ==> value-parameter ifaces: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'associateBy' @ [384:32] ==> public inline fun <T, K> Iterable<GenerateTraitOrClass>.associateBy(keySelector: (GenerateTraitOrClass) -> String): Map<String, GenerateTraitOrClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass
    <K> -> String

'it' @ [384:46] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [384:49] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'declaredTypes' @ [386:20] ==> val declaredTypes: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'unions' @ [386:36] ==> value-parameter unions: GenerateUnionTypes defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'anonymousUnionsMap' @ [386:43] ==> public final val anonymousUnionsMap: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.GenerateUnionTypes[PropertyDescriptorImpl]

'unions' @ [386:64] ==> value-parameter unions: GenerateUnionTypes defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'typedefsMarkersMap' @ [386:71] ==> public final val typedefsMarkersMap: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.GenerateUnionTypes[PropertyDescriptorImpl]

'declaredTypes' @ [387:5] ==> val declaredTypes: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'values' @ [387:19] ==> public abstract val values: Collection<GenerateTraitOrClass> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'filter' @ [387:26] ==> public inline fun <T> Iterable<GenerateTraitOrClass>.filter(predicate: (GenerateTraitOrClass) -> Boolean): List<GenerateTraitOrClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass

'it' @ [387:35] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'namespace' @ [387:38] ==> public final val namespace: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'namespace' @ [387:51] ==> value-parameter namespace: String defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'forEach' @ [387:63] ==> @HidesMembers public inline fun <T> Iterable<GenerateTraitOrClass>.forEach(action: (GenerateTraitOrClass) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass

'render' @ [388:9] ==> public fun Appendable /* = Appendable */.render(allTypes: Map<String, GenerateTraitOrClass>, enums: List<EnumDefinition>, typeNamesToUnions: Map<String, List<String>>, iface: GenerateTraitOrClass, markerAnnotation: Boolean = ..., mdnCache: MDNDocumentationCache? = ...): Unit defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'allTypes' @ [388:16] ==> val allTypes: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'enums' @ [388:26] ==> value-parameter enums: List<EnumDefinition> defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'unions' @ [388:33] ==> value-parameter unions: GenerateUnionTypes defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'typeNamesToUnionsMap' @ [388:40] ==> public final val typeNamesToUnionsMap: Map<String, List<String>> defined in org.jetbrains.idl2k.GenerateUnionTypes[PropertyDescriptorImpl]

'it' @ [388:62] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'mdnCache' @ [388:77] ==> value-parameter mdnCache: MDNDocumentationCache defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'unions' @ [391:5] ==> value-parameter unions: GenerateUnionTypes defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'anonymousUnionsMap' @ [391:12] ==> public final val anonymousUnionsMap: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.GenerateUnionTypes[PropertyDescriptorImpl]

'values' @ [391:31] ==> public abstract val values: Collection<GenerateTraitOrClass> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'filter' @ [391:38] ==> public inline fun <T> Iterable<GenerateTraitOrClass>.filter(predicate: (GenerateTraitOrClass) -> Boolean): List<GenerateTraitOrClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass

'it' @ [391:47] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'namespace' @ [391:50] ==> public final val namespace: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'it' @ [391:69] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'namespace' @ [391:72] ==> public final val namespace: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'namespace' @ [391:85] ==> value-parameter namespace: String defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'forEach' @ [391:97] ==> @HidesMembers public inline fun <T> Iterable<GenerateTraitOrClass>.forEach(action: (GenerateTraitOrClass) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass

'render' @ [392:9] ==> public fun Appendable /* = Appendable */.render(allTypes: Map<String, GenerateTraitOrClass>, enums: List<EnumDefinition>, typeNamesToUnions: Map<String, List<String>>, iface: GenerateTraitOrClass, markerAnnotation: Boolean = ..., mdnCache: MDNDocumentationCache? = ...): Unit defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'allTypes' @ [392:16] ==> val allTypes: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'enums' @ [392:26] ==> value-parameter enums: List<EnumDefinition> defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'emptyMap' @ [392:33] ==> public fun <K, V> emptyMap(): Map<String, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<String>

'it' @ [392:45] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'unions' @ [395:5] ==> value-parameter unions: GenerateUnionTypes defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'typedefsMarkersMap' @ [395:12] ==> public final val typedefsMarkersMap: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.GenerateUnionTypes[PropertyDescriptorImpl]

'values' @ [395:31] ==> public abstract val values: Collection<GenerateTraitOrClass> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'filter' @ [395:38] ==> public inline fun <T> Iterable<GenerateTraitOrClass>.filter(predicate: (GenerateTraitOrClass) -> Boolean): List<GenerateTraitOrClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass

'it' @ [395:47] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'namespace' @ [395:50] ==> public final val namespace: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'it' @ [395:69] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'namespace' @ [395:72] ==> public final val namespace: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'namespace' @ [395:85] ==> value-parameter namespace: String defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'forEach' @ [395:97] ==> @HidesMembers public inline fun <T> Iterable<GenerateTraitOrClass>.forEach(action: (GenerateTraitOrClass) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass

'render' @ [396:9] ==> public fun Appendable /* = Appendable */.render(allTypes: Map<String, GenerateTraitOrClass>, enums: List<EnumDefinition>, typeNamesToUnions: Map<String, List<String>>, iface: GenerateTraitOrClass, markerAnnotation: Boolean = ..., mdnCache: MDNDocumentationCache? = ...): Unit defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'allTypes' @ [396:16] ==> val allTypes: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.render[LocalVariableDescriptor]

'enums' @ [396:26] ==> value-parameter enums: List<EnumDefinition> defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'emptyMap' @ [396:33] ==> public fun <K, V> emptyMap(): Map<String, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<String>

'it' @ [396:45] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'enums' @ [399:5] ==> value-parameter enums: List<EnumDefinition> defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'filter' @ [399:11] ==> public inline fun <T> Iterable<EnumDefinition>.filter(predicate: (EnumDefinition) -> Boolean): List<EnumDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EnumDefinition

'it' @ [399:20] ==> value-parameter it: EnumDefinition defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

'namespace' @ [399:23] ==> public final val namespace: String defined in org.jetbrains.idl2k.EnumDefinition[PropertyDescriptorImpl]

'namespace' @ [399:36] ==> value-parameter namespace: String defined in org.jetbrains.idl2k.render[ValueParameterDescriptorImpl]

'forEach' @ [400:14] ==> @HidesMembers public inline fun <T> Iterable<EnumDefinition>.forEach(action: (EnumDefinition) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EnumDefinition

'render' @ [400:24] ==> public fun Appendable /* = Appendable */.render(enumDefinition: EnumDefinition): Unit defined in org.jetbrains.idl2k in file render.kt[SimpleFunctionDescriptorImpl]

'it' @ [400:31] ==> value-parameter it: EnumDefinition defined in org.jetbrains.idl2k.render.<anonymous>[ValueParameterDescriptorImpl]

