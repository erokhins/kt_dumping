'IntentionBasedInspection<KtObjectLiteralExpression>' @ [48:41] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtObjectLiteralExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtObjectLiteralExpression

'ObjectLiteralToLambdaIntention' @ [48:93] ==> public constructor ObjectLiteralToLambdaIntention() defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention[ClassConstructorDescriptorImpl]

'SelfTargetingRangeIntention<KtObjectLiteralExpression>' @ [50:40] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtObjectLiteralExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtObjectLiteralExpression

'KtObjectLiteralExpression' @ [51:9] ==> public constructor KtObjectLiteralExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtObjectLiteralExpression[JavaClassConstructorDescriptor]

'java' @ [51:42] ==> public val <T> KClass<KtObjectLiteralExpression>.java: Class<KtObjectLiteralExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtObjectLiteralExpression

'component1' @ [56:14] ==> public final operator fun component1(): KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.Data[SimpleFunctionDescriptorImpl]

'component2' @ [56:27] ==> public final operator fun component2(): KotlinType defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.Data[SimpleFunctionDescriptorImpl]

'component3' @ [56:37] ==> public final operator fun component3(): KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.Data[SimpleFunctionDescriptorImpl]

'extractData' @ [56:55] ==> private final fun extractData(element: KtObjectLiteralExpression): ObjectLiteralToLambdaIntention.Data? defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention[SimpleFunctionDescriptorImpl]

'element' @ [56:67] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[ValueParameterDescriptorImpl]

