'prefixMatcher' @ [60:22] ==> private final val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'prefix' @ [60:36] ==> public final val PrefixMatcher.prefix: String[MyPropertyDescriptor]

'splitNameIntoWords' @ [61:36] ==> @NotNull public open fun splitNameIntoWords(@NotNull p0: String): (Array<(String..String?)>..Array<out (String..String?)>) defined in com.intellij.psi.codeStyle.NameUtil[JavaMethodDescriptor]

'prefix' @ [61:55] ==> val prefix: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.<init>[LocalVariableDescriptor]

'if (prefix.isEmpty() || prefix[0].isUpperCase())
            emptyList()
        else
            prefixWords.indices.map { index -> if (index == 0) prefix else prefixWords.drop(index).joinToString("") }' @ [64:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'prefix' @ [64:42] ==> val prefix: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.<init>[LocalVariableDescriptor]

'isEmpty' @ [64:49] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [64:62] ==> val prefix: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.<init>[LocalVariableDescriptor]

'isUpperCase' @ [64:72] ==> @InlineOnly public inline fun Char.isUpperCase(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [65:13] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'prefixWords' @ [67:13] ==> val prefixWords: (Array<(String..String?)>..Array<out (String..String?)>) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.<init>[LocalVariableDescriptor]

'indices' @ [67:25] ==> public val <T> Array<out (String..String?)>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'map' @ [67:33] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'if (index == 0) prefix else prefixWords.drop(index).joinToString("")' @ [67:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [67:52] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.<init>.<anonymous>[ValueParameterDescriptorImpl]

'prefix' @ [67:64] ==> val prefix: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.<init>[LocalVariableDescriptor]

'prefixWords' @ [67:76] ==> val prefixWords: (Array<(String..String?)>..Array<out (String..String?)>) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.<init>[LocalVariableDescriptor]

'drop' @ [67:88] ==> public fun <T> Array<out (String..String?)>.drop(n: Int): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'index' @ [67:93] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.<init>.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [67:100] ==> public fun <T> Iterable<(String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'userPrefixes' @ [69:9] ==> private final val userPrefixes: List<String> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'nameSuggestionPrefixes' @ [69:24] ==> val nameSuggestionPrefixes: List<String> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.<init>[LocalVariableDescriptor]

'indices' @ [69:47] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'map' @ [69:55] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'prefixWords' @ [69:61] ==> val prefixWords: (Array<(String..String?)>..Array<out (String..String?)>) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.<init>[LocalVariableDescriptor]

'take' @ [69:73] ==> public fun <T> Array<out (String..String?)>.take(n: Int): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'it' @ [69:78] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.<init>.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [69:82] ==> public fun <T> Iterable<(String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'classNamePrefixMatchers' @ [70:9] ==> private final val classNamePrefixMatchers: List<PrefixMatcher> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'nameSuggestionPrefixes' @ [70:35] ==> val nameSuggestionPrefixes: List<String> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.<init>[LocalVariableDescriptor]

'map' @ [70:58] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> CamelHumpMatcher): List<CamelHumpMatcher> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> CamelHumpMatcher

'CamelHumpMatcher' @ [70:64] ==> public constructor CamelHumpMatcher(p0: (String..String?), p1: Boolean) defined in com.intellij.codeInsight.completion.impl.CamelHumpMatcher[JavaClassConstructorDescriptor]

'it' @ [70:81] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.<init>.<anonymous>[ValueParameterDescriptorImpl]

'capitalize' @ [70:84] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'HashSet' @ [73:43] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Type

'component1' @ [76:15] ==> public final operator fun component1(): PrefixMatcher defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [76:33] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'classNamePrefixMatchers' @ [76:48] ==> private final val classNamePrefixMatchers: List<PrefixMatcher> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'zip' @ [76:72] ==> public infix fun <T, R> Iterable<PrefixMatcher>.zip(other: Iterable<String>): List<Pair<PrefixMatcher, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PrefixMatcher
    <R> -> String

'userPrefixes' @ [76:76] ==> private final val userPrefixes: List<String> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'position' @ [77:35] ==> value-parameter position: PsiElement defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromImportedClasses[ValueParameterDescriptorImpl]

'getResolutionScope' @ [77:44] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [77:63] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromImportedClasses[ValueParameterDescriptorImpl]

'resolutionFacade' @ [77:79] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'resolutionScope' @ [78:31] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromImportedClasses[LocalVariableDescriptor]

'collectDescriptorsFiltered' @ [78:47] ==> public fun HierarchicalScope.collectDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ..., changeNamesForAliased: Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [78:74] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'NON_SINGLETON_CLASSIFIERS' @ [78:95] ==> @field:JvmField public final val NON_SINGLETON_CLASSIFIERS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'classNameMatcher' @ [78:122] ==> val classNameMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromImportedClasses[LocalVariableDescriptor]

'asNameFilter' @ [78:139] ==> public fun PrefixMatcher.asNameFilter(): (Name) -> Boolean defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]

'classifiers' @ [80:32] ==> val classifiers: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromImportedClasses[LocalVariableDescriptor]

'invoke' @ [81:21] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'classifier' @ [81:38] ==> val classifier: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromImportedClasses[LocalVariableDescriptor]

'addSuggestionsForClassifier' @ [82:21] ==> private final fun addSuggestionsForClassifier(classifier: DeclarationDescriptor, userPrefix: String, notImported: Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[SimpleFunctionDescriptorImpl]

'classifier' @ [82:49] ==> val classifier: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromImportedClasses[LocalVariableDescriptor]

'userPrefix' @ [82:61] ==> val userPrefix: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromImportedClasses[LocalVariableDescriptor]

'collector' @ [86:13] ==> private final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'flushToResultSet' @ [86:23] ==> public final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'component1' @ [91:15] ==> public final operator fun component1(): PrefixMatcher defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [91:33] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'classNamePrefixMatchers' @ [91:48] ==> private final val classNamePrefixMatchers: List<PrefixMatcher> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'zip' @ [91:72] ==> public infix fun <T, R> Iterable<PrefixMatcher>.zip(other: Iterable<String>): List<Pair<PrefixMatcher, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PrefixMatcher
    <R> -> String

'userPrefixes' @ [91:76] ==> private final val userPrefixes: List<String> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'AllClassesCompletion' @ [92:13] ==> public constructor AllClassesCompletion(parameters: CompletionParameters, kotlinIndicesHelper: KotlinIndicesHelper, prefixMatcher: PrefixMatcher, resolutionFacade: ResolutionFacade, kindFilter: (ClassKind) -> Boolean, includeTypeAliases: Boolean, includeJavaClassesNotToBeUsed: Boolean) defined in org.jetbrains.kotlin.idea.completion.AllClassesCompletion[ClassConstructorDescriptorImpl]

'parameters' @ [93:21] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromAllClasses[ValueParameterDescriptorImpl]

'indicesHelper' @ [93:33] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromAllClasses[ValueParameterDescriptorImpl]

'classNameMatcher' @ [93:48] ==> val classNameMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromAllClasses[LocalVariableDescriptor]

'resolutionFacade' @ [93:66] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'!' @ [93:86] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [93:87] ==> value-parameter it: ClassKind defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromAllClasses.<anonymous>[ValueParameterDescriptorImpl]

'isSingleton' @ [93:90] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'collect' @ [95:15] ==> public final fun collect(classifierDescriptorCollector: (ClassifierDescriptorWithTypeParameters) -> Unit, javaClassCollector: (PsiClass) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.AllClassesCompletion[SimpleFunctionDescriptorImpl]

'addSuggestionsForClassifier' @ [96:23] ==> private final fun addSuggestionsForClassifier(classifier: DeclarationDescriptor, userPrefix: String, notImported: Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[SimpleFunctionDescriptorImpl]

'it' @ [96:51] ==> value-parameter it: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromAllClasses.<anonymous>[ValueParameterDescriptorImpl]

'userPrefix' @ [96:55] ==> val userPrefix: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromAllClasses[LocalVariableDescriptor]

'addSuggestionsForJavaClass' @ [97:23] ==> private final fun addSuggestionsForJavaClass(psiClass: PsiClass, userPrefix: String, notImported: Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[SimpleFunctionDescriptorImpl]

'it' @ [97:50] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromAllClasses.<anonymous>[ValueParameterDescriptorImpl]

'userPrefix' @ [97:54] ==> val userPrefix: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromAllClasses[LocalVariableDescriptor]

'collector' @ [100:13] ==> private final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'flushToResultSet' @ [100:23] ==> public final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'LinkedHashMap' @ [105:36] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> LookupElement
    <V : (Any..Any?)> -> Int

'position' @ [106:9] ==> value-parameter position: PsiElement defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile[ValueParameterDescriptorImpl]

'containingFile' @ [106:18] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'forEachDescendantOfType' @ [106:33] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(crossinline canGoInside: (PsiElement) -> Boolean, noinline action: (KtParameter) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtParameter

'it' @ [107:33] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [107:56] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[ValueParameterDescriptorImpl]

'checkCanceled' @ [109:29] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'parameter' @ [111:24] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [111:34] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'name' @ [112:17] ==> val name: String? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[LocalVariableDescriptor]

'prefixMatcher' @ [112:33] ==> private final val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'isStartMatch' @ [112:47] ==> public open fun isStartMatch(p0: (String..String?)): Boolean defined in com.intellij.codeInsight.completion.PrefixMatcher[JavaMethodDescriptor]

'name' @ [112:60] ==> val name: String? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[LocalVariableDescriptor]

'resolutionFacade' @ [113:34] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile[ValueParameterDescriptorImpl]

'analyze' @ [113:51] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'parameter' @ [113:59] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[ValueParameterDescriptorImpl]

'VALUE_PARAMETER' @ [113:85] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parameter' @ [113:102] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [114:21] ==> val descriptor: VariableDescriptor? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [115:41] ==> val descriptor: VariableDescriptor? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[LocalVariableDescriptor]

'type' @ [115:52] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'parameterType' @ [116:25] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[LocalVariableDescriptor]

'isVisible' @ [116:39] ==> private final fun KotlinType.isVisible(visibilityFilter: (DeclarationDescriptor) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[SimpleFunctionDescriptorImpl]

'visibilityFilter' @ [116:49] ==> value-parameter visibilityFilter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile[ValueParameterDescriptorImpl]

'MyLookupElement' @ [117:45] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[FakeCallableDescriptorForObject]

'create' @ [117:61] ==> public final fun create(parameterName: String, type: ParameterNameAndTypeCompletion.Type, factory: BasicLookupElementFactory): LookupElement? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.Companion[SimpleFunctionDescriptorImpl]

'name' @ [117:68] ==> val name: String? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[LocalVariableDescriptor]

'ArbitraryType' @ [117:74] ==> public constructor ArbitraryType(type: KotlinType) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.ArbitraryType[ClassConstructorDescriptorImpl]

'parameterType' @ [117:88] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[LocalVariableDescriptor]

'lookupElementFactory' @ [117:104] ==> private final val lookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'lookupElementToCount' @ [118:37] ==> val lookupElementToCount: LinkedHashMap<LookupElement, Int> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile[LocalVariableDescriptor]

'lookupElement' @ [118:58] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[LocalVariableDescriptor]

'lookupElementToCount' @ [119:25] ==> val lookupElementToCount: LinkedHashMap<LookupElement, Int> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile[LocalVariableDescriptor]

'lookupElement' @ [119:46] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[LocalVariableDescriptor]

'count' @ [119:63] ==> val count: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile.<anonymous>[LocalVariableDescriptor]

'component1' @ [125:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<LookupElement, Int>.component1(): LookupElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LookupElement
    <V> -> Int

'component2' @ [125:30] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<LookupElement, Int>.component2(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LookupElement
    <V> -> Int

'lookupElementToCount' @ [125:40] ==> val lookupElementToCount: LinkedHashMap<LookupElement, Int> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile[LocalVariableDescriptor]

'lookupElement' @ [126:13] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile[LocalVariableDescriptor]

'putUserData' @ [126:27] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Int..Int?)>, @Nullable p1: Int?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Int

'PRIORITY_KEY' @ [126:39] ==> private final val PRIORITY_KEY: Key<Int> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Companion[PropertyDescriptorImpl]

'-' @ [126:53] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'count' @ [126:54] ==> val count: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile[LocalVariableDescriptor]

'collector' @ [127:13] ==> private final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'addElement' @ [127:23] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [127:34] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addFromParametersInFile[LocalVariableDescriptor]

'addSuggestions' @ [132:9] ==> private final fun addSuggestions(className: String, userPrefix: String, type: ParameterNameAndTypeCompletion.Type, notImported: Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[SimpleFunctionDescriptorImpl]

'classifier' @ [132:24] ==> value-parameter classifier: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestionsForClassifier[ValueParameterDescriptorImpl]

'name' @ [132:35] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [132:40] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'userPrefix' @ [132:52] ==> value-parameter userPrefix: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestionsForClassifier[ValueParameterDescriptorImpl]

'DescriptorType' @ [132:64] ==> public constructor DescriptorType(classifier: ClassifierDescriptor) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.DescriptorType[ClassConstructorDescriptorImpl]

'classifier' @ [132:79] ==> value-parameter classifier: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestionsForClassifier[ValueParameterDescriptorImpl]

'notImported' @ [132:116] ==> value-parameter notImported: Boolean defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestionsForClassifier[ValueParameterDescriptorImpl]

'addSuggestions' @ [136:9] ==> private final fun addSuggestions(className: String, userPrefix: String, type: ParameterNameAndTypeCompletion.Type, notImported: Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[SimpleFunctionDescriptorImpl]

'psiClass' @ [136:24] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestionsForJavaClass[ValueParameterDescriptorImpl]

'name' @ [136:33] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'userPrefix' @ [136:41] ==> value-parameter userPrefix: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestionsForJavaClass[ValueParameterDescriptorImpl]

'JavaClassType' @ [136:53] ==> public constructor JavaClassType(psiClass: PsiClass) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.JavaClassType[ClassConstructorDescriptorImpl]

'psiClass' @ [136:67] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestionsForJavaClass[ValueParameterDescriptorImpl]

'notImported' @ [136:78] ==> value-parameter notImported: Boolean defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestionsForJavaClass[ValueParameterDescriptorImpl]

'checkCanceled' @ [140:25] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'suggestionsByTypesAdded' @ [141:13] ==> private final val suggestionsByTypesAdded: HashSet<ParameterNameAndTypeCompletion.Type> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'contains' @ [141:37] ==> public open fun contains(element: ParameterNameAndTypeCompletion.Type): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'type' @ [141:46] ==> value-parameter type: ParameterNameAndTypeCompletion.Type defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[ValueParameterDescriptorImpl]

'KotlinNameSuggester' @ [143:31] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'getCamelNames' @ [143:51] ==> public final fun getCamelNames(name: String, validator: (String) -> Boolean, startLowerCase: Boolean): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'className' @ [143:65] ==> value-parameter className: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[ValueParameterDescriptorImpl]

'userPrefix' @ [143:86] ==> value-parameter userPrefix: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[ValueParameterDescriptorImpl]

'isEmpty' @ [143:97] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'nameSuggestions' @ [144:22] ==> val nameSuggestions: List<String> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[LocalVariableDescriptor]

'userPrefix' @ [145:33] ==> value-parameter userPrefix: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[ValueParameterDescriptorImpl]

'name' @ [145:46] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[LocalVariableDescriptor]

'prefixMatcher' @ [146:17] ==> private final val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'isStartMatch' @ [146:31] ==> public open fun isStartMatch(p0: (String..String?)): Boolean defined in com.intellij.codeInsight.completion.PrefixMatcher[JavaMethodDescriptor]

'parameterName' @ [146:44] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[LocalVariableDescriptor]

'MyLookupElement' @ [147:37] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[FakeCallableDescriptorForObject]

'create' @ [147:53] ==> public final fun create(parameterName: String, type: ParameterNameAndTypeCompletion.Type, factory: BasicLookupElementFactory): LookupElement? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.Companion[SimpleFunctionDescriptorImpl]

'parameterName' @ [147:60] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[LocalVariableDescriptor]

'type' @ [147:75] ==> value-parameter type: ParameterNameAndTypeCompletion.Type defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[ValueParameterDescriptorImpl]

'lookupElementFactory' @ [147:81] ==> private final val lookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'lookupElement' @ [148:21] ==> val lookupElement: LookupElement? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[LocalVariableDescriptor]

'lookupElement' @ [149:21] ==> val lookupElement: LookupElement? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[LocalVariableDescriptor]

'putUserData' @ [149:35] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Int..Int?)>, @Nullable p1: Int?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Int

'PRIORITY_KEY' @ [149:47] ==> private final val PRIORITY_KEY: Key<Int> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Companion[PropertyDescriptorImpl]

'userPrefix' @ [149:61] ==> value-parameter userPrefix: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[ValueParameterDescriptorImpl]

'length' @ [149:72] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'collector' @ [150:21] ==> private final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'addElement' @ [150:31] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [150:42] ==> val lookupElement: LookupElement? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[LocalVariableDescriptor]

'notImported' @ [150:57] ==> value-parameter notImported: Boolean defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[ValueParameterDescriptorImpl]

'suggestionsByTypesAdded' @ [151:21] ==> private final val suggestionsByTypesAdded: HashSet<ParameterNameAndTypeCompletion.Type> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[PropertyDescriptorImpl]

'add' @ [151:45] ==> public open fun add(element: ParameterNameAndTypeCompletion.Type): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'type' @ [151:49] ==> value-parameter type: ParameterNameAndTypeCompletion.Type defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.addSuggestions[ValueParameterDescriptorImpl]

'isError' @ [158:13] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'constructor' @ [159:26] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [159:38] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'invoke' @ [160:16] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'classifier' @ [160:33] ==> val classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.isVisible[LocalVariableDescriptor]

'arguments' @ [160:48] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'all' @ [160:58] ==> public inline fun <T> Iterable<TypeProjection>.all(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [160:64] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.isVisible.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [160:67] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'it' @ [160:87] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.isVisible.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [160:90] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'isVisible' @ [160:95] ==> private final fun KotlinType.isVisible(visibilityFilter: (DeclarationDescriptor) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[SimpleFunctionDescriptorImpl]

'visibilityFilter' @ [160:105] ==> value-parameter visibilityFilter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.isVisible[ValueParameterDescriptorImpl]

'other' @ [166:44] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Type.equals[ValueParameterDescriptorImpl]

'other' @ [166:61] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Type.equals[ValueParameterDescriptorImpl]

'idString' @ [166:67] ==> private final val idString: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Type[PropertyDescriptorImpl]

'idString' @ [166:79] ==> private final val idString: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Type[PropertyDescriptorImpl]

'idString' @ [167:35] ==> private final val idString: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Type[PropertyDescriptorImpl]

'hashCode' @ [167:44] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'Type' @ [170:82] ==> public constructor Type(idString: String) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Type[ClassConstructorDescriptorImpl]

'IdeDescriptorRenderers' @ [170:87] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [170:110] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderClassifierName' @ [170:122] ==> public abstract fun renderClassifierName(klass: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'classifier' @ [170:143] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.DescriptorType.<init>[ValueParameterDescriptorImpl]

'lookupElementFactory' @ [172:19] ==> value-parameter lookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.DescriptorType.createTypeLookupElement[ValueParameterDescriptorImpl]

'createLookupElement' @ [172:40] ==> public final fun createLookupElement(descriptor: DeclarationDescriptor, qualifyNestedClasses: Boolean = ..., includeClassTypeArguments: Boolean = ..., parametersAndTypeGrayed: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'classifier' @ [172:60] ==> private final val classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.DescriptorType[PropertyDescriptorImpl]

'Type' @ [175:67] ==> public constructor Type(idString: String) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Type[ClassConstructorDescriptorImpl]

'psiClass' @ [175:72] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.JavaClassType.<init>[ValueParameterDescriptorImpl]

'qualifiedName' @ [175:81] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'lookupElementFactory' @ [177:19] ==> value-parameter lookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.JavaClassType.createTypeLookupElement[ValueParameterDescriptorImpl]

'createLookupElementForJavaClass' @ [177:40] ==> public final fun createLookupElementForJavaClass(psiClass: PsiClass, qualifyNestedClasses: Boolean = ..., includeClassTypeArguments: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'psiClass' @ [177:72] ==> private final val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.JavaClassType[PropertyDescriptorImpl]

'Type' @ [180:65] ==> public constructor Type(idString: String) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Type[ClassConstructorDescriptorImpl]

'IdeDescriptorRenderers' @ [180:70] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [180:93] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [180:105] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [180:116] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.ArbitraryType.<init>[ValueParameterDescriptorImpl]

'lookupElementFactory' @ [182:19] ==> value-parameter lookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.ArbitraryType.createTypeLookupElement[ValueParameterDescriptorImpl]

'createLookupElementForType' @ [182:40] ==> public fun BasicLookupElementFactory.createLookupElementForType(type: KotlinType): LookupElement? defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'type' @ [182:67] ==> private final val type: KotlinType defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.ArbitraryType[PropertyDescriptorImpl]

'LookupElementDecorator<LookupElement>' @ [189:9] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'typeLookupElement' @ [189:47] ==> value-parameter typeLookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.<init>[ValueParameterDescriptorImpl]

'type' @ [193:41] ==> value-parameter type: ParameterNameAndTypeCompletion.Type defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.Companion.create[ValueParameterDescriptorImpl]

'createTypeLookupElement' @ [193:46] ==> public abstract fun createTypeLookupElement(lookupElementFactory: BasicLookupElementFactory): LookupElement? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Type[SimpleFunctionDescriptorImpl]

'factory' @ [193:70] ==> value-parameter factory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.Companion.create[ValueParameterDescriptorImpl]

'MyLookupElement' @ [194:37] ==> private constructor MyLookupElement(parameterName: String, type: ParameterNameAndTypeCompletion.Type, typeLookupElement: LookupElement) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[ClassConstructorDescriptorImpl]

'parameterName' @ [194:53] ==> value-parameter parameterName: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.Companion.create[ValueParameterDescriptorImpl]

'type' @ [194:68] ==> value-parameter type: ParameterNameAndTypeCompletion.Type defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.Companion.create[ValueParameterDescriptorImpl]

'typeLookupElement' @ [194:74] ==> val typeLookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.Companion.create[LocalVariableDescriptor]

'lookupElement' @ [195:24] ==> val lookupElement: ParameterNameAndTypeCompletion.MyLookupElement defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.Companion.create[LocalVariableDescriptor]

'suppressAutoInsertion' @ [195:38] ==> public fun LookupElement.suppressAutoInsertion(): LookupElement defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]

'parameterName' @ [200:36] ==> private final val parameterName: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[PropertyDescriptorImpl]

'delegate' @ [200:60] ==> public final val ParameterNameAndTypeCompletion.MyLookupElement.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'lookupString' @ [200:69] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'lookupString' @ [202:42] ==> private final val lookupString: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[PropertyDescriptorImpl]

'setOf' @ [203:46] ==> public fun <T> setOf(element: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'lookupString' @ [203:52] ==> private final val lookupString: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[PropertyDescriptorImpl]

'super' @ [206:13] ==> <this> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[LazyClassReceiverParameterDescriptor]

'renderElement' @ [206:19] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'presentation' @ [206:33] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [207:13] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [207:26] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'parameterName' @ [207:37] ==> private final val parameterName: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[PropertyDescriptorImpl]

'presentation' @ [207:60] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [207:73] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'context' @ [211:17] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[ValueParameterDescriptorImpl]

'completionChar' @ [211:25] ==> public final val InsertionContext.completionChar: Char[MyPropertyDescriptor]

'REPLACE_SELECT_CHAR' @ [211:50] ==> public const final val REPLACE_SELECT_CHAR: Char defined in com.intellij.codeInsight.lookup.Lookup[JavaPropertyDescriptor]

'context' @ [212:41] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[ValueParameterDescriptorImpl]

'offsetMap' @ [212:49] ==> public final val InsertionContext.offsetMap: (OffsetMap..OffsetMap?)[MyPropertyDescriptor]

'tryGetOffset' @ [212:59] ==> public fun OffsetMap.tryGetOffset(key: OffsetKey): Int? defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'REPLACEMENT_OFFSET' @ [212:72] ==> public final val REPLACEMENT_OFFSET: (OffsetKey..OffsetKey?) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Companion[PropertyDescriptorImpl]

'replacementOffset' @ [213:21] ==> val replacementOffset: Int? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'context' @ [214:38] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[ValueParameterDescriptorImpl]

'tailOffset' @ [214:46] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'context' @ [215:21] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[ValueParameterDescriptorImpl]

'document' @ [215:29] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'deleteString' @ [215:38] ==> public abstract fun deleteString(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'tailOffset' @ [215:51] ==> val tailOffset: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'replacementOffset' @ [215:63] ==> val replacementOffset: Int? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'context' @ [217:33] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[ValueParameterDescriptorImpl]

'document' @ [217:41] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'charsSequence' @ [217:50] ==> public final val Document.charsSequence: CharSequence[MyPropertyDescriptor]

'chars' @ [218:34] ==> val chars: CharSequence defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'skipSpaces' @ [218:40] ==> public fun CharSequence.skipSpaces(index: Int): Int defined in org.jetbrains.kotlin.idea.completion.handlers in file handlerUtils.kt[SimpleFunctionDescriptorImpl]

'tailOffset' @ [218:51] ==> val tailOffset: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'chars' @ [219:25] ==> val chars: CharSequence defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'isCharAt' @ [219:31] ==> public fun CharSequence.isCharAt(offset: Int, c: Char): Boolean defined in org.jetbrains.kotlin.idea.completion.handlers[SimpleFunctionDescriptorImpl]

'offset' @ [219:40] ==> var offset: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'offset' @ [220:25] ==> var offset: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'offset' @ [221:25] ==> var offset: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'chars' @ [221:34] ==> val chars: CharSequence defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'skipSpaces' @ [221:40] ==> public fun CharSequence.skipSpaces(index: Int): Int defined in org.jetbrains.kotlin.idea.completion.handlers in file handlerUtils.kt[SimpleFunctionDescriptorImpl]

'offset' @ [221:51] ==> var offset: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'context' @ [222:25] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[ValueParameterDescriptorImpl]

'editor' @ [222:33] ==> public final val InsertionContext.editor: Editor[MyPropertyDescriptor]

'moveCaret' @ [222:40] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'offset' @ [222:50] ==> var offset: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'getInstance' @ [227:53] ==> public open fun getInstance(@Nullable p0: Project?): (CodeStyleSettingsManager..CodeStyleSettingsManager?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsManager[JavaMethodDescriptor]

'context' @ [227:65] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[ValueParameterDescriptorImpl]

'project' @ [227:73] ==> public final val InsertionContext.project: (Project..Project?)[MyPropertyDescriptor]

'currentSettings' @ [227:82] ==> public final val CodeStyleSettingsManager.currentSettings: CodeStyleSettings[MyPropertyDescriptor]

'getCustomSettings' @ [227:98] ==> public open fun <T : (CustomCodeStyleSettings..CustomCodeStyleSettings?)> getCustomSettings(@NotNull p0: Class<(KotlinCodeStyleSettings..KotlinCodeStyleSettings?)>): (KotlinCodeStyleSettings..KotlinCodeStyleSettings?) defined in com.intellij.psi.codeStyle.CodeStyleSettings[JavaMethodDescriptor]
Inferred types:
    <T : (CustomCodeStyleSettings..CustomCodeStyleSettings?)> -> KotlinCodeStyleSettings

'KotlinCodeStyleSettings' @ [227:116] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'java' @ [227:147] ==> public val <T> KClass<KotlinCodeStyleSettings>.java: Class<KotlinCodeStyleSettings> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinCodeStyleSettings

'if (settings.SPACE_BEFORE_TYPE_COLON) " " else ""' @ [228:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'settings' @ [228:35] ==> val settings: (KotlinCodeStyleSettings..KotlinCodeStyleSettings?) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'SPACE_BEFORE_TYPE_COLON' @ [228:44] ==> public final var SPACE_BEFORE_TYPE_COLON: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'if (settings.SPACE_AFTER_TYPE_COLON) " " else ""' @ [229:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'settings' @ [229:34] ==> val settings: (KotlinCodeStyleSettings..KotlinCodeStyleSettings?) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'SPACE_AFTER_TYPE_COLON' @ [229:43] ==> public final var SPACE_AFTER_TYPE_COLON: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'parameterName' @ [230:24] ==> private final val parameterName: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[PropertyDescriptorImpl]

'spaceBefore' @ [230:40] ==> val spaceBefore: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'spaceAfter' @ [230:60] ==> val spaceAfter: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'context' @ [231:31] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[ValueParameterDescriptorImpl]

'startOffset' @ [231:39] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'context' @ [232:13] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[ValueParameterDescriptorImpl]

'document' @ [232:21] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'insertString' @ [232:30] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'startOffset' @ [232:43] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'text' @ [232:56] ==> val text: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'context' @ [235:13] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[ValueParameterDescriptorImpl]

'offsetMap' @ [235:21] ==> public final val InsertionContext.offsetMap: (OffsetMap..OffsetMap?)[MyPropertyDescriptor]

'addOffset' @ [235:31] ==> public open fun addOffset(p0: (OffsetKey..OffsetKey?), p1: Int): Unit defined in com.intellij.codeInsight.completion.OffsetMap[JavaMethodDescriptor]

'START_OFFSET' @ [235:73] ==> public final val START_OFFSET: (OffsetKey..OffsetKey?) defined in com.intellij.codeInsight.completion.CompletionInitializationContext[JavaPropertyDescriptor]

'startOffset' @ [235:87] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'text' @ [235:101] ==> val text: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[LocalVariableDescriptor]

'length' @ [235:106] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'super' @ [237:13] ==> <this> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[LazyClassReceiverParameterDescriptor]

'handleInsert' @ [237:19] ==> public open fun handleInsert(p0: (InsertionContext..InsertionContext?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'context' @ [237:32] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.handleInsert[ValueParameterDescriptorImpl]

'other' @ [241:19] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.equals[ValueParameterDescriptorImpl]

'parameterName' @ [241:47] ==> private final val parameterName: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[PropertyDescriptorImpl]

'other' @ [241:64] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.equals[ValueParameterDescriptorImpl]

'parameterName' @ [241:70] ==> private final val parameterName: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[PropertyDescriptorImpl]

'type' @ [241:87] ==> private final val type: ParameterNameAndTypeCompletion.Type defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[PropertyDescriptorImpl]

'other' @ [241:95] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement.equals[ValueParameterDescriptorImpl]

'type' @ [241:101] ==> private final val type: ParameterNameAndTypeCompletion.Type defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[PropertyDescriptorImpl]

'parameterName' @ [242:35] ==> private final val parameterName: String defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.MyLookupElement[PropertyDescriptorImpl]

'hashCode' @ [242:49] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'Key' @ [246:36] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Int

'create' @ [248:44] ==> public open fun create(@NonNls p0: (String..String?)): (OffsetKey..OffsetKey?) defined in com.intellij.codeInsight.completion.OffsetKey[JavaMethodDescriptor]

'LookupElementWeigher' @ [251:22] ==> protected/*protected and package*/ constructor LookupElementWeigher(p0: (String..String?)) defined in com.intellij.codeInsight.lookup.LookupElementWeigher[JavaClassConstructorDescriptor]

'element' @ [252:85] ==> value-parameter element: LookupElement defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Weigher.weigh[ValueParameterDescriptorImpl]

'getUserData' @ [252:93] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Int..Int?)>): Int? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Int

'PRIORITY_KEY' @ [252:105] ==> private final val PRIORITY_KEY: Key<Int> defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion.Companion[PropertyDescriptorImpl]

