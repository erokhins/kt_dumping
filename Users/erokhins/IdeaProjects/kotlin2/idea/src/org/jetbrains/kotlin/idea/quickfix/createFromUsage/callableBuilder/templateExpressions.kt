'Expression' @ [43:76] ==> public constructor Expression() defined in com.intellij.codeInsight.template.Expression[JavaClassConstructorDescriptor]

'assert' @ [45:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'names' @ [45:16] ==> private final val names: Array<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression[PropertyDescriptorImpl]

'all' @ [45:22] ==> public inline fun <T> Array<out String>.all(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [45:26] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'calculateLookupItems' @ [49:27] ==> public open fun calculateLookupItems(context: ExpressionContext?): Array<LookupElement>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression[SimpleFunctionDescriptorImpl]

'context' @ [49:48] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateResult[ValueParameterDescriptorImpl]

'TextResult' @ [50:16] ==> public constructor TextResult(@NotNull p0: String) defined in com.intellij.codeInsight.template.TextResult[JavaClassConstructorDescriptor]

'if (lookupItems.isEmpty()) "" else lookupItems.first().lookupString' @ [50:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'lookupItems' @ [50:31] ==> val lookupItems: Array<LookupElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateResult[LocalVariableDescriptor]

'isEmpty' @ [50:43] ==> @InlineOnly public inline fun <T> Array<out LookupElement>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'lookupItems' @ [50:62] ==> val lookupItems: Array<LookupElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateResult[LocalVariableDescriptor]

'first' @ [50:74] ==> public fun <T> Array<out LookupElement>.first(): LookupElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'lookupString' @ [50:82] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'calculateResult' @ [53:70] ==> public open fun calculateResult(context: ExpressionContext?): Result? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression[SimpleFunctionDescriptorImpl]

'context' @ [53:86] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateQuickResult[ValueParameterDescriptorImpl]

'context' @ [56:9] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [57:21] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: (MutableCollection<out (String..String?)>..Collection<(String..String?)>?)) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'this' @ [57:35] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression[LazyClassReceiverParameterDescriptor]

'names' @ [57:40] ==> private final val names: Array<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression[PropertyDescriptorImpl]

'toList' @ [57:46] ==> public fun <T> Array<out String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'context' @ [60:23] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[ValueParameterDescriptorImpl]

'project' @ [60:31] ==> public final val ExpressionContext.project: (Project..Project?)[MyPropertyDescriptor]

'context' @ [61:22] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[ValueParameterDescriptorImpl]

'startOffset' @ [61:30] ==> public final val ExpressionContext.startOffset: Int[MyPropertyDescriptor]

'getInstance' @ [62:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [62:40] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'commitAllDocuments' @ [62:49] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'context' @ [63:22] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[ValueParameterDescriptorImpl]

'editor' @ [63:30] ==> public final val ExpressionContext.editor: Editor?[MyPropertyDescriptor]

'getInstance' @ [64:39] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [64:51] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'getPsiFile' @ [64:60] ==> @Nullable public abstract fun getPsiFile(@NotNull p0: Document): PsiFile? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [64:71] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'document' @ [64:78] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'file' @ [65:25] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'findElementAt' @ [65:30] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'offset' @ [65:44] ==> val offset: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'?:' @ [66:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtTypeParameterListOwner?, right: KtTypeParameterListOwner): KtTypeParameterListOwner[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtTypeParameterListOwner

'getParentOfType' @ [66:39] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (KtTypeParameterListOwner..KtTypeParameterListOwner?)>..Class<out (KtTypeParameterListOwner..KtTypeParameterListOwner?)>?)): KtTypeParameterListOwner? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtTypeParameterListOwner

'elementAt' @ [66:55] ==> val elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'java' @ [66:84] ==> public val <T> KClass<KtFunction>.java: Class<KtFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFunction

'java' @ [66:105] ==> public val <T> KClass<KtClass>.java: Class<KtClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClass

'arrayOf' @ [66:121] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: LookupElement): Array<LookupElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> LookupElement

'when (declaration) {
            is KtFunction -> declaration.valueParameterList!!
            is KtClass -> declaration.getPrimaryConstructorParameterList()!!
            else -> throw AssertionError("Unexpected declaration: ${declaration.text}")
        }' @ [67:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtParameterList, entry1: KtParameterList, entry2: KtParameterList): KtParameterList[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtParameterList

