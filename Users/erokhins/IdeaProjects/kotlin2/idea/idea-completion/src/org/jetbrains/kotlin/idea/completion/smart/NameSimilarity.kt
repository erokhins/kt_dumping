'Key' @ [26:27] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Int

'LookupElementWeigher' @ [28:32] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'-' @ [30:15] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'element' @ [30:17] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.NameSimilarityWeigher.weigh[ValueParameterDescriptorImpl]

'getUserData' @ [30:25] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Int..Int?)>): Int? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Int

'NAME_SIMILARITY_KEY' @ [30:37] ==> public val NAME_SIMILARITY_KEY: Key<Int> defined in org.jetbrains.kotlin.idea.completion.smart in file NameSimilarity.kt[PropertyDescriptorImpl]

'expectedInfos' @ [34:12] ==> value-parameter expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[ValueParameterDescriptorImpl]

'mapNotNull' @ [35:14] ==> public inline fun <T, R : Any> Iterable<ExpectedInfo>.mapNotNull(transform: (ExpectedInfo) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo
    <R : Any> -> String

'it' @ [35:27] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity.<anonymous>[ValueParameterDescriptorImpl]

'expectedName' @ [35:30] ==> public final val expectedName: String? defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedPropertyDescriptor]

'map' @ [36:14] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Int

'calcNameSimilarity' @ [36:20] ==> private fun calcNameSimilarity(name: String, expectedName: String): Int defined in org.jetbrains.kotlin.idea.completion.smart in file NameSimilarity.kt[SimpleFunctionDescriptorImpl]

'name' @ [36:39] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[ValueParameterDescriptorImpl]

'it' @ [36:45] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity.<anonymous>[ValueParameterDescriptorImpl]

'max' @ [37:14] ==> public fun <T : Comparable<Int>> Iterable<Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'nameToWordsLowerCase' @ [41:27] ==> @NotNull public open fun nameToWordsLowerCase(@NotNull p0: String): (MutableList<(String..String?)>..List<(String..String?)>) defined in com.intellij.psi.codeStyle.NameUtil[JavaMethodDescriptor]

'name' @ [41:48] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[ValueParameterDescriptorImpl]

'nameToWordsLowerCase' @ [42:27] ==> @NotNull public open fun nameToWordsLowerCase(@NotNull p0: String): (MutableList<(String..String?)>..List<(String..String?)>) defined in com.intellij.psi.codeStyle.NameUtil[JavaMethodDescriptor]

'expectedName' @ [42:48] ==> value-parameter expectedName: String defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[ValueParameterDescriptorImpl]

'words1' @ [44:24] ==> val words1: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'toSet' @ [44:31] ==> public fun <T> Iterable<(String..String?)>.toSet(): Set<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'intersect' @ [44:39] ==> public infix fun <T> Iterable<(String..String?)>.intersect(other: Iterable<(String..String?)>): Set<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'words2' @ [44:49] ==> val words2: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'matchedWords' @ [45:9] ==> val matchedWords: Set<(String..String?)> defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'isEmpty' @ [45:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'!' @ [47:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'word' @ [47:38] ==> value-parameter word: String defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity.isNonNumber[ValueParameterDescriptorImpl]

'isDigit' @ [47:46] ==> @InlineOnly public inline fun Char.isDigit(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'words1' @ [48:27] ==> val words1: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'filter' @ [48:34] ==> public inline fun <T> Iterable<(String..String?)>.filter(predicate: ((String..String?)) -> Boolean): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'words2' @ [49:27] ==> val words2: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'filter' @ [49:34] ==> public inline fun <T> Iterable<(String..String?)>.filter(predicate: ((String..String?)) -> Boolean): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'min' @ [52:25] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'nonNumberWords1' @ [52:29] ==> val nonNumberWords1: List<(String..String?)> defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'size' @ [52:45] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'nonNumberWords2' @ [52:51] ==> val nonNumberWords2: List<(String..String?)> defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'size' @ [52:67] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'?:' @ [53:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Int?, right: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Int

'..' @ [53:30] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'minWords' @ [53:33] ==> val minWords: Int defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'firstOrNull' @ [53:45] ==> public inline fun <T> Iterable<Int>.firstOrNull(predicate: (Int) -> Boolean): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'nonNumberWords1' @ [54:14] ==> val nonNumberWords1: List<(String..String?)> defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'nonNumberWords1' @ [54:30] ==> val nonNumberWords1: List<(String..String?)> defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'size' @ [54:46] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'i' @ [54:53] ==> value-parameter i: Int defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity.<anonymous>[ValueParameterDescriptorImpl]

'nonNumberWords2' @ [54:63] ==> val nonNumberWords2: List<(String..String?)> defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'nonNumberWords2' @ [54:79] ==> val nonNumberWords2: List<(String..String?)> defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'size' @ [54:95] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'i' @ [54:102] ==> value-parameter i: Int defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity.<anonymous>[ValueParameterDescriptorImpl]

'minWords' @ [55:10] ==> val minWords: Int defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'matchedWords' @ [57:12] ==> val matchedWords: Set<(String..String?)> defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

'size' @ [57:25] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'matchedTailLength' @ [57:39] ==> val matchedTailLength: Int defined in org.jetbrains.kotlin.idea.completion.smart.calcNameSimilarity[LocalVariableDescriptor]

