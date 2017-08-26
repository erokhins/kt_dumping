'LinkedHashMap' @ [44:44] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Pair<KotlinType, String>
    <V : (Any..Any?)> -> MutableList<ExpectedInfo>

'expectedInfos' @ [46:30] ==> value-parameter expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[ValueParameterDescriptorImpl]

'expectedInfo' @ [47:29] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'fuzzyType' @ [47:42] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'fuzzyType' @ [48:17] ==> val fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'freeParameters' @ [48:27] ==> public final val freeParameters: Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'isNotEmpty' @ [48:42] ==> @InlineOnly public inline fun <T> Collection<TypeParameterDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'fuzzyType' @ [49:35] ==> val fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'type' @ [49:45] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'constructor' @ [49:50] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'typeConstructor' @ [50:25] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'declarationDescriptor' @ [50:41] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'fuzzyType' @ [51:32] ==> val fuzzyType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'type' @ [51:42] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'arguments' @ [51:47] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'singleOrNull' @ [51:57] ==> public fun <T> List<TypeProjection>.singleOrNull(): TypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'typeArgument' @ [52:17] ==> val typeArgument: TypeProjection defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'projectionKind' @ [52:30] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'INVARIANT' @ [52:57] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'isKClass' @ [54:32] ==> public open fun isKClass(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'klass' @ [54:41] ==> val klass: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'typeAndSuffixToExpectedInfos' @ [55:17] ==> val typeAndSuffixToExpectedInfos: LinkedHashMap<Pair<KotlinType, String>, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'getOrPut' @ [55:46] ==> public inline fun <K, V> MutableMap<Pair<KotlinType, String>, MutableList<ExpectedInfo>>.getOrPut(key: Pair<KotlinType, String>, defaultValue: () -> MutableList<ExpectedInfo>): MutableList<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<KotlinType, String>
    <V> -> MutableList<ExpectedInfo>

'typeArgument' @ [55:55] ==> val typeArgument: TypeProjection defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'type' @ [55:68] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'ArrayList' @ [55:89] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ExpectedInfo

'add' @ [55:103] ==> public abstract fun add(element: ExpectedInfo): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'expectedInfo' @ [55:107] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'isJvmModule' @ [58:17] ==> value-parameter isJvmModule: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[ValueParameterDescriptorImpl]

'klass' @ [58:32] ==> val klass: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'importableFqName' @ [58:38] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'asString' @ [58:56] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'typeAndSuffixToExpectedInfos' @ [59:17] ==> val typeAndSuffixToExpectedInfos: LinkedHashMap<Pair<KotlinType, String>, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'getOrPut' @ [59:46] ==> public inline fun <K, V> MutableMap<Pair<KotlinType, String>, MutableList<ExpectedInfo>>.getOrPut(key: Pair<KotlinType, String>, defaultValue: () -> MutableList<ExpectedInfo>): MutableList<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<KotlinType, String>
    <V> -> MutableList<ExpectedInfo>

'typeArgument' @ [59:55] ==> val typeArgument: TypeProjection defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'type' @ [59:68] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'ArrayList' @ [59:94] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ExpectedInfo

'add' @ [59:108] ==> public abstract fun add(element: ExpectedInfo): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'expectedInfo' @ [59:112] ==> val expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'component1' @ [63:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Pair<KotlinType, String>, MutableList<ExpectedInfo>>.component1(): Pair<KotlinType, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<KotlinType, String>
    <V> -> MutableList<ExpectedInfo>

'component2' @ [63:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Pair<KotlinType, String>, MutableList<ExpectedInfo>>.component2(): MutableList<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<KotlinType, String>
    <V> -> MutableList<ExpectedInfo>

'typeAndSuffixToExpectedInfos' @ [63:46] ==> val typeAndSuffixToExpectedInfos: LinkedHashMap<Pair<KotlinType, String>, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'component1' @ [64:18] ==> public final operator fun component1(): KotlinType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [64:24] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'pair' @ [64:34] ==> val pair: Pair<KotlinType, String> defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'if (KotlinBuiltIns.isArray(type)) {
                type.makeNotNullable()
            }
            else {
                val classifier = (type.constructor.declarationDescriptor as? ClassDescriptor) ?: continue
                classifier.defaultType
            }' @ [65:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'isArray' @ [65:48] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [65:56] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'type' @ [66:17] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'makeNotNullable' @ [66:22] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'?:' @ [69:34] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptor?, right: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptor

'type' @ [69:35] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'constructor' @ [69:40] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [69:52] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'classifier' @ [70:17] ==> val classifier: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'defaultType' @ [70:28] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'lookupElementFactory' @ [73:33] ==> value-parameter lookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[ValueParameterDescriptorImpl]

'createLookupElementForType' @ [73:54] ==> public fun BasicLookupElementFactory.createLookupElementForType(type: KotlinType): LookupElement? defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'typeToUse' @ [73:81] ==> val typeToUse: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'lookupElement' @ [75:13] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'LookupElementDecorator<LookupElement>' @ [75:38] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'lookupElement' @ [75:76] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'super' @ [77:21] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection.<no name provided>[LazyClassReceiverParameterDescriptor]

'renderElement' @ [77:27] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'presentation' @ [77:41] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [78:21] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [78:34] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'suffix' @ [78:46] ==> val suffix: String defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'super' @ [82:21] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection.<no name provided>[LazyClassReceiverParameterDescriptor]

'handleInsert' @ [82:27] ==> public open fun handleInsert(p0: (InsertionContext..InsertionContext?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'context' @ [82:40] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'getInstance' @ [84:40] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'context' @ [84:52] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'project' @ [84:60] ==> public final val InsertionContext.project: (Project..Project?)[MyPropertyDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [84:69] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'context' @ [84:109] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'document' @ [84:117] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'context' @ [86:34] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'tailOffset' @ [86:42] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'context' @ [87:21] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'document' @ [87:29] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'insertString' @ [87:38] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'offset' @ [87:51] ==> val offset: Int defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection.<no name provided>.handleInsert[LocalVariableDescriptor]

'suffix' @ [87:59] ==> val suffix: String defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'context' @ [88:21] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'editor' @ [88:29] ==> public final val InsertionContext.editor: Editor[MyPropertyDescriptor]

'moveCaret' @ [88:36] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'offset' @ [88:46] ==> val offset: Int defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection.<no name provided>.handleInsert[LocalVariableDescriptor]

'suffix' @ [88:55] ==> val suffix: String defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'length' @ [88:62] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'lookupElement' @ [91:13] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'assignSmartCompletionPriority' @ [91:27] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'CLASS_LITERAL' @ [91:85] ==> enum entry CLASS_LITERAL defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'lookupElement' @ [92:13] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'lookupElement' @ [92:29] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'addTailAndNameSimilarity' @ [92:43] ==> public fun LookupElement.addTailAndNameSimilarity(matchedExpectedInfos: Collection<ExpectedInfo>, nameSimilarityExpectedInfos: Collection<ExpectedInfo> = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'matchedExpectedInfos' @ [92:68] ==> val matchedExpectedInfos: MutableList<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

'emptyList' @ [92:90] ==> public fun <T> emptyList(): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'collection' @ [93:13] ==> value-parameter collection: MutableCollection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[ValueParameterDescriptorImpl]

'add' @ [93:24] ==> public abstract fun add(element: LookupElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'lookupElement' @ [93:28] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.ClassLiteralItems.addToCollection[LocalVariableDescriptor]

