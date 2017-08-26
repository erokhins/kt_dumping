'KotlinQuickFixAction<KtAnnotationEntry>' @ [32:3] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtAnnotationEntry) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtAnnotationEntry

'element' @ [32:43] ==> value-parameter element: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJavaAnnotationPositionedArgumentsFix.<init>[ValueParameterDescriptorImpl]

'text' @ [34:44] ==> public final val ReplaceJavaAnnotationPositionedArgumentsFix.text: String[MyPropertyDescriptor]

'element' @ [37:23] ==> protected final val element: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJavaAnnotationPositionedArgumentsFix[PropertyDescriptorImpl]

'element' @ [38:28] ==> val element: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJavaAnnotationPositionedArgumentsFix.invoke[LocalVariableDescriptor]

'getResolvedCall' @ [38:36] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [38:52] ==> val element: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJavaAnnotationPositionedArgumentsFix.invoke[LocalVariableDescriptor]

'analyze' @ [38:60] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [39:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [39:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJavaAnnotationPositionedArgumentsFix.invoke[ValueParameterDescriptorImpl]

'component1' @ [41:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, ResolvedValueArgument>.component1(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedValueArgument

'component2' @ [41:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, ResolvedValueArgument>.component2(): ResolvedValueArgument defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedValueArgument

'JavaAnnotationCallChecker' @ [41:30] ==> public companion object defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker[FakeCallableDescriptorForObject]

'getJavaAnnotationCallValueArgumentsThatShouldBeNamed' @ [41:56] ==> public final fun getJavaAnnotationCallValueArgumentsThatShouldBeNamed(resolvedCall: ResolvedCall<*>): Map<ValueParameterDescriptor, ResolvedValueArgument> defined in org.jetbrains.kotlin.resolve.jvm.checkers.JavaAnnotationCallChecker.Companion[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [41:109] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJavaAnnotationPositionedArgumentsFix.invoke[LocalVariableDescriptor]

'?:' @ [42:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ValueArgument?, right: ValueArgument): ValueArgument[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ValueArgument

'value' @ [42:34] ==> val value: ResolvedValueArgument defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJavaAnnotationPositionedArgumentsFix.invoke[LocalVariableDescriptor]

'valueArgument' @ [42:70] ==> public final val ExpressionValueArgument.valueArgument: ValueArgument?[MyPropertyDescriptor]

'valueArgument' @ [43:30] ==> val valueArgument: ValueArgument defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJavaAnnotationPositionedArgumentsFix.invoke[LocalVariableDescriptor]

'getArgumentExpression' @ [43:44] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'valueArgument' @ [45:13] ==> val valueArgument: ValueArgument defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJavaAnnotationPositionedArgumentsFix.invoke[LocalVariableDescriptor]

'asElement' @ [45:27] ==> public abstract fun asElement(): KtElement defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'replace' @ [45:39] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'psiFactory' @ [45:47] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJavaAnnotationPositionedArgumentsFix.invoke[LocalVariableDescriptor]

'createArgument' @ [45:58] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'expression' @ [45:73] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJavaAnnotationPositionedArgumentsFix.invoke[LocalVariableDescriptor]

'key' @ [45:85] ==> val key: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJavaAnnotationPositionedArgumentsFix.invoke[LocalVariableDescriptor]

'name' @ [45:89] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [49:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [51:17] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJavaAnnotationPositionedArgumentsFix.Companion.createAction[ValueParameterDescriptorImpl]

'createIntentionForFirstParentOfType' @ [51:28] ==> public inline fun <reified T : PsiElement> Diagnostic.createIntentionForFirstParentOfType(factory: (KtAnnotationEntry) -> KotlinQuickFixAction<KtAnnotationEntry>?): KotlinQuickFixAction<KtAnnotationEntry>? defined in org.jetbrains.kotlin.idea.quickfix.quickfixUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

