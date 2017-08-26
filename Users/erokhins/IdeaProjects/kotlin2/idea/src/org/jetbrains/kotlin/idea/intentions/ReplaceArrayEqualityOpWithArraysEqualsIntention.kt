'IntentionBasedInspection<KtBinaryExpression>' @ [31:9] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtBinaryExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtBinaryExpression

'ReplaceArrayEqualityOpWithArraysEqualsIntention' @ [31:54] ==> public constructor ReplaceArrayEqualityOpWithArraysEqualsIntention() defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention[ClassConstructorDescriptorImpl]

'SelfTargetingOffsetIndependentIntention<KtBinaryExpression>' @ [33:57] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtBinaryExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtBinaryExpression

'KtBinaryExpression' @ [34:9] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'java' @ [34:35] ==> public val <T> KClass<KtBinaryExpression>.java: Class<KtBinaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'element' @ [39:23] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo[ValueParameterDescriptorImpl]

'project' @ [39:31] ==> public final val KtBinaryExpression.project: Project[MyPropertyDescriptor]

'element' @ [40:21] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo[ValueParameterDescriptorImpl]

'right' @ [40:29] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'element' @ [41:20] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo[ValueParameterDescriptorImpl]

'left' @ [41:28] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'KtPsiFactory' @ [42:23] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [42:36] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo[LocalVariableDescriptor]

'element' @ [43:22] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo[ValueParameterDescriptorImpl]

'containingKtFile' @ [43:30] ==> public final val KtBinaryExpression.containingKtFile: KtFile[MyPropertyDescriptor]

'ktFile' @ [44:9] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo[LocalVariableDescriptor]

'resolveImportReference' @ [44:16] ==> public fun KtFile.resolveImportReference(fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FqName' @ [44:39] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'firstOrNull' @ [44:67] ==> public fun <T> Iterable<DeclarationDescriptor>.firstOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'let' @ [44:82] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> ImportDescriptorResult): ImportDescriptorResult defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> ImportDescriptorResult

'ImportInsertHelper' @ [45:13] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[FakeCallableDescriptorForObject]

'getInstance' @ [45:32] ==> @JvmStatic public final fun getInstance(project: Project): ImportInsertHelper defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [45:44] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo[LocalVariableDescriptor]

'importDescriptor' @ [45:53] ==> public abstract fun importDescriptor(file: KtFile, descriptor: DeclarationDescriptor, forceAllUnderImport: Boolean = ...): ImportDescriptorResult defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[DeserializedSimpleFunctionDescriptor]

'ktFile' @ [45:70] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo[LocalVariableDescriptor]

'it' @ [45:78] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [47:26] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo[LocalVariableDescriptor]

'createExpression' @ [47:34] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'left' @ [47:68] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo[LocalVariableDescriptor]

'text' @ [47:73] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'right' @ [47:82] ==> val right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo[LocalVariableDescriptor]

'text' @ [47:88] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'element' @ [48:9] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [48:17] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtBinaryExpression[DeserializedSimpleFunctionDescriptor]

'expression' @ [48:25] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.applyTo[LocalVariableDescriptor]

'element' @ [52:13] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'operationToken' @ [52:21] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQEQ' @ [52:48] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [53:21] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'right' @ [53:29] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'element' @ [54:20] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.isApplicableTo[ValueParameterDescriptorImpl]

'left' @ [54:28] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'right' @ [55:33] ==> val right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.isApplicableTo[LocalVariableDescriptor]

'getResolvedCall' @ [55:39] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'right' @ [55:55] ==> val right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.isApplicableTo[LocalVariableDescriptor]

'analyze' @ [55:61] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'!' @ [57:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'rightResolvedCall' @ [57:14] ==> val rightResolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.isApplicableTo[LocalVariableDescriptor]

'resolvedToArrayType' @ [57:32] ==> public fun ResolvedCall<out CallableDescriptor>.resolvedToArrayType(): Boolean defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'left' @ [58:32] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.isApplicableTo[LocalVariableDescriptor]

'getResolvedCall' @ [58:37] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'left' @ [58:53] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.isApplicableTo[LocalVariableDescriptor]

'analyze' @ [58:58] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'leftResolvedCall' @ [59:16] ==> val leftResolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ReplaceArrayEqualityOpWithArraysEqualsIntention.isApplicableTo[LocalVariableDescriptor]

'resolvedToArrayType' @ [59:33] ==> public fun ResolvedCall<out CallableDescriptor>.resolvedToArrayType(): Boolean defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

