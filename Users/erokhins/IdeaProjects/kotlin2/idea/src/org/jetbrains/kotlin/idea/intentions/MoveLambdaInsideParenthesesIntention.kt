'SelfTargetingIntention<KtLambdaArgument>' @ [26:46] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtLambdaArgument>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtLambdaArgument

'KtLambdaArgument' @ [26:87] ==> public constructor KtLambdaArgument(node: ASTNode) defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedClassConstructorDescriptor]

'java' @ [26:111] ==> public val <T> KClass<KtLambdaArgument>.java: Class<KtLambdaArgument> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtLambdaArgument

'element' @ [28:20] ==> value-parameter element: KtLambdaArgument defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaInsideParenthesesIntention.isApplicableTo[ValueParameterDescriptorImpl]

'getLambdaExpression' @ [28:28] ==> public open fun getLambdaExpression(): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'bodyExpression' @ [28:50] ==> public final val KtLambdaExpression.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'!' @ [29:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'body' @ [29:17] ==> val body: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaInsideParenthesesIntention.isApplicableTo[LocalVariableDescriptor]

'textRange' @ [29:22] ==> public final val KtBlockExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsInside' @ [29:32] ==> public fun TextRange.containsInside(offset: Int): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'caretOffset' @ [29:47] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaInsideParenthesesIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [33:9] ==> value-parameter element: KtLambdaArgument defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaInsideParenthesesIntention.applyTo[ValueParameterDescriptorImpl]

'moveInsideParentheses' @ [33:17] ==> public fun KtLambdaArgument.moveInsideParentheses(bindingContext: BindingContext): KtCallExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'element' @ [33:39] ==> value-parameter element: KtLambdaArgument defined in org.jetbrains.kotlin.idea.intentions.MoveLambdaInsideParenthesesIntention.applyTo[ValueParameterDescriptorImpl]

'analyze' @ [33:47] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

