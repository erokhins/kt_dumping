'QueryExecutorBase<PsiReference, ReferencesSearch.SearchParameters>' @ [38:50] ==> protected/*protected and package*/ constructor QueryExecutorBase<Result : (Any..Any?), Params : (Any..Any?)>() defined in com.intellij.openapi.application.QueryExecutorBase[JavaClassConstructorDescriptor]
Inferred types:
    <Result : (Any..Any?)> -> PsiReference
    <Params : (Any..Any?)> -> SearchParameters

'queryParameters' @ [40:31] ==> value-parameter queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery[ValueParameterDescriptorImpl]

'elementToSearch' @ [40:47] ==> public final val ReferencesSearch.SearchParameters.elementToSearch: PsiElement[MyPropertyDescriptor]

'?:' @ [41:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: (Array<(PsiElement..PsiElement?)>?..Array<out (PsiElement..PsiElement?)>?), right: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)): (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> (kotlin.Array<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>..kotlin.Array<out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>)

'queryParameters' @ [41:30] ==> value-parameter queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery[ValueParameterDescriptorImpl]

'effectiveSearchScope' @ [41:46] ==> public final val ReferencesSearch.SearchParameters.effectiveSearchScope: SearchScope[MyPropertyDescriptor]

'scope' @ [41:90] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'elementToSearch' @ [42:29] ==> val elementToSearch: XmlAttributeValue defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery[LocalVariableDescriptor]

'value' @ [42:45] ==> public final val XmlAttributeValue.value: String?[MyPropertyDescriptor]

'substringAfterLast' @ [42:52] ==> public fun String.substringAfterLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'scopeElements' @ [44:9] ==> val scopeElements: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>) defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery[LocalVariableDescriptor]

'filterIsInstance' @ [44:23] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtElement

'forEach' @ [44:53] ==> @HidesMembers public inline fun <T> Iterable<KtElement>.forEach(action: (KtElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'it' @ [45:13] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [45:16] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [45:32] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [47:25] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery.<anonymous>.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'text' @ [47:36] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'referenceName' @ [47:44] ==> val referenceName: String defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery[LocalVariableDescriptor]

'expression' @ [47:61] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery.<anonymous>.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'isReferenceTo' @ [47:72] ==> private final fun KtReferenceExpression.isReferenceTo(element: PsiElement): Boolean defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor[SimpleFunctionDescriptorImpl]

'elementToSearch' @ [47:86] ==> val elementToSearch: XmlAttributeValue defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery[LocalVariableDescriptor]

'expression' @ [48:25] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery.<anonymous>.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'references' @ [48:36] ==> public final val KtSimpleNameExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstOrNull' @ [48:47] ==> public inline fun <T> Array<out (PsiReference..PsiReference?)>.firstOrNull(predicate: ((PsiReference..PsiReference?)) -> Boolean): PsiReference? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'it' @ [48:61] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery.<anonymous>.<no name provided>.visitSimpleNameExpression.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [48:92] ==> @InlineOnly public inline fun <T, R> PsiReference.let(block: (PsiReference) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference
    <R> -> Boolean

'consumer' @ [49:29] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery[ValueParameterDescriptorImpl]

'process' @ [49:38] ==> public abstract fun process(p0: (PsiReference..PsiReference?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'it' @ [49:46] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery.<anonymous>.<no name provided>.visitSimpleNameExpression.<anonymous>[ValueParameterDescriptorImpl]

'super' @ [52:21] ==> <this> defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitReferenceExpression' @ [52:27] ==> public open fun visitReferenceExpression(@NotNull p0: KtReferenceExpression): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'expression' @ [52:52] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.processQuery.<anonymous>.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getTargetPropertyDescriptor' @ [59:13] ==> private final fun KtReferenceExpression.getTargetPropertyDescriptor(): PropertyDescriptor? defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor[SimpleFunctionDescriptorImpl]

'source' @ [59:44] ==> public final val PropertyDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [59:52] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'element' @ [59:64] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.isReferenceTo[ValueParameterDescriptorImpl]

'analyze' @ [62:13] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [62:37] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'REFERENCE_TARGET' @ [62:61] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [62:79] ==> <this> defined in org.jetbrains.kotlin.AndroidExtensionsReferenceSearchExecutor.getTargetPropertyDescriptor[ReceiverParameterDescriptorImpl]

