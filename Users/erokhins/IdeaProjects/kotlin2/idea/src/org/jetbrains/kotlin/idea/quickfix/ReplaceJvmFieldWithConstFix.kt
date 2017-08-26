'KotlinQuickFixAction<KtAnnotationEntry>' @ [37:68] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtAnnotationEntry) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtAnnotationEntry

'annotation' @ [37:108] ==> value-parameter annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.<init>[ValueParameterDescriptorImpl]

'text' @ [40:44] ==> public final val ReplaceJvmFieldWithConstFix.text: String[MyPropertyDescriptor]

'element' @ [43:24] ==> protected final val element: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix[PropertyDescriptorImpl]

'getParentOfType' @ [43:33] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'element' @ [44:9] ==> protected final val element: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix[PropertyDescriptorImpl]

'delete' @ [44:18] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtAnnotationEntry[JavaMethodDescriptor]

'property' @ [45:9] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.invoke[LocalVariableDescriptor]

'addModifier' @ [45:18] ==> public open fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'CONST_KEYWORD' @ [45:39] ==> public final val CONST_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [48:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [50:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [50:41] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'annotation' @ [51:28] ==> val annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.Companion.createAction[LocalVariableDescriptor]

'getParentOfType' @ [51:39] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'property' @ [52:38] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.Companion.createAction[LocalVariableDescriptor]

'descriptor' @ [52:47] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedPropertyDescriptor]

'!' @ [53:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ConstModifierChecker' @ [53:18] ==> public object ConstModifierChecker : SimpleDeclarationChecker defined in org.jetbrains.kotlin.resolve.checkers[FakeCallableDescriptorForObject]

'canBeConst' @ [53:39] ==> public final fun canBeConst(declaration: KtDeclaration, constModifierPsiElement: PsiElement, descriptor: VariableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.checkers.ConstModifierChecker[DeserializedSimpleFunctionDescriptor]

'property' @ [53:50] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.Companion.createAction[LocalVariableDescriptor]

'property' @ [53:60] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.Companion.createAction[LocalVariableDescriptor]

'propertyDescriptor' @ [53:70] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.Companion.createAction[LocalVariableDescriptor]

'property' @ [57:31] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.Companion.createAction[LocalVariableDescriptor]

'initializer' @ [57:40] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'!' @ [58:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'initializer' @ [58:18] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.Companion.createAction[LocalVariableDescriptor]

'isConstantExpression' @ [58:30] ==> private final fun KtExpression.isConstantExpression(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.Companion[SimpleFunctionDescriptorImpl]

'ReplaceJvmFieldWithConstFix' @ [62:20] ==> public constructor ReplaceJvmFieldWithConstFix(annotation: KtAnnotationEntry) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix[ClassConstructorDescriptorImpl]

'annotation' @ [62:48] ==> val annotation: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.Companion.createAction[LocalVariableDescriptor]

'?:' @ [66:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'getConstant' @ [66:45] ==> @JvmStatic public final fun getConstant(expression: KtExpression, bindingContext: BindingContext): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator.Companion[DeserializedSimpleFunctionDescriptor]

'this' @ [66:57] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.Companion.isConstantExpression[ReceiverParameterDescriptorImpl]

'analyze' @ [66:63] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [66:87] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'let' @ [66:98] ==> @InlineOnly public inline fun <T, R> CompileTimeConstant<*>.let(block: (CompileTimeConstant<*>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompileTimeConstant<*>
    <R> -> Boolean

'!' @ [67:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [67:22] ==> value-parameter it: CompileTimeConstant<*> defined in org.jetbrains.kotlin.idea.quickfix.ReplaceJvmFieldWithConstFix.Companion.isConstantExpression.<anonymous>[ValueParameterDescriptorImpl]

'usesNonConstValAsConstant' @ [67:25] ==> public open val usesNonConstValAsConstant: Boolean defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstant[DeserializedPropertyDescriptor]

