'OperatorReferenceSearcher<KtArrayAccessExpression>' @ [39:5] ==> public constructor OperatorReferenceSearcher<TReferenceElement : KtElement>(targetDeclaration: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions, wordsToSearch: List<String>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[ClassConstructorDescriptorImpl]
Inferred types:
    <TReferenceElement : KtElement> -> KtArrayAccessExpression

'targetFunction' @ [39:56] ==> value-parameter targetFunction: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'searchScope' @ [39:72] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'consumer' @ [39:85] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'optimizer' @ [39:95] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'options' @ [39:106] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'listOf' @ [39:131] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expression' @ [42:32] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.processPossibleReceiverExpression[ValueParameterDescriptorImpl]

'parent' @ [42:43] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expression' @ [43:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.processPossibleReceiverExpression[ValueParameterDescriptorImpl]

'accessExpression' @ [43:27] ==> val accessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'arrayExpression' @ [43:44] ==> public final val KtArrayAccessExpression.arrayExpression: KtExpression?[MyPropertyDescriptor]

'!' @ [44:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkAccessExpression' @ [44:14] ==> private final fun checkAccessExpression(accessExpression: KtArrayAccessExpression): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'accessExpression' @ [44:36] ==> val accessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'processReferenceElement' @ [45:9] ==> protected final fun processReferenceElement(element: KtArrayAccessExpression): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'accessExpression' @ [45:33] ==> val accessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'ref' @ [48:58] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.isReferenceToCheck[ValueParameterDescriptorImpl]

'checkAccessExpression' @ [48:91] ==> private final fun checkAccessExpression(accessExpression: KtArrayAccessExpression): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'ref' @ [48:113] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.isReferenceToCheck[ValueParameterDescriptorImpl]

'element' @ [48:117] ==> public final val KtArrayAccessReference.element: (KtArrayAccessExpression..KtArrayAccessExpression?)[MyPropertyDescriptor]

'element' @ [51:32] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.extractReference[ValueParameterDescriptorImpl]

'!' @ [52:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkAccessExpression' @ [52:14] ==> private final fun checkAccessExpression(accessExpression: KtArrayAccessExpression): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'accessExpression' @ [52:36] ==> val accessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.extractReference[LocalVariableDescriptor]

'accessExpression' @ [53:16] ==> val accessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.extractReference[LocalVariableDescriptor]

'references' @ [53:33] ==> public final val KtArrayAccessExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstIsInstance' @ [53:44] ==> public inline fun <reified T> Array<*>.firstIsInstance(): KtArrayAccessReference defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtArrayAccessReference

'accessExpression' @ [57:31] ==> value-parameter accessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.checkAccessExpression[ValueParameterDescriptorImpl]

'readWriteAccess' @ [57:48] ==> public fun KtExpression.readWriteAccess(useResolveForReadWrite: Boolean): ReferenceAccess defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[SimpleFunctionDescriptorImpl]

'if (isSet) readWriteAccess.isWrite else readWriteAccess.isRead' @ [58:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'isSet' @ [58:20] ==> private final val isSet: Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher[PropertyDescriptorImpl]

'readWriteAccess' @ [58:27] ==> val readWriteAccess: ReferenceAccess defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.checkAccessExpression[LocalVariableDescriptor]

'isWrite' @ [58:43] ==> public final val isWrite: Boolean defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[PropertyDescriptorImpl]

'readWriteAccess' @ [58:56] ==> val readWriteAccess: ReferenceAccess defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher.checkAccessExpression[LocalVariableDescriptor]

'isRead' @ [58:72] ==> public final val isRead: Boolean defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[PropertyDescriptorImpl]

