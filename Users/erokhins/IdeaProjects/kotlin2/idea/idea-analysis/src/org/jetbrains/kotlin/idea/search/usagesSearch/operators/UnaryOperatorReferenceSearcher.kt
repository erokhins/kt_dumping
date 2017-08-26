'OperatorReferenceSearcher<KtUnaryExpression>' @ [39:5] ==> public constructor OperatorReferenceSearcher<TReferenceElement : KtElement>(targetDeclaration: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions, wordsToSearch: List<String>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[ClassConstructorDescriptorImpl]
Inferred types:
    <TReferenceElement : KtElement> -> KtUnaryExpression

'targetFunction' @ [39:50] ==> value-parameter targetFunction: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'searchScope' @ [39:66] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'consumer' @ [39:79] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'optimizer' @ [39:89] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'options' @ [39:100] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'listOf' @ [39:125] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'operationToken' @ [39:132] ==> value-parameter operationToken: KtSingleValueToken defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'value' @ [39:147] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'expression' @ [42:31] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.processPossibleReceiverExpression[ValueParameterDescriptorImpl]

'parent' @ [42:42] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'unaryExpression' @ [43:13] ==> val unaryExpression: KtUnaryExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'operationToken' @ [43:29] ==> public final val KtUnaryExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'operationToken' @ [43:47] ==> private final val operationToken: KtSingleValueToken defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher[PropertyDescriptorImpl]

'processReferenceElement' @ [44:9] ==> protected final fun processReferenceElement(element: KtUnaryExpression): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'unaryExpression' @ [44:33] ==> val unaryExpression: KtUnaryExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'ref' @ [48:13] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.isReferenceToCheck[ValueParameterDescriptorImpl]

'ref' @ [49:23] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.isReferenceToCheck[ValueParameterDescriptorImpl]

'element' @ [49:27] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'element' @ [50:13] ==> val element: (KtSimpleNameExpression..KtSimpleNameExpression?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.isReferenceToCheck[LocalVariableDescriptor]

'parent' @ [50:21] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [51:16] ==> val element: (KtSimpleNameExpression..KtSimpleNameExpression?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.isReferenceToCheck[LocalVariableDescriptor]

'getReferencedNameElementType' @ [51:24] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'operationToken' @ [51:58] ==> private final val operationToken: KtSingleValueToken defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher[PropertyDescriptorImpl]

'element' @ [55:31] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.extractReference[ValueParameterDescriptorImpl]

'unaryExpression' @ [56:13] ==> val unaryExpression: KtUnaryExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.extractReference[LocalVariableDescriptor]

'operationToken' @ [56:29] ==> public final val KtUnaryExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'operationToken' @ [56:47] ==> private final val operationToken: KtSingleValueToken defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher[PropertyDescriptorImpl]

'unaryExpression' @ [57:16] ==> val unaryExpression: KtUnaryExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher.extractReference[LocalVariableDescriptor]

'operationReference' @ [57:32] ==> public final val KtUnaryExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'references' @ [57:51] ==> public final val KtSimpleNameExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstIsInstance' @ [57:62] ==> public inline fun <reified T> Array<*>.firstIsInstance(): KtSimpleNameReference defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtSimpleNameReference

