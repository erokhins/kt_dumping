'OperatorReferenceSearcher<KtPropertyDelegate>' @ [37:5] ==> public constructor OperatorReferenceSearcher<TReferenceElement : KtElement>(targetDeclaration: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions, wordsToSearch: List<String>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[ClassConstructorDescriptorImpl]
Inferred types:
    <TReferenceElement : KtElement> -> KtPropertyDelegate

'targetFunction' @ [37:51] ==> value-parameter targetFunction: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.PropertyDelegationOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'searchScope' @ [37:67] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.PropertyDelegationOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'consumer' @ [37:80] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.PropertyDelegationOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'optimizer' @ [37:90] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.PropertyDelegationOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'options' @ [37:101] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.PropertyDelegationOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'listOf' @ [37:126] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expression' @ [40:10] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.PropertyDelegationOperatorReferenceSearcher.processPossibleReceiverExpression[ValueParameterDescriptorImpl]

'parent' @ [40:21] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [40:53] ==> @InlineOnly public inline fun <T, R> KtPropertyDelegate.let(block: (KtPropertyDelegate) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPropertyDelegate
    <R> -> Boolean

'processReferenceElement' @ [40:59] ==> protected final fun processReferenceElement(element: KtPropertyDelegate): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.PropertyDelegationOperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'it' @ [40:83] ==> value-parameter it: KtPropertyDelegate defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.PropertyDelegationOperatorReferenceSearcher.processPossibleReceiverExpression.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [44:16] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.PropertyDelegationOperatorReferenceSearcher.isReferenceToCheck[ValueParameterDescriptorImpl]

'element' @ [48:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.PropertyDelegationOperatorReferenceSearcher.extractReference[ValueParameterDescriptorImpl]

'references' @ [48:50] ==> public final val KtPropertyDelegate.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstIsInstance' @ [48:62] ==> public inline fun <reified T> Array<*>.firstIsInstance(): KtPropertyDelegationMethodsReference defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtPropertyDelegationMethodsReference

