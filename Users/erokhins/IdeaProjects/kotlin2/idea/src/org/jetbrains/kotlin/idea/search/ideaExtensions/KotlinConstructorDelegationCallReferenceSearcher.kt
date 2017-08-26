'QueryExecutorBase<PsiReference, SearchParameters>' @ [26:58] ==> protected/*protected and package*/ constructor QueryExecutorBase<Result : (Any..Any?), Params : (Any..Any?)>(p0: Boolean) defined in com.intellij.openapi.application.QueryExecutorBase[JavaClassConstructorDescriptor]
Inferred types:
    <Result : (Any..Any?)> -> PsiReference
    <Params : (Any..Any?)> -> SearchParameters

'queryParameters' @ [28:22] ==> value-parameter queryParameters: MethodReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinConstructorDelegationCallReferenceSearcher.processQuery[ValueParameterDescriptorImpl]

'method' @ [28:38] ==> public final val MethodReferencesSearch.SearchParameters.method: PsiMethod[MyPropertyDescriptor]

'!' @ [29:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'method' @ [29:14] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinConstructorDelegationCallReferenceSearcher.processQuery[LocalVariableDescriptor]

'isConstructor' @ [29:21] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'method' @ [31:9] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinConstructorDelegationCallReferenceSearcher.processQuery[LocalVariableDescriptor]

'processDelegationCallConstructorUsages' @ [31:16] ==> public fun PsiElement.processDelegationCallConstructorUsages(scope: SearchScope, process: (KtCallElement) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'method' @ [31:55] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinConstructorDelegationCallReferenceSearcher.processQuery[LocalVariableDescriptor]

'useScope' @ [31:62] ==> public final val PsiMethod.useScope: SearchScope[MyPropertyDescriptor]

'intersectWith' @ [31:71] ==> @NotNull public abstract fun intersectWith(@NotNull p0: SearchScope): SearchScope defined in com.intellij.psi.search.SearchScope[JavaMethodDescriptor]

'queryParameters' @ [31:85] ==> value-parameter queryParameters: MethodReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinConstructorDelegationCallReferenceSearcher.processQuery[ValueParameterDescriptorImpl]

'effectiveSearchScope' @ [31:101] ==> public final val MethodReferencesSearch.SearchParameters.effectiveSearchScope: SearchScope[MyPropertyDescriptor]

'it' @ [32:13] ==> value-parameter it: KtCallElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinConstructorDelegationCallReferenceSearcher.processQuery.<anonymous>[ValueParameterDescriptorImpl]

'calleeExpression' @ [32:16] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'mainReference' @ [32:34] ==> public val KtElement.mainReference: KtReference? defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'let' @ [32:49] ==> @InlineOnly public inline fun <T, R> KtReference.let(block: (KtReference) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtReference
    <R> -> Boolean

'consumer' @ [32:55] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinConstructorDelegationCallReferenceSearcher.processQuery[ValueParameterDescriptorImpl]

'process' @ [32:64] ==> public abstract fun process(p0: (PsiReference..PsiReference?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'it' @ [32:72] ==> value-parameter it: KtReference defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinConstructorDelegationCallReferenceSearcher.processQuery.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