'declaration' @ [67:35] ==> val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'declaration' @ [68:30] ==> val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'valueParameterList' @ [68:42] ==> public final val KtFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'declaration' @ [69:27] ==> val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'getPrimaryConstructorParameterList' @ [69:39] ==> public final fun getPrimaryConstructorParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'AssertionError' @ [70:27] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'declaration' @ [70:69] ==> val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'text' @ [70:81] ==> public final val KtTypeParameterListOwner.text: (String..String?)[MyPropertyDescriptor]

'elementAt' @ [74:25] ==> val elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'getStrictParentOfType' @ [74:36] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtParameter? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtParameter

'parameter' @ [75:13] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'parameter' @ [76:36] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'typeReference' @ [76:46] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'parameterTypeRef' @ [77:17] ==> val parameterTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'parameterTypeToNamesMap' @ [78:49] ==> private final val parameterTypeToNamesMap: Map<String, Array<String>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression[PropertyDescriptorImpl]

'parameterTypeRef' @ [78:73] ==> val parameterTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'text' @ [78:90] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'suggestedNamesBasedOnType' @ [79:21] ==> val suggestedNamesBasedOnType: Array<String>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'names' @ [80:21] ==> val names: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'addAll' @ [80:27] ==> public fun <T> MutableCollection<in String>.addAll(elements: Array<out String>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'suggestedNamesBasedOnType' @ [80:34] ==> val suggestedNamesBasedOnType: Array<String>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'parameterList' @ [86:30] ==> val parameterList: KtParameterList defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'parameters' @ [86:44] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'mapNotNullTo' @ [86:55] ==> public inline fun <T, R : Any, C : MutableCollection<in String>> Iterable<(KtParameter..KtParameter?)>.mapNotNullTo(destination: HashSet<String>, transform: ((KtParameter..KtParameter?)) -> String?): HashSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <R : Any> -> String
    <C : MutableCollection<in R>> -> HashSet<String>

'HashSet' @ [86:68] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'if (jetParameter == parameter) null else jetParameter.name' @ [87:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'jetParameter' @ [87:17] ==> value-parameter jetParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems.<anonymous>[ValueParameterDescriptorImpl]

'parameter' @ [87:33] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'jetParameter' @ [87:54] ==> value-parameter jetParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [87:67] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'names' @ [91:13] ==> val names: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'isEmpty' @ [91:19] ==> public open fun isEmpty(): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'names' @ [92:13] ==> val names: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'add' @ [92:19] ==> public open fun add(element: String): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'CollectingNameValidator' @ [96:25] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'parameterNames' @ [96:49] ==> val parameterNames: HashSet<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'names' @ [97:16] ==> val names: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'map' @ [97:22] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> LookupElementBuilder): List<LookupElementBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> LookupElementBuilder

'create' @ [97:49] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'KotlinNameSuggester' @ [97:56] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNameByName' @ [97:76] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'it' @ [97:94] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems.<anonymous>[ValueParameterDescriptorImpl]

'validator' @ [97:98] ==> val validator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterNameExpression.calculateLookupItems[LocalVariableDescriptor]

'toTypedArray' @ [97:112] ==> public inline fun <reified T> Collection<LookupElement>.toTypedArray(): Array<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> LookupElement

'Expression' @ [104:83] ==> public constructor Expression() defined in com.intellij.codeInsight.template.Expression[JavaClassConstructorDescriptor]

'TypeExpression' @ [105:67] ==> public constructor TypeExpression(typeCandidates: List<TypeCandidate>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression[ClassConstructorDescriptorImpl]

'typeCandidates' @ [105:82] ==> value-parameter typeCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForTypeReference.<init>[ValueParameterDescriptorImpl]

'typeCandidates' @ [107:17] ==> value-parameter typeCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForTypeReference.<init>[ValueParameterDescriptorImpl]

'map' @ [107:32] ==> public inline fun <T, R> Iterable<TypeCandidate>.map(transform: (TypeCandidate) -> (LookupElementBuilder..LookupElementBuilder?)): List<(LookupElementBuilder..LookupElementBuilder?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate
    <R> -> (com.intellij.codeInsight.lookup.LookupElementBuilder..com.intellij.codeInsight.lookup.LookupElementBuilder?)

'create' @ [107:59] ==> public open fun create(@NotNull p0: Any, @NotNull p1: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'it' @ [107:66] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForTypeReference.cachedLookupElements.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [107:70] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForTypeReference.cachedLookupElements.<anonymous>[ValueParameterDescriptorImpl]

'renderedTypes' @ [107:73] ==> public final var renderedTypes: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'first' @ [107:87] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'toTypedArray' @ [107:98] ==> public inline fun <reified T> Collection<LookupElement>.toTypedArray(): Array<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> LookupElement

'TypeExpression' @ [110:73] ==> public constructor TypeExpression(typeCandidates: List<TypeCandidate>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression[ClassConstructorDescriptorImpl]

'typeCandidates' @ [110:88] ==> value-parameter typeCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForDelegationSpecifier.<init>[ValueParameterDescriptorImpl]

'typeCandidates' @ [112:17] ==> value-parameter typeCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForDelegationSpecifier.<init>[ValueParameterDescriptorImpl]

'map' @ [112:32] ==> public inline fun <T, R> Iterable<TypeCandidate>.map(transform: (TypeCandidate) -> (LookupElementBuilder..LookupElementBuilder?)): List<(LookupElementBuilder..LookupElementBuilder?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate
    <R> -> (com.intellij.codeInsight.lookup.LookupElementBuilder..com.intellij.codeInsight.lookup.LookupElementBuilder?)

'it' @ [113:33] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForDelegationSpecifier.cachedLookupElements.<anonymous>[ValueParameterDescriptorImpl]

'theType' @ [113:36] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'decomposeIntersection' @ [113:44] ==> internal fun KotlinType.decomposeIntersection(): List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder[SimpleFunctionDescriptorImpl]

'types' @ [114:33] ==> val types: List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForDelegationSpecifier.cachedLookupElements.<anonymous>[LocalVariableDescriptor]

'it' @ [114:43] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForDelegationSpecifier.cachedLookupElements.<anonymous>[ValueParameterDescriptorImpl]

'renderedTypes' @ [114:46] ==> public final var renderedTypes: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'joinToString' @ [114:61] ==> public fun <T> Iterable<Pair<KotlinType, String>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Pair<KotlinType, String>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KotlinType, String>

'component1' @ [114:77] ==> public final operator fun component1(): KotlinType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [114:83] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'type' @ [115:42] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForDelegationSpecifier.cachedLookupElements.<anonymous>.<anonymous>[LocalVariableDescriptor]

'constructor' @ [115:47] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [115:59] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'renderedType' @ [116:25] ==> val renderedType: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForDelegationSpecifier.cachedLookupElements.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (descriptor.kind == ClassKind.INTERFACE) "" else "()"' @ [116:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'descriptor' @ [116:44] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForDelegationSpecifier.cachedLookupElements.<anonymous>.<anonymous>[LocalVariableDescriptor]

'kind' @ [116:55] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [116:73] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'create' @ [118:42] ==> public open fun create(@NotNull p0: Any, @NotNull p1: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'it' @ [118:49] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForDelegationSpecifier.cachedLookupElements.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [118:53] ==> val text: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.ForDelegationSpecifier.cachedLookupElements.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [119:19] ==> public inline fun <reified T> Collection<LookupElement>.toTypedArray(): Array<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> LookupElement

'calculateLookupItems' @ [125:27] ==> public open fun calculateLookupItems(context: ExpressionContext?): Array<LookupElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression[SimpleFunctionDescriptorImpl]

'context' @ [125:48] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.calculateResult[ValueParameterDescriptorImpl]

'TextResult' @ [126:16] ==> public constructor TextResult(@NotNull p0: String) defined in com.intellij.codeInsight.template.TextResult[JavaClassConstructorDescriptor]

'if (lookupItems.size == 0) "" else lookupItems[0].lookupString' @ [126:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'lookupItems' @ [126:31] ==> val lookupItems: Array<LookupElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.calculateResult[LocalVariableDescriptor]

'size' @ [126:43] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'lookupItems' @ [126:62] ==> val lookupItems: Array<LookupElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.calculateResult[LocalVariableDescriptor]

'lookupString' @ [126:77] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'calculateResult' @ [129:70] ==> public open fun calculateResult(context: ExpressionContext?): Result defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression[SimpleFunctionDescriptorImpl]

'context' @ [129:86] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression.calculateQuickResult[ValueParameterDescriptorImpl]

'cachedLookupElements' @ [131:70] ==> protected abstract val cachedLookupElements: Array<LookupElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeExpression[PropertyDescriptorImpl]

'Expression' @ [139:74] ==> public constructor Expression() defined in com.intellij.codeInsight.template.Expression[JavaClassConstructorDescriptor]

'if (insertLeadingSpace) " <" else "<"' @ [140:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'insertLeadingSpace' @ [140:30] ==> value-parameter insertLeadingSpace: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.<init>[ValueParameterDescriptorImpl]

'emptyList' @ [142:76] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TypeParameterDescriptor

'context' @ [146:9] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[ValueParameterDescriptorImpl]

'context' @ [147:23] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[ValueParameterDescriptorImpl]

'project' @ [147:31] ==> public final val ExpressionContext.project: (Project..Project?)[MyPropertyDescriptor]

'context' @ [148:22] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[ValueParameterDescriptorImpl]

'startOffset' @ [148:30] ==> public final val ExpressionContext.startOffset: Int[MyPropertyDescriptor]

'getInstance' @ [150:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [150:40] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'commitAllDocuments' @ [150:49] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'context' @ [151:22] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[ValueParameterDescriptorImpl]

'editor' @ [151:30] ==> public final val ExpressionContext.editor: Editor?[MyPropertyDescriptor]

'getInstance' @ [152:39] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [152:51] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'getPsiFile' @ [152:60] ==> @Nullable public abstract fun getPsiFile(@NotNull p0: Document): PsiFile? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [152:71] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'document' @ [152:78] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'file' @ [153:25] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'findElementAt' @ [153:30] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'offset' @ [153:44] ==> val offset: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'elementAt' @ [154:27] ==> val elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'getStrictParentOfType' @ [154:38] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedDeclaration

'TextResult' @ [154:92] ==> public constructor TextResult(@NotNull p0: String) defined in com.intellij.codeInsight.template.TextResult[JavaClassConstructorDescriptor]

'LinkedHashSet' @ [156:38] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> RenderedTypeParameter

'renderedTypeParameters' @ [157:9] ==> val renderedTypeParameters: LinkedHashSet<RenderedTypeParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'addAll' @ [157:32] ==> public open fun addAll(elements: Collection<RenderedTypeParameter>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'mandatoryTypeParameters' @ [157:39] ==> private final val mandatoryTypeParameters: List<RenderedTypeParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression[PropertyDescriptorImpl]

'declaration' @ [158:27] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'getValueParameters' @ [158:39] ==> public fun KtNamedDeclaration.getValueParameters(): List<KtParameter> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'parameter' @ [159:36] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'typeReference' @ [159:46] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'parameterTypeRef' @ [160:17] ==> val parameterTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'parameterTypeToTypeParameterNamesMap' @ [161:55] ==> private final val parameterTypeToTypeParameterNamesMap: Map<String, List<RenderedTypeParameter>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression[PropertyDescriptorImpl]

'parameterTypeRef' @ [161:92] ==> val parameterTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'text' @ [161:109] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'typeParameterNamesFromParameter' @ [162:21] ==> val typeParameterNamesFromParameter: List<RenderedTypeParameter>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'renderedTypeParameters' @ [163:21] ==> val renderedTypeParameters: LinkedHashSet<RenderedTypeParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'addAll' @ [163:44] ==> public open fun addAll(elements: Collection<RenderedTypeParameter>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'typeParameterNamesFromParameter' @ [163:51] ==> val typeParameterNamesFromParameter: List<RenderedTypeParameter>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'declaration' @ [167:29] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'getReturnTypeReference' @ [167:41] ==> internal fun KtNamedDeclaration.getReturnTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder[SimpleFunctionDescriptorImpl]

'returnTypeRef' @ [168:13] ==> val returnTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'parameterTypeToTypeParameterNamesMap' @ [169:52] ==> private final val parameterTypeToTypeParameterNamesMap: Map<String, List<RenderedTypeParameter>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression[PropertyDescriptorImpl]

'returnTypeRef' @ [169:89] ==> val returnTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'text' @ [169:103] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'typeParameterNamesFromReturnType' @ [170:17] ==> val typeParameterNamesFromReturnType: List<RenderedTypeParameter>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'renderedTypeParameters' @ [171:17] ==> val renderedTypeParameters: LinkedHashSet<RenderedTypeParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'addAll' @ [171:40] ==> public open fun addAll(elements: Collection<RenderedTypeParameter>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'typeParameterNamesFromReturnType' @ [171:47] ==> val typeParameterNamesFromReturnType: List<RenderedTypeParameter>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'renderedTypeParameters' @ [176:44] ==> val renderedTypeParameters: LinkedHashSet<RenderedTypeParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'sortedBy' @ [176:67] ==> public inline fun <T, R : Comparable<Int>> Iterable<RenderedTypeParameter>.sortedBy(crossinline selector: (RenderedTypeParameter) -> Int?): List<RenderedTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RenderedTypeParameter
    <R : Comparable<R>> -> Int

'if (it.fake) it.typeParameter.index else -1' @ [176:78] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'it' @ [176:82] ==> value-parameter it: RenderedTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult.<anonymous>[ValueParameterDescriptorImpl]

'fake' @ [176:85] ==> public final val fake: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.RenderedTypeParameter[PropertyDescriptorImpl]

'it' @ [176:91] ==> value-parameter it: RenderedTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult.<anonymous>[ValueParameterDescriptorImpl]

'typeParameter' @ [176:94] ==> public final val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.RenderedTypeParameter[PropertyDescriptorImpl]

'index' @ [176:108] ==> public final val TypeParameterDescriptor.index: Int[MyPropertyDescriptor]

'-' @ [176:119] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'currentTypeParameters' @ [177:9] ==> public final var currentTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression[PropertyDescriptorImpl]

'sortedRenderedTypeParameters' @ [177:33] ==> val sortedRenderedTypeParameters: List<RenderedTypeParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'map' @ [177:62] ==> public inline fun <T, R> Iterable<RenderedTypeParameter>.map(transform: (RenderedTypeParameter) -> TypeParameterDescriptor): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RenderedTypeParameter
    <R> -> TypeParameterDescriptor

'it' @ [177:68] ==> value-parameter it: RenderedTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult.<anonymous>[ValueParameterDescriptorImpl]

'typeParameter' @ [177:71] ==> public final val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.RenderedTypeParameter[PropertyDescriptorImpl]

'TextResult' @ [179:16] ==> public constructor TextResult(@NotNull p0: String) defined in com.intellij.codeInsight.template.TextResult[JavaClassConstructorDescriptor]

'if (sortedRenderedTypeParameters.isEmpty()) "" else sortedRenderedTypeParameters.joinToString(", ", prefix, ">") { it.text }' @ [180:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'sortedRenderedTypeParameters' @ [180:21] ==> val sortedRenderedTypeParameters: List<RenderedTypeParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'isEmpty' @ [180:50] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'sortedRenderedTypeParameters' @ [180:69] ==> val sortedRenderedTypeParameters: List<RenderedTypeParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult[LocalVariableDescriptor]

'joinToString' @ [180:98] ==> public fun <T> Iterable<RenderedTypeParameter>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((RenderedTypeParameter) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RenderedTypeParameter

'prefix' @ [180:117] ==> private final val prefix: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression[PropertyDescriptorImpl]

'it' @ [180:132] ==> value-parameter it: RenderedTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateResult.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [180:135] ==> public final val text: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.RenderedTypeParameter[PropertyDescriptorImpl]

'calculateResult' @ [184:78] ==> public open fun calculateResult(context: ExpressionContext?): Result defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression[SimpleFunctionDescriptorImpl]

'context' @ [184:94] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeParameterListExpression.calculateQuickResult[ValueParameterDescriptorImpl]

'arrayOf' @ [187:70] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: LookupElement): Array<LookupElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> LookupElement

