'ArrayList' @ [32:20] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LookupElement

'addToCollection' @ [33:9] ==> public final fun addToCollection(collection: MutableCollection<LookupElement>, expectedInfos: Collection<ExpectedInfo>): Unit defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems[SimpleFunctionDescriptorImpl]

'list' @ [33:25] ==> val list: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.collect[LocalVariableDescriptor]

'functionExpectedInfos' @ [33:31] ==> value-parameter functionExpectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.collect[ValueParameterDescriptorImpl]

'list' @ [34:16] ==> val list: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.collect[LocalVariableDescriptor]

'expectedInfos' @ [38:37] ==> value-parameter expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[ValueParameterDescriptorImpl]

'filterFunctionExpected' @ [38:51] ==> public fun Collection<ExpectedInfo>.filterFunctionExpected(): List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart[SimpleFunctionDescriptorImpl]

'functionExpectedInfos' @ [39:13] ==> val functionExpectedInfos: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'isEmpty' @ [39:35] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'functionExpectedInfos' @ [41:29] ==> val functionExpectedInfos: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'mapNotNull' @ [42:18] ==> public inline fun <T, R : Any> Iterable<ExpectedInfo>.mapNotNull(transform: (ExpectedInfo) -> KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo
    <R : Any> -> KotlinType

'it' @ [42:31] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [42:34] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'type' @ [42:45] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'toSet' @ [43:18] ==> public fun <T> Iterable<KotlinType>.toSet(): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'if (functionTypes.size == 1) functionTypes.single() else null' @ [45:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'functionTypes' @ [45:30] ==> val functionTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'size' @ [45:44] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'functionTypes' @ [45:55] ==> val functionTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'single' @ [45:69] ==> public fun <T> Iterable<KotlinType>.single(): KotlinType defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'singleType' @ [46:37] ==> val singleType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'let' @ [46:49] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Int): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Int

'singleSignatureLength' @ [47:39] ==> val singleSignatureLength: Int? defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'singleSignatureLength' @ [47:69] ==> val singleSignatureLength: Int? defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'offerNoParametersLambda' @ [48:13] ==> val offerNoParametersLambda: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'create' @ [49:54] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'LambdaSignatureTemplates' @ [49:61] ==> public object LambdaSignatureTemplates defined in org.jetbrains.kotlin.idea.completion in file LambdaSignatureTemplates.kt[FakeCallableDescriptorForObject]

'DEFAULT_LAMBDA_PRESENTATION' @ [49:86] ==> public final val DEFAULT_LAMBDA_PRESENTATION: String defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[PropertyDescriptorImpl]

'withInsertHandler' @ [50:22] ==> @Contract public open fun withInsertHandler(@Nullable p0: InsertHandler<(LookupElement..LookupElement?)>?): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'ArtificialElementInsertHandler' @ [50:40] ==> public constructor ArtificialElementInsertHandler(textBeforeCaret: String, textAfterCaret: String, shortenRefs: Boolean) defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler[ClassConstructorDescriptorImpl]

'suppressAutoInsertion' @ [51:22] ==> public fun LookupElement.suppressAutoInsertion(): LookupElement defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]

'assignSmartCompletionPriority' @ [52:22] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'LAMBDA_NO_PARAMS' @ [52:80] ==> enum entry LAMBDA_NO_PARAMS defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'addTailAndNameSimilarity' @ [53:22] ==> public fun LookupElement.addTailAndNameSimilarity(matchedExpectedInfos: Collection<ExpectedInfo>, nameSimilarityExpectedInfos: Collection<ExpectedInfo> = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart[SimpleFunctionDescriptorImpl]

'functionExpectedInfos' @ [53:47] ==> val functionExpectedInfos: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'collection' @ [54:13] ==> value-parameter collection: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[ValueParameterDescriptorImpl]

'add' @ [54:24] ==> public abstract fun add(element: LookupElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'lookupElement' @ [54:28] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'singleSignatureLength' @ [57:13] ==> val singleSignatureLength: Int? defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'functionTypes' @ [58:34] ==> val functionTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'if (LambdaSignatureTemplates.explicitParameterTypesRequired(functionTypes, functionType)) {
                    collection.add(createLookupElement(
                            functionType,
                            functionExpectedInfos,
                            LambdaSignatureTemplates.SignaturePresentation.NAMES_OR_TYPES,
                            explicitParameterTypes = true
                    ))

                }
                else {
                    collection.add(createLookupElement(
                            functionType,
                            functionExpectedInfos,
                            LambdaSignatureTemplates.SignaturePresentation.NAMES_AND_TYPES,
                            explicitParameterTypes = true
                    ))
                    collection.add(createLookupElement(
                            functionType,
                            functionExpectedInfos,
                            LambdaSignatureTemplates.SignaturePresentation.NAMES,
                            explicitParameterTypes = false
                    ))
                }' @ [59:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'LambdaSignatureTemplates' @ [59:21] ==> public object LambdaSignatureTemplates defined in org.jetbrains.kotlin.idea.completion in file LambdaSignatureTemplates.kt[FakeCallableDescriptorForObject]

'explicitParameterTypesRequired' @ [59:46] ==> public final fun explicitParameterTypesRequired(expectedFunctionTypes: Set<KotlinType>, lambdaType: KotlinType): Boolean defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'functionTypes' @ [59:77] ==> val functionTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'functionType' @ [59:92] ==> val functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'collection' @ [60:21] ==> value-parameter collection: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[ValueParameterDescriptorImpl]

'add' @ [60:32] ==> public abstract fun add(element: LookupElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'createLookupElement' @ [60:36] ==> private final fun createLookupElement(functionType: KotlinType, functionExpectedInfos: List<ExpectedInfo>, signaturePresentation: LambdaSignatureTemplates.SignaturePresentation, explicitParameterTypes: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems[SimpleFunctionDescriptorImpl]

'functionType' @ [61:29] ==> val functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'functionExpectedInfos' @ [62:29] ==> val functionExpectedInfos: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'LambdaSignatureTemplates' @ [63:29] ==> public object LambdaSignatureTemplates defined in org.jetbrains.kotlin.idea.completion in file LambdaSignatureTemplates.kt[FakeCallableDescriptorForObject]

'NAMES_OR_TYPES' @ [63:76] ==> enum entry NAMES_OR_TYPES defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.SignaturePresentation[FakeCallableDescriptorForObject]

'collection' @ [69:21] ==> value-parameter collection: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[ValueParameterDescriptorImpl]

'add' @ [69:32] ==> public abstract fun add(element: LookupElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'createLookupElement' @ [69:36] ==> private final fun createLookupElement(functionType: KotlinType, functionExpectedInfos: List<ExpectedInfo>, signaturePresentation: LambdaSignatureTemplates.SignaturePresentation, explicitParameterTypes: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems[SimpleFunctionDescriptorImpl]

'functionType' @ [70:29] ==> val functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'functionExpectedInfos' @ [71:29] ==> val functionExpectedInfos: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'LambdaSignatureTemplates' @ [72:29] ==> public object LambdaSignatureTemplates defined in org.jetbrains.kotlin.idea.completion in file LambdaSignatureTemplates.kt[FakeCallableDescriptorForObject]

'NAMES_AND_TYPES' @ [72:76] ==> enum entry NAMES_AND_TYPES defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.SignaturePresentation[FakeCallableDescriptorForObject]

'collection' @ [75:21] ==> value-parameter collection: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[ValueParameterDescriptorImpl]

'add' @ [75:32] ==> public abstract fun add(element: LookupElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'createLookupElement' @ [75:36] ==> private final fun createLookupElement(functionType: KotlinType, functionExpectedInfos: List<ExpectedInfo>, signaturePresentation: LambdaSignatureTemplates.SignaturePresentation, explicitParameterTypes: Boolean): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems[SimpleFunctionDescriptorImpl]

'functionType' @ [76:29] ==> val functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'functionExpectedInfos' @ [77:29] ==> val functionExpectedInfos: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.addToCollection[LocalVariableDescriptor]

'LambdaSignatureTemplates' @ [78:29] ==> public object LambdaSignatureTemplates defined in org.jetbrains.kotlin.idea.completion in file LambdaSignatureTemplates.kt[FakeCallableDescriptorForObject]

'NAMES' @ [78:76] ==> enum entry NAMES defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates.SignaturePresentation[FakeCallableDescriptorForObject]

'LambdaSignatureTemplates' @ [92:28] ==> public object LambdaSignatureTemplates defined in org.jetbrains.kotlin.idea.completion in file LambdaSignatureTemplates.kt[FakeCallableDescriptorForObject]

'lambdaPresentation' @ [92:53] ==> public final fun lambdaPresentation(lambdaType: KotlinType, presentationKind: LambdaSignatureTemplates.SignaturePresentation): String defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'functionType' @ [92:72] ==> value-parameter functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement[ValueParameterDescriptorImpl]

'signaturePresentation' @ [92:86] ==> value-parameter signaturePresentation: LambdaSignatureTemplates.SignaturePresentation defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement[ValueParameterDescriptorImpl]

'create' @ [93:37] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'lookupString' @ [93:44] ==> val lookupString: String defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement[LocalVariableDescriptor]

'withInsertHandler' @ [94:18] ==> @Contract public final fun withInsertHandler(@Nullable p0: (((InsertionContext..InsertionContext?), (LookupElement..LookupElement?)) -> Unit)?): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[MyFunctionDescriptor]

'context' @ [95:53] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [95:61] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'context' @ [97:40] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement.<anonymous>[ValueParameterDescriptorImpl]

'document' @ [97:48] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'replaceString' @ [97:57] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'offset' @ [97:71] ==> val offset: Int defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement.<anonymous>[LocalVariableDescriptor]

'context' @ [97:79] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement.<anonymous>[ValueParameterDescriptorImpl]

'tailOffset' @ [97:87] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'placeholder' @ [97:99] ==> val placeholder: String defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement.<anonymous>[LocalVariableDescriptor]

'TextRange' @ [98:63] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'offset' @ [98:73] ==> val offset: Int defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement.<anonymous>[LocalVariableDescriptor]

'offset' @ [98:81] ==> val offset: Int defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement.<anonymous>[LocalVariableDescriptor]

'placeholder' @ [98:90] ==> val placeholder: String defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement.<anonymous>[LocalVariableDescriptor]

'length' @ [98:102] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'LambdaSignatureTemplates' @ [99:40] ==> public object LambdaSignatureTemplates defined in org.jetbrains.kotlin.idea.completion in file LambdaSignatureTemplates.kt[FakeCallableDescriptorForObject]

'insertTemplate' @ [99:65] ==> public final fun insertTemplate(context: InsertionContext, placeholderRange: TextRange, lambdaType: KotlinType, explicitParameterTypes: Boolean, signatureOnly: Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.LambdaSignatureTemplates[SimpleFunctionDescriptorImpl]

'context' @ [99:80] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement.<anonymous>[ValueParameterDescriptorImpl]

'placeholderRange' @ [99:89] ==> val placeholderRange: TextRange defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement.<anonymous>[LocalVariableDescriptor]

'functionType' @ [99:107] ==> value-parameter functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement[ValueParameterDescriptorImpl]

'explicitParameterTypes' @ [99:121] ==> value-parameter explicitParameterTypes: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement[ValueParameterDescriptorImpl]

'suppressAutoInsertion' @ [101:18] ==> public fun LookupElement.suppressAutoInsertion(): LookupElement defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]

'assignSmartCompletionPriority' @ [102:18] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'LAMBDA' @ [102:76] ==> enum entry LAMBDA defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'addTailAndNameSimilarity' @ [103:18] ==> public fun LookupElement.addTailAndNameSimilarity(matchedExpectedInfos: Collection<ExpectedInfo>, nameSimilarityExpectedInfos: Collection<ExpectedInfo> = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart[SimpleFunctionDescriptorImpl]

'functionExpectedInfos' @ [103:43] ==> value-parameter functionExpectedInfos: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement[ValueParameterDescriptorImpl]

'filter' @ [103:65] ==> public inline fun <T> Iterable<ExpectedInfo>.filter(predicate: (ExpectedInfo) -> Boolean): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'it' @ [103:74] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [103:77] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'type' @ [103:88] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'functionType' @ [103:96] ==> value-parameter functionType: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems.createLookupElement[ValueParameterDescriptorImpl]

