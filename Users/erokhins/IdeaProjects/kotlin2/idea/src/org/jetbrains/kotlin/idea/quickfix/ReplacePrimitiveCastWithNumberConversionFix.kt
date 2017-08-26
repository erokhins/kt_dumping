'KotlinQuickFixAction<KtBinaryExpressionWithTypeRHS>' @ [36:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtBinaryExpressionWithTypeRHS) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtBinaryExpressionWithTypeRHS

'element' @ [36:57] ==> value-parameter element: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.<init>[ValueParameterDescriptorImpl]

'targetShortType' @ [38:61] ==> private final val targetShortType: String defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix[PropertyDescriptorImpl]

'element' @ [42:23] ==> protected final val element: KtBinaryExpressionWithTypeRHS? defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [43:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [43:36] ==> val element: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.invoke[LocalVariableDescriptor]

'element' @ [44:24] ==> val element: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.invoke[LocalVariableDescriptor]

'replaced' @ [44:32] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'factory' @ [44:41] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.invoke[LocalVariableDescriptor]

'createExpressionByPattern' @ [44:49] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [44:88] ==> val element: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.invoke[LocalVariableDescriptor]

'left' @ [44:96] ==> public final val KtBinaryExpressionWithTypeRHS.left: KtExpression[MyPropertyDescriptor]

'targetShortType' @ [44:102] ==> private final val targetShortType: String defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix[PropertyDescriptorImpl]

'editor' @ [46:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.invoke[ValueParameterDescriptorImpl]

'caretModel' @ [46:17] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [46:29] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'replaced' @ [46:42] ==> val replaced: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.invoke[LocalVariableDescriptor]

'endOffset' @ [46:51] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [49:32] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'CAST_NEVER_SUCCEEDS' @ [51:27] ==> public final val CAST_NEVER_SUCCEEDS: (DiagnosticFactory0<(KtSimpleNameExpression..KtSimpleNameExpression?)>..DiagnosticFactory0<(KtSimpleNameExpression..KtSimpleNameExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [51:47] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): SimpleDiagnostic<(KtSimpleNameExpression..KtSimpleNameExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'diagnostic' @ [51:52] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.Factory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [51:64] ==> public final val <E : (PsiElement..PsiElement?)> SimpleDiagnostic<(KtSimpleNameExpression..KtSimpleNameExpression?)>.psiElement: KtSimpleNameExpression[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtSimpleNameExpression..org.jetbrains.kotlin.psi.KtSimpleNameExpression?)

'element' @ [52:36] ==> val element: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.Factory.createAction[LocalVariableDescriptor]

'parent' @ [52:44] ==> public final val KtOperationReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'binaryExpression' @ [54:27] ==> val binaryExpression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.Factory.createAction[LocalVariableDescriptor]

'analyze' @ [54:44] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'binaryExpression' @ [56:34] ==> val binaryExpression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.Factory.createAction[LocalVariableDescriptor]

'left' @ [56:51] ==> public final val KtBinaryExpressionWithTypeRHS.left: KtExpression[MyPropertyDescriptor]

'getType' @ [56:56] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [56:64] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.Factory.createAction[LocalVariableDescriptor]

'!' @ [57:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expressionType' @ [57:18] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.Factory.createAction[LocalVariableDescriptor]

'isPrimitiveNumberType' @ [57:33] ==> public fun KotlinType.isPrimitiveNumberType(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'binaryExpression' @ [59:28] ==> val binaryExpression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.Factory.createAction[LocalVariableDescriptor]

'right' @ [59:45] ==> public final val KtBinaryExpressionWithTypeRHS.right: KtTypeReference?[MyPropertyDescriptor]

'createTypeBinding' @ [59:52] ==> public fun KtTypeReference.createTypeBinding(trace: BindingContext): TypeBinding<KtTypeElement>? defined in org.jetbrains.kotlin.resolve.typeBinding[DeserializedSimpleFunctionDescriptor]

'context' @ [59:70] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.Factory.createAction[LocalVariableDescriptor]

'type' @ [59:80] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.TypeBinding[DeserializedPropertyDescriptor]

'!' @ [60:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'castType' @ [60:18] ==> val castType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.Factory.createAction[LocalVariableDescriptor]

'isPrimitiveNumberType' @ [60:27] ==> public fun KotlinType.isPrimitiveNumberType(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'ReplacePrimitiveCastWithNumberConversionFix' @ [62:20] ==> public constructor ReplacePrimitiveCastWithNumberConversionFix(element: KtBinaryExpressionWithTypeRHS, targetShortType: String) defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix[ClassConstructorDescriptorImpl]

'binaryExpression' @ [62:64] ==> val binaryExpression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.Factory.createAction[LocalVariableDescriptor]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [62:82] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[PropertyImportedFromObject]

'renderType' @ [62:115] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'castType' @ [62:126] ==> val castType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ReplacePrimitiveCastWithNumberConversionFix.Factory.createAction[LocalVariableDescriptor]

