'if (this.shouldBeEscaped()) '`' + asString() + '`' else asString()' @ [24:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [24:16] ==> <this> defined in org.jetbrains.kotlin.renderer.render[ReceiverParameterDescriptorImpl]

'shouldBeEscaped' @ [24:21] ==> private fun Name.shouldBeEscaped(): Boolean defined in org.jetbrains.kotlin.renderer in file RenderingUtils.kt[SimpleFunctionDescriptorImpl]

'+' @ [24:40] ==> @InlineOnly public operator inline fun Char.plus(other: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'asString' @ [24:46] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'asString' @ [24:68] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'isSpecial' @ [28:9] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'asString' @ [30:18] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'string' @ [31:12] ==> val string: String defined in org.jetbrains.kotlin.renderer.shouldBeEscaped[LocalVariableDescriptor]

'KEYWORDS' @ [31:46] ==> public final val KEYWORDS: (MutableSet<(String..String?)>..Set<(String..String?)>?) defined in org.jetbrains.kotlin.renderer.KeywordStringsGenerated[JavaPropertyDescriptor]

'string' @ [31:58] ==> val string: String defined in org.jetbrains.kotlin.renderer.shouldBeEscaped[LocalVariableDescriptor]

'any' @ [31:65] ==> public inline fun CharSequence.any(predicate: (Char) -> Boolean): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [31:71] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLetterOrDigit' @ [31:82] ==> public open fun isLetterOrDigit(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'it' @ [31:98] ==> value-parameter it: Char defined in org.jetbrains.kotlin.renderer.shouldBeEscaped.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [31:105] ==> value-parameter it: Char defined in org.jetbrains.kotlin.renderer.shouldBeEscaped.<anonymous>[ValueParameterDescriptorImpl]

'renderFqName' @ [35:12] ==> public fun renderFqName(pathSegments: List<Name>): String defined in org.jetbrains.kotlin.renderer in file RenderingUtils.kt[SimpleFunctionDescriptorImpl]

'pathSegments' @ [35:25] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'renderFqName' @ [39:12] ==> public fun renderFqName(pathSegments: List<Name>): String defined in org.jetbrains.kotlin.renderer in file RenderingUtils.kt[SimpleFunctionDescriptorImpl]

'pathSegments' @ [39:25] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'buildString' @ [43:12] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathSegments' @ [44:25] ==> value-parameter pathSegments: List<Name> defined in org.jetbrains.kotlin.renderer.renderFqName[ValueParameterDescriptorImpl]

'length' @ [45:17] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'append' @ [46:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [48:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'element' @ [48:20] ==> val element: Name defined in org.jetbrains.kotlin.renderer.renderFqName.<anonymous>[LocalVariableDescriptor]

'render' @ [48:28] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer in file RenderingUtils.kt[SimpleFunctionDescriptorImpl]