'!' @ [58:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSamType' @ [58:40] ==> public open fun isSamType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.load.java.sam.SingleAbstractMethodUtils[JavaMethodDescriptor]

'baseType' @ [58:50] ==> val baseType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'singleFunction' @ [60:34] ==> val singleFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [60:49] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [60:90] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'functionDescriptor' @ [61:26] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'overriddenDescriptors' @ [61:45] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'singleOrNull' @ [61:67] ==> public fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.singleOrNull(): FunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'overridden' @ [62:13] ==> val overridden: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'modality' @ [62:24] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [62:36] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [62:45] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'!' @ [64:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'singleFunction' @ [64:14] ==> val singleFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'hasBody' @ [64:29] ==> public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'singleFunction' @ [65:13] ==> val singleFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'valueParameters' @ [65:28] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'any' @ [65:44] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.any(predicate: ((KtParameter..KtParameter?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [65:50] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [65:53] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'singleFunction' @ [67:30] ==> val singleFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'bodyExpression' @ [67:45] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'bodyExpression' @ [68:23] ==> val bodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'analyze' @ [68:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [69:37] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'containingDeclaration' @ [69:56] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'bodyExpression' @ [72:13] ==> val bodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'anyDescendantOfType' @ [72:28] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtThisExpression) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtThisExpression

'context' @ [73:13] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [73:36] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'thisReference' @ [73:54] ==> value-parameter thisReference: KtThisExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'instanceReference' @ [73:68] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'containingDeclaration' @ [73:90] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'search' @ [77:30] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'singleFunction' @ [77:37] ==> val singleFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'LocalSearchScope' @ [77:53] ==> public constructor LocalSearchScope(@NotNull p0: PsiElement) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'bodyExpression' @ [77:70] ==> val bodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'any' @ [77:87] ==> public inline fun <T> Iterable<(PsiReference..PsiReference?)>.any(predicate: ((PsiReference..PsiReference?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'it' @ [77:93] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [77:96] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [82:17] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange.isImplicitClassFor[ReceiverParameterDescriptorImpl]

'classDescriptor' @ [82:50] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitClassReceiver[DeserializedPropertyDescriptor]

'descriptor' @ [82:69] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange.isImplicitClassFor[ValueParameterDescriptorImpl]

'bodyExpression' @ [84:13] ==> val bodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'anyDescendantOfType' @ [84:28] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtExpression) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'expression' @ [85:32] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'getResolvedCall' @ [85:43] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [85:59] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'resolvedCall' @ [86:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange.<anonymous>[LocalVariableDescriptor]

'let' @ [86:27] ==> @InlineOnly public inline fun <T, R> ResolvedCall<out CallableDescriptor>.let(block: (ResolvedCall<out CallableDescriptor>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<out CallableDescriptor>
    <R> -> Boolean

'it' @ [87:17] ==> value-parameter it: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [87:20] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'isImplicitClassFor' @ [87:37] ==> local final fun ReceiverValue?.isImplicitClassFor(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[SimpleFunctionDescriptorImpl]

'containingDeclaration' @ [87:56] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'it' @ [88:17] ==> value-parameter it: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiver' @ [88:20] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'isImplicitClassFor' @ [88:38] ==> local final fun ReceiverValue?.isImplicitClassFor(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[SimpleFunctionDescriptorImpl]

'containingDeclaration' @ [88:57] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'TextRange' @ [92:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'element' @ [92:26] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[ValueParameterDescriptorImpl]

'objectDeclaration' @ [92:34] ==> public final val KtObjectLiteralExpression.objectDeclaration: KtObjectDeclaration[MyPropertyDescriptor]

'getObjectKeyword' @ [92:52] ==> public final fun getObjectKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [92:73] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'baseTypeRef' @ [92:86] ==> val baseTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applicabilityRange[LocalVariableDescriptor]

'endOffset' @ [92:98] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'CommentSaver' @ [96:28] ==> public constructor CommentSaver(originalElement: PsiElement, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'element' @ [96:41] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[ValueParameterDescriptorImpl]

'component1' @ [98:14] ==> public final operator fun component1(): KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.Data[SimpleFunctionDescriptorImpl]

'component2' @ [98:17] ==> public final operator fun component2(): KotlinType defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.Data[SimpleFunctionDescriptorImpl]

'component3' @ [98:27] ==> public final operator fun component3(): KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.Data[SimpleFunctionDescriptorImpl]

'extractData' @ [98:45] ==> private final fun extractData(element: KtObjectLiteralExpression): ObjectLiteralToLambdaIntention.Data? defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention[SimpleFunctionDescriptorImpl]

'element' @ [98:57] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[ValueParameterDescriptorImpl]

'ReturnSaver' @ [100:27] ==> public constructor ReturnSaver(function: KtNamedFunction) defined in org.jetbrains.kotlin.idea.intentions.ReturnSaver[ClassConstructorDescriptorImpl]

'singleFunction' @ [100:39] ==> val singleFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'singleFunction' @ [102:20] ==> val singleFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'bodyExpression' @ [102:35] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'KtPsiFactory' @ [104:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [104:36] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[ValueParameterDescriptorImpl]

'factory' @ [105:29] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'buildExpression' @ [105:37] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [106:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'IdeDescriptorRenderers' @ [106:29] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [106:52] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [106:64] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'baseType' @ [106:75] ==> val baseType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'appendFixedText' @ [108:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'singleFunction' @ [110:30] ==> val singleFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'valueParameters' @ [110:45] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'parameters' @ [112:34] ==> val parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'count' @ [112:45] ==> @InlineOnly public inline fun <T> Collection<(KtParameter..KtParameter?)>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'parameters' @ [112:60] ==> val parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'any' @ [112:71] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.any(predicate: ((KtParameter..KtParameter?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'search' @ [112:107] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'parameter' @ [112:114] ==> value-parameter parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'LocalSearchScope' @ [112:125] ==> public constructor LocalSearchScope(@NotNull p0: PsiElement) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'body' @ [112:142] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'any' @ [112:149] ==> public fun <T> Iterable<(PsiReference..PsiReference?)>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'needParameters' @ [113:17] ==> val needParameters: Boolean defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'parameters' @ [114:17] ==> val parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'forEachIndexed' @ [114:28] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.forEachIndexed(action: (index: Int, (KtParameter..KtParameter?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'index' @ [115:25] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'appendFixedText' @ [116:25] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendName' @ [118:21] ==> public final fun appendName(name: Name): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'parameter' @ [118:32] ==> value-parameter parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nameAsSafeName' @ [118:42] ==> public final val KtParameter.nameAsSafeName: Name[MyPropertyDescriptor]

'appendFixedText' @ [121:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'if (singleFunction.hasBlockBody()) {
                val contentRange = (body as KtBlockExpression).contentRange()
                appendChildRange(contentRange)
                contentRange.last
            }
            else {
                appendExpression(body)
                body
            }' @ [124:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'singleFunction' @ [124:40] ==> val singleFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'hasBlockBody' @ [124:55] ==> public open fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'body' @ [125:37] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'contentRange' @ [125:64] ==> public fun KtBlockExpression.contentRange(): PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'appendChildRange' @ [126:17] ==> public final fun appendChildRange(range: PsiChildRange): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'contentRange' @ [126:34] ==> val contentRange: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'contentRange' @ [127:17] ==> val contentRange: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'last' @ [127:30] ==> public final val last: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedPropertyDescriptor]

'appendExpression' @ [130:17] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'body' @ [130:34] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'body' @ [131:17] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'lastCommentOwner' @ [134:17] ==> val lastCommentOwner: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'anyDescendantOfType' @ [134:35] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (PsiComment) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiComment

'it' @ [134:69] ==> value-parameter it: PsiComment defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tokenType' @ [134:72] ==> public final val PsiComment.tokenType: (IElementType..IElementType?)[MyPropertyDescriptor]

'EOL_COMMENT' @ [134:94] ==> public final val EOL_COMMENT: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'appendFixedText' @ [135:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [137:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'element' @ [140:24] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[ValueParameterDescriptorImpl]

'replaced' @ [140:32] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'newExpression' @ [140:41] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'commentSaver' @ [141:9] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'restore' @ [141:22] ==> public final fun restore(resultElement: PsiElement, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'replaced' @ [141:30] ==> val replaced: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'replaced' @ [143:22] ==> val replaced: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'getCalleeExpressionIfAny' @ [143:31] ==> public fun KtElement?.getCalleeExpressionIfAny(): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'callee' @ [144:30] ==> val callee: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'parent' @ [144:37] ==> public final val KtNameReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callExpression' @ [145:31] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'lambdaArguments' @ [145:46] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'single' @ [145:62] ==> public fun <T> List<(KtLambdaArgument..KtLambdaArgument?)>.single(): (KtLambdaArgument..KtLambdaArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'getLambdaExpression' @ [145:71] ==> public open fun getLambdaExpression(): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'callee' @ [147:27] ==> val callee: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'getReferencedNameAsName' @ [147:34] ==> public open fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'returnSaver' @ [148:9] ==> val returnSaver: ReturnSaver defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'restore' @ [148:21] ==> public final fun restore(lambda: KtLambdaExpression, label: Name): Unit defined in org.jetbrains.kotlin.idea.intentions.ReturnSaver[SimpleFunctionDescriptorImpl]

'functionLiteral' @ [148:29] ==> val functionLiteral: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'returnLabel' @ [148:46] ==> val returnLabel: Name defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'replaced' @ [150:28] ==> val replaced: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'parent' @ [150:37] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [151:32] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [152:36] ==> public final val KtValueArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parentCall != null && RedundantSamConstructorInspection.samConstructorCallsToBeConverted(parentCall).singleOrNull() == callExpression) {
            RedundantSamConstructorInspection.replaceSamConstructorCall(callExpression)
            if (MoveLambdaOutsideParenthesesIntention.canMove(parentCall)) {
                parentCall.moveFunctionLiteralOutsideParentheses()
            }
        }
        else {
            val endOffset = (callee.parent as? KtCallExpression)?.typeArgumentList?.endOffset ?: callee.endOffset
            ShortenReferences.DEFAULT.process(replaced.containingKtFile, replaced.startOffset, endOffset)
        }' @ [153:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parentCall' @ [153:13] ==> val parentCall: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'RedundantSamConstructorInspection' @ [153:35] ==> public companion object defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection[FakeCallableDescriptorForObject]

'samConstructorCallsToBeConverted' @ [153:69] ==> public final fun samConstructorCallsToBeConverted(functionCall: KtCallExpression): Collection<KtCallExpression> defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'parentCall' @ [153:102] ==> val parentCall: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'singleOrNull' @ [153:114] ==> public fun <T> Iterable<KtCallExpression>.singleOrNull(): KtCallExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallExpression

'callExpression' @ [153:132] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'RedundantSamConstructorInspection' @ [154:13] ==> public companion object defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection[FakeCallableDescriptorForObject]

'replaceSamConstructorCall' @ [154:47] ==> public final fun replaceSamConstructorCall(callExpression: KtCallExpression): KtLambdaExpression defined in org.jetbrains.kotlin.idea.inspections.RedundantSamConstructorInspection.Companion[SimpleFunctionDescriptorImpl]

'callExpression' @ [154:73] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'MoveLambdaOutsideParenthesesIntention' @ [155:17] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention[FakeCallableDescriptorForObject]

'canMove' @ [155:55] ==> public final fun canMove(element: KtCallExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion[SimpleFunctionDescriptorImpl]

'parentCall' @ [155:63] ==> val parentCall: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'parentCall' @ [156:17] ==> val parentCall: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'moveFunctionLiteralOutsideParentheses' @ [156:28] ==> public fun KtCallExpression.moveFunctionLiteralOutsideParentheses(): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'?:' @ [160:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Int?, right: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Int

'callee' @ [160:30] ==> val callee: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'parent' @ [160:37] ==> public final val KtNameReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'typeArgumentList' @ [160:67] ==> public final val KtCallExpression.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'endOffset' @ [160:85] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'callee' @ [160:98] ==> val callee: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'endOffset' @ [160:105] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ShortenReferences' @ [161:13] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [161:31] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [161:39] ==> public final fun process(file: KtFile, startOffset: Int, endOffset: Int): Unit defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'replaced' @ [161:47] ==> val replaced: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'containingKtFile' @ [161:56] ==> public final val KtExpression.containingKtFile: KtFile[MyPropertyDescriptor]

'replaced' @ [161:74] ==> val replaced: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'startOffset' @ [161:83] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'endOffset' @ [161:96] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.applyTo[LocalVariableDescriptor]

'element' @ [172:33] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.extractData[ValueParameterDescriptorImpl]

'objectDeclaration' @ [172:41] ==> public final val KtObjectLiteralExpression.objectDeclaration: KtObjectDeclaration[MyPropertyDescriptor]

'objectDeclaration' @ [174:30] ==> val objectDeclaration: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.extractData[LocalVariableDescriptor]

'declarations' @ [174:48] ==> public final val KtObjectDeclaration.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'singleOrNull' @ [174:61] ==> public fun <T> List<KtDeclaration>.singleOrNull(): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'!' @ [175:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'singleFunction' @ [175:14] ==> val singleFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.extractData[LocalVariableDescriptor]

'hasModifier' @ [175:29] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [175:50] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'objectDeclaration' @ [177:35] ==> val objectDeclaration: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.extractData[LocalVariableDescriptor]

'superTypeListEntries' @ [177:53] ==> public final val KtObjectDeclaration.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'singleOrNull' @ [177:74] ==> public fun <T> List<KtSuperTypeListEntry>.singleOrNull(): KtSuperTypeListEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry

'delegationSpecifier' @ [178:23] ==> val delegationSpecifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.extractData[LocalVariableDescriptor]

'typeReference' @ [178:43] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeRef' @ [179:30] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.extractData[LocalVariableDescriptor]

'analyze' @ [179:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [179:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'bindingContext' @ [180:24] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.extractData[LocalVariableDescriptor]

'TYPE' @ [180:54] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeRef' @ [180:60] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.extractData[LocalVariableDescriptor]

'Data' @ [182:16] ==> public constructor Data(baseTypeRef: KtTypeReference, baseType: KotlinType, singleFunction: KtNamedFunction) defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.Data[ClassConstructorDescriptorImpl]

'typeRef' @ [182:21] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.extractData[LocalVariableDescriptor]

'baseType' @ [182:30] ==> val baseType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.extractData[LocalVariableDescriptor]

'singleFunction' @ [182:40] ==> val singleFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.ObjectLiteralToLambdaIntention.extractData[LocalVariableDescriptor]

