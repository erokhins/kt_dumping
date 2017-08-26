'OperatorReferenceSearcher<KtBinaryExpression>' @ [39:5] ==> public constructor OperatorReferenceSearcher<TReferenceElement : KtElement>(targetDeclaration: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions, wordsToSearch: List<String>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[ClassConstructorDescriptorImpl]
Inferred types:
    <TReferenceElement : KtElement> -> KtBinaryExpression

'targetFunction' @ [39:51] ==> value-parameter targetFunction: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'searchScope' @ [39:67] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'consumer' @ [39:80] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'optimizer' @ [39:90] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'options' @ [39:101] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'operationTokens' @ [39:126] ==> value-parameter operationTokens: List<KtSingleValueToken> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'map' @ [39:142] ==> public inline fun <T, R> Iterable<KtSingleValueToken>.map(transform: (KtSingleValueToken) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSingleValueToken
    <R> -> String

'it' @ [39:148] ==> value-parameter it: KtSingleValueToken defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.<init>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [39:151] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'expression' @ [42:32] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.processPossibleReceiverExpression[ValueParameterDescriptorImpl]

'parent' @ [42:43] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'binaryExpression' @ [43:13] ==> val binaryExpression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'operationToken' @ [43:30] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'operationTokens' @ [43:49] ==> private final val operationTokens: List<KtSingleValueToken> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher[PropertyDescriptorImpl]

'expression' @ [44:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.processPossibleReceiverExpression[ValueParameterDescriptorImpl]

'binaryExpression' @ [44:27] ==> val binaryExpression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'left' @ [44:44] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'processReferenceElement' @ [45:9] ==> protected final fun processReferenceElement(element: KtBinaryExpression): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'binaryExpression' @ [45:33] ==> val binaryExpression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'ref' @ [49:13] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.isReferenceToCheck[ValueParameterDescriptorImpl]

'ref' @ [50:23] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.isReferenceToCheck[ValueParameterDescriptorImpl]

'element' @ [50:27] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'element' @ [51:13] ==> val element: (KtSimpleNameExpression..KtSimpleNameExpression?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.isReferenceToCheck[LocalVariableDescriptor]

'parent' @ [51:21] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [52:16] ==> val element: (KtSimpleNameExpression..KtSimpleNameExpression?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.isReferenceToCheck[LocalVariableDescriptor]

'getReferencedNameElementType' @ [52:24] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'operationTokens' @ [52:58] ==> private final val operationTokens: List<KtSingleValueToken> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher[PropertyDescriptorImpl]

'element' @ [56:32] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.extractReference[ValueParameterDescriptorImpl]

'binaryExpression' @ [57:13] ==> val binaryExpression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.extractReference[LocalVariableDescriptor]

'operationToken' @ [57:30] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'operationTokens' @ [57:49] ==> private final val operationTokens: List<KtSingleValueToken> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher[PropertyDescriptorImpl]

'binaryExpression' @ [58:16] ==> val binaryExpression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher.extractReference[LocalVariableDescriptor]

'operationReference' @ [58:33] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'references' @ [58:52] ==> public final val KtOperationReferenceExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstIsInstance' @ [58:63] ==> public inline fun <reified T> Array<*>.firstIsInstance(): KtSimpleNameReference defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtSimpleNameReference

