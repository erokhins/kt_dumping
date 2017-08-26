'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'legalNameRules' @ [25:5] ==> private val legalNameRules: List<Rule<String>> defined in net.corda.core.utilities in file LegalNameValidator.kt[PropertyDescriptorImpl]

'forEach' @ [25:20] ==> @HidesMembers public inline fun <T> Iterable<Rule<String>>.forEach(action: (Rule<String>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Rule<String>

'it' @ [25:30] ==> value-parameter it: Rule<String> defined in net.corda.core.utilities.validateLegalName.<anonymous>[ValueParameterDescriptorImpl]

'validate' @ [25:33] ==> public abstract fun validate(legalName: String): Unit defined in net.corda.core.utilities.Rule[SimpleFunctionDescriptorImpl]

'normalizedLegalName' @ [25:42] ==> value-parameter normalizedLegalName: String defined in net.corda.core.utilities.validateLegalName[ValueParameterDescriptorImpl]

'validateLegalName' @ [30:5] ==> public fun validateLegalName(normalizedLegalName: String): Unit defined in net.corda.core.utilities in file LegalNameValidator.kt[SimpleFunctionDescriptorImpl]

'x500Name' @ [30:23] ==> value-parameter x500Name: X500Name defined in net.corda.core.utilities.validateX500Name[ValueParameterDescriptorImpl]

'commonName' @ [30:32] ==> public val X500Name.commonName: String defined in net.corda.core.crypto in file X500NameUtils.kt[PropertyDescriptorImpl]

'toRegex' @ [33:26] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'legalName' @ [40:28] ==> value-parameter legalName: String defined in net.corda.core.utilities.normaliseLegalName[ValueParameterDescriptorImpl]

'trim' @ [40:38] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [40:45] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'WHITESPACE' @ [40:53] ==> public val WHITESPACE: Regex defined in net.corda.core.utilities in file LegalNameValidator.kt[PropertyDescriptorImpl]

'normalize' @ [41:23] ==> public open fun normalize(p0: (CharSequence..CharSequence?), p1: (Normalizer.Form..Normalizer.Form?)): (String..String?) defined in java.text.Normalizer[JavaMethodDescriptor]

'trimmedLegalName' @ [41:33] ==> val trimmedLegalName: String defined in net.corda.core.utilities.normaliseLegalName[LocalVariableDescriptor]

'NFKC' @ [41:67] ==> enum entry NFKC defined in java.text.Normalizer.Form[FakeCallableDescriptorForObject]

'listOf' @ [44:50] ==> public fun <T> listOf(vararg elements: Rule<String>): List<Rule<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Rule<String>

'UnicodeNormalizationRule' @ [45:9] ==> public constructor UnicodeNormalizationRule() defined in net.corda.core.utilities.UnicodeNormalizationRule[ClassConstructorDescriptorImpl]

'CharacterRule' @ [46:9] ==> public constructor CharacterRule(vararg bannedChars: Char) defined in net.corda.core.utilities.CharacterRule[ClassConstructorDescriptorImpl]

'WordRule' @ [47:9] ==> public constructor WordRule(vararg bannedWords: String) defined in net.corda.core.utilities.WordRule[ClassConstructorDescriptorImpl]

'LengthRule' @ [48:9] ==> public constructor LengthRule(maxLength: Int) defined in net.corda.core.utilities.LengthRule[ClassConstructorDescriptorImpl]

'UnicodeRangeRule' @ [50:9] ==> public constructor UnicodeRangeRule(vararg supportScripts: Character.UnicodeScript) defined in net.corda.core.utilities.UnicodeRangeRule[ClassConstructorDescriptorImpl]

'LATIN' @ [50:26] ==> enum entry LATIN defined in java.lang.Character.UnicodeScript[FakeCallableDescriptorForObject]

'COMMON' @ [50:33] ==> enum entry COMMON defined in java.lang.Character.UnicodeScript[FakeCallableDescriptorForObject]

'INHERITED' @ [50:41] ==> enum entry INHERITED defined in java.lang.Character.UnicodeScript[FakeCallableDescriptorForObject]

'CapitalLetterRule' @ [51:9] ==> public constructor CapitalLetterRule() defined in net.corda.core.utilities.CapitalLetterRule[ClassConstructorDescriptorImpl]

'X500NameRule' @ [52:9] ==> public constructor X500NameRule() defined in net.corda.core.utilities.X500NameRule[ClassConstructorDescriptorImpl]

'MustHaveAtLeastTwoLettersRule' @ [53:9] ==> public constructor MustHaveAtLeastTwoLettersRule() defined in net.corda.core.utilities.MustHaveAtLeastTwoLettersRule[ClassConstructorDescriptorImpl]

'require' @ [58:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'legalName' @ [58:17] ==> value-parameter legalName: String defined in net.corda.core.utilities.UnicodeNormalizationRule.validate[ValueParameterDescriptorImpl]

'normaliseLegalName' @ [58:30] ==> public fun normaliseLegalName(legalName: String): String defined in net.corda.core.utilities in file LegalNameValidator.kt[SimpleFunctionDescriptorImpl]

'legalName' @ [58:49] ==> value-parameter legalName: String defined in net.corda.core.utilities.UnicodeNormalizationRule.validate[ValueParameterDescriptorImpl]

'supportScripts' @ [63:27] ==> value-parameter vararg supportScripts: Character.UnicodeScript defined in net.corda.core.utilities.UnicodeRangeRule.<init>[ValueParameterDescriptorImpl]

'map' @ [63:42] ==> public inline fun <T, R> Array<out Character.UnicodeScript>.map(transform: (Character.UnicodeScript) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnicodeScript
    <R> -> String

'it' @ [63:56] ==> value-parameter it: Character.UnicodeScript defined in net.corda.core.utilities.UnicodeRangeRule.pattern.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [63:63] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [63:122] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> (Pattern..Pattern?)): (Pattern..Pattern?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (java.util.regex.Pattern..java.util.regex.Pattern?)

'compile' @ [63:136] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'it' @ [63:144] ==> value-parameter it: String defined in net.corda.core.utilities.UnicodeRangeRule.pattern.<anonymous>[ValueParameterDescriptorImpl]

'require' @ [66:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'pattern' @ [66:17] ==> private final val pattern: (Pattern..Pattern?) defined in net.corda.core.utilities.UnicodeRangeRule[PropertyDescriptorImpl]

'matcher' @ [66:25] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'legalName' @ [66:33] ==> value-parameter legalName: String defined in net.corda.core.utilities.UnicodeRangeRule.validate[ValueParameterDescriptorImpl]

'matches' @ [66:44] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'legalName' @ [67:32] ==> value-parameter legalName: String defined in net.corda.core.utilities.UnicodeRangeRule.validate[ValueParameterDescriptorImpl]

'replace' @ [67:42] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pattern' @ [67:50] ==> private final val pattern: (Pattern..Pattern?) defined in net.corda.core.utilities.UnicodeRangeRule[PropertyDescriptorImpl]

'toRegex' @ [67:58] ==> @InlineOnly public inline fun Pattern.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toSet' @ [67:73] ==> public fun CharSequence.toSet(): Set<Char> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (illegalChars.size > 1) {
                "Forbidden characters $illegalChars in \"$legalName\"."
            } else {
                "Forbidden character $illegalChars in \"$legalName\"."
            }' @ [68:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'illegalChars' @ [68:17] ==> val illegalChars: Set<Char> defined in net.corda.core.utilities.UnicodeRangeRule.validate.<anonymous>[LocalVariableDescriptor]

'size' @ [68:30] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'illegalChars' @ [69:40] ==> val illegalChars: Set<Char> defined in net.corda.core.utilities.UnicodeRangeRule.validate.<anonymous>[LocalVariableDescriptor]

'legalName' @ [69:59] ==> value-parameter legalName: String defined in net.corda.core.utilities.UnicodeRangeRule.validate[ValueParameterDescriptorImpl]

'illegalChars' @ [71:39] ==> val illegalChars: Set<Char> defined in net.corda.core.utilities.UnicodeRangeRule.validate.<anonymous>[LocalVariableDescriptor]

'legalName' @ [71:58] ==> value-parameter legalName: String defined in net.corda.core.utilities.UnicodeRangeRule.validate[ValueParameterDescriptorImpl]

'bannedChars' @ [79:9] ==> public final val bannedChars: CharArray defined in net.corda.core.utilities.CharacterRule[PropertyDescriptorImpl]

'forEach' @ [79:21] ==> public inline fun CharArray.forEach(action: (Char) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'require' @ [80:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [80:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'legalName' @ [80:22] ==> value-parameter legalName: String defined in net.corda.core.utilities.CharacterRule.validate[ValueParameterDescriptorImpl]

'contains' @ [80:32] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [80:41] ==> value-parameter it: Char defined in net.corda.core.utilities.CharacterRule.validate.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [80:94] ==> value-parameter it: Char defined in net.corda.core.utilities.CharacterRule.validate.<anonymous>[ValueParameterDescriptorImpl]

'bannedWords' @ [87:9] ==> public final val bannedWords: Array<out String> defined in net.corda.core.utilities.WordRule[PropertyDescriptorImpl]

'forEach' @ [87:21] ==> public inline fun <T> Array<out String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'require' @ [88:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [88:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'legalName' @ [88:22] ==> value-parameter legalName: String defined in net.corda.core.utilities.WordRule.validate[ValueParameterDescriptorImpl]

'contains' @ [88:32] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [88:41] ==> value-parameter it: String defined in net.corda.core.utilities.WordRule.validate.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [88:102] ==> value-parameter it: String defined in net.corda.core.utilities.WordRule.validate.<anonymous>[ValueParameterDescriptorImpl]

'require' @ [95:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'legalName' @ [95:17] ==> value-parameter legalName: String defined in net.corda.core.utilities.LengthRule.validate[ValueParameterDescriptorImpl]

'length' @ [95:27] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'maxLength' @ [95:37] ==> public final val maxLength: Int defined in net.corda.core.utilities.LengthRule[PropertyDescriptorImpl]

'maxLength' @ [95:75] ==> public final val maxLength: Int defined in net.corda.core.utilities.LengthRule[PropertyDescriptorImpl]

'legalName' @ [101:36] ==> value-parameter legalName: String defined in net.corda.core.utilities.CapitalLetterRule.validate[ValueParameterDescriptorImpl]

'capitalize' @ [101:46] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'require' @ [102:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'legalName' @ [102:17] ==> value-parameter legalName: String defined in net.corda.core.utilities.CapitalLetterRule.validate[ValueParameterDescriptorImpl]

'capitalizedLegalName' @ [102:30] ==> val capitalizedLegalName: String defined in net.corda.core.utilities.CapitalLetterRule.validate[LocalVariableDescriptor]

'capitalizedLegalName' @ [102:96] ==> val capitalizedLegalName: String defined in net.corda.core.utilities.CapitalLetterRule.validate[LocalVariableDescriptor]

'X500Principal' @ [109:9] ==> public constructor X500Principal(p0: (String..String?)) defined in javax.security.auth.x500.X500Principal[JavaClassConstructorDescriptor]

'legalName' @ [109:28] ==> value-parameter legalName: String defined in net.corda.core.utilities.X500NameRule.validate[ValueParameterDescriptorImpl]

'require' @ [116:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'legalName' @ [116:17] ==> value-parameter legalName: String defined in net.corda.core.utilities.MustHaveAtLeastTwoLettersRule.validate[ValueParameterDescriptorImpl]

'count' @ [116:27] ==> public inline fun CharSequence.count(predicate: (Char) -> Boolean): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [116:35] ==> value-parameter it: Char defined in net.corda.core.utilities.MustHaveAtLeastTwoLettersRule.validate.<anonymous>[ValueParameterDescriptorImpl]

'isLetter' @ [116:38] ==> @InlineOnly public inline fun Char.isLetter(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'legalName' @ [116:87] ==> value-parameter legalName: String defined in net.corda.core.utilities.MustHaveAtLeastTwoLettersRule.validate[ValueParameterDescriptorImpl]

