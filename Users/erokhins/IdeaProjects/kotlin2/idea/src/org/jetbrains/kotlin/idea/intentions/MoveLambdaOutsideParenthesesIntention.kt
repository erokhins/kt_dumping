'SelfTargetingIntention<KtCallExpression>' @ [31:47] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtCallExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtCallExpression

'KtCallExpression' @ [31:88] ==> public constructor KtCallExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtCallExpression[JavaClassConstructorDescriptor]

'java' @ [31:112] ==> public val <T> KClass<KtCallExpression>.java: Class<KtCallExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallExpression

'callExpression' @ [34:17] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.getLambdaExpression[ValueParameterDescriptorImpl]

'lambdaArguments' @ [34:32] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [34:48] ==> @InlineOnly public inline fun <T> Collection<(KtLambdaArgument..KtLambdaArgument?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'callExpression' @ [35:20] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.getLambdaExpression[ValueParameterDescriptorImpl]

'valueArguments' @ [35:35] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'lastOrNull' @ [35:50] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.lastOrNull(): KtValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'getArgumentExpression' @ [35:64] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'unpackFunctionLiteral' @ [35:89] ==> public fun KtExpression.unpackFunctionLiteral(allowParentheses: Boolean = ...): KtLambdaExpression? defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'getLambdaExpression' @ [39:17] ==> private final fun getLambdaExpression(callExpression: KtCallExpression): KtLambdaExpression? defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [39:37] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove[ValueParameterDescriptorImpl]

'element' @ [41:26] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove[ValueParameterDescriptorImpl]

'calleeExpression' @ [41:34] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'callee' @ [42:17] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove[LocalVariableDescriptor]

'element' @ [43:38] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove[ValueParameterDescriptorImpl]

'analyze' @ [43:46] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [43:70] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'bindingContext' @ [44:31] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [44:61] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'callee' @ [44:79] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove[LocalVariableDescriptor]

'let' @ [44:88] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> List<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> List<DeclarationDescriptor>

'listOf' @ [44:94] ==> public fun <T> listOf(element: DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [44:101] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [45:34] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove[LocalVariableDescriptor]

'AMBIGUOUS_REFERENCE_TARGET' @ [45:64] ==> public final val AMBIGUOUS_REFERENCE_TARGET: (WritableSlice<(KtExpression..KtExpression?), (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'callee' @ [45:92] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove[LocalVariableDescriptor]

'listOf' @ [46:34] ==> @InlineOnly public inline fun <T> listOf(): List<(DeclarationDescriptor..DeclarationDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'targets' @ [47:34] ==> val targets: (Collection<DeclarationDescriptor>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>) defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove[LocalVariableDescriptor]

'filterIsInstance' @ [47:42] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> FunctionDescriptor

'candidates' @ [49:21] ==> val candidates: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove[LocalVariableDescriptor]

'isNotEmpty' @ [49:32] ==> @InlineOnly public inline fun <T> Collection<FunctionDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'candidates' @ [49:48] ==> val candidates: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove[LocalVariableDescriptor]

'none' @ [49:59] ==> public inline fun <T> Iterable<FunctionDescriptor>.none(predicate: (FunctionDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'it' @ [50:41] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [50:44] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'lastOrNull' @ [50:60] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.lastOrNull(): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'lastParameter' @ [51:21] ==> val lastParameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove.<anonymous>[LocalVariableDescriptor]

'lastParameter' @ [51:46] ==> val lastParameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.canMove.<anonymous>[LocalVariableDescriptor]

'type' @ [51:60] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'isFunctionType' @ [51:65] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'?:' @ [61:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtCallExpression?, right: KtCallExpression): KtCallExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtCallExpression

'expression' @ [61:26] ==> value-parameter expression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.moveFunctionLiteralOutsideParenthesesIfPossible[ValueParameterDescriptorImpl]

'parent' @ [61:37] ==> public final val KtLambdaExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [61:66] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [61:99] ==> public final val KtValueArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'canMove' @ [62:17] ==> public final fun canMove(element: KtCallExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion[SimpleFunctionDescriptorImpl]

'call' @ [62:25] ==> val call: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.moveFunctionLiteralOutsideParenthesesIfPossible[LocalVariableDescriptor]

'call' @ [63:17] ==> val call: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion.moveFunctionLiteralOutsideParenthesesIfPossible[LocalVariableDescriptor]

'moveFunctionLiteralOutsideParentheses' @ [63:22] ==> public fun KtCallExpression.moveFunctionLiteralOutsideParentheses(): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'!' @ [69:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canMove' @ [69:14] ==> public final fun canMove(element: KtCallExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [69:22] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.isApplicableTo[ValueParameterDescriptorImpl]

'getLambdaExpression' @ [71:32] ==> private final fun getLambdaExpression(callExpression: KtCallExpression): KtLambdaExpression? defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [71:52] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.isApplicableTo[ValueParameterDescriptorImpl]

'lambdaExpression' @ [72:24] ==> val lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.isApplicableTo[LocalVariableDescriptor]

'getStrictParentOfType' @ [72:41] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtValueArgument? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtValueArgument

'caretOffset' @ [73:13] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.isApplicableTo[ValueParameterDescriptorImpl]

'argument' @ [73:27] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.isApplicableTo[LocalVariableDescriptor]

'startOffset' @ [73:36] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'lambdaExpression' @ [74:25] ==> val lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.isApplicableTo[LocalVariableDescriptor]

'bodyExpression' @ [74:42] ==> public final val KtLambdaExpression.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'textRange' @ [74:58] ==> public final val KtBlockExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'!' @ [75:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'bodyRange' @ [75:17] ==> val bodyRange: TextRange defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.isApplicableTo[LocalVariableDescriptor]

'containsInside' @ [75:27] ==> public fun TextRange.containsInside(offset: Int): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'caretOffset' @ [75:42] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [79:9] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaOutsideParenthesesIntention.applyTo[ValueParameterDescriptorImpl]

'moveFunctionLiteralOutsideParentheses' @ [79:17] ==> public fun KtCallExpression.moveFunctionLiteralOutsideParentheses(): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

