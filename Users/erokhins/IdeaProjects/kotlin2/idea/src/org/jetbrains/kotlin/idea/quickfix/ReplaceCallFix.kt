'KotlinQuickFixAction<KtQualifiedExpression>' @ [37:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtQualifiedExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtQualifiedExpression

'expression' @ [37:49] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.<init>[ValueParameterDescriptorImpl]

'text' @ [39:36] ==> public final val ReplaceCallFix.text: String[MyPropertyDescriptor]

'element' @ [42:23] ==> protected final val element: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix[PropertyDescriptorImpl]

'super' @ [43:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [43:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [43:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [43:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [43:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.isAvailable[ValueParameterDescriptorImpl]

'element' @ [43:60] ==> val element: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.isAvailable[LocalVariableDescriptor]

'selectorExpression' @ [43:68] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [47:23] ==> protected final val element: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix[PropertyDescriptorImpl]

'elvisOrEmpty' @ [48:21] ==> public fun elvisOrEmpty(notNullNeeded: Boolean): String defined in org.jetbrains.kotlin.idea.quickfix in file ReplaceCallFixUtils.kt[SimpleFunctionDescriptorImpl]

'notNullNeeded' @ [48:34] ==> private final val notNullNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [49:29] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [49:42] ==> val element: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.invoke[LocalVariableDescriptor]

'createExpressionByPattern' @ [49:51] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'operation' @ [49:81] ==> private final val operation: String defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix[PropertyDescriptorImpl]

'elvis' @ [49:93] ==> val elvis: String defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.invoke[LocalVariableDescriptor]

'element' @ [50:77] ==> val element: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.invoke[LocalVariableDescriptor]

'receiverExpression' @ [50:85] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [50:105] ==> val element: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.invoke[LocalVariableDescriptor]

'selectorExpression' @ [50:113] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [51:27] ==> val element: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.invoke[LocalVariableDescriptor]

'replace' @ [51:35] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[JavaMethodDescriptor]

'newExpression' @ [51:43] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.invoke[LocalVariableDescriptor]

'notNullNeeded' @ [52:13] ==> private final val notNullNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix[PropertyDescriptorImpl]

'replacement' @ [53:13] ==> val replacement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.invoke[LocalVariableDescriptor]

'moveCaretToEnd' @ [53:25] ==> public fun PsiElement.moveCaretToEnd(editor: Editor?, project: Project): Unit defined in org.jetbrains.kotlin.idea.quickfix in file ReplaceCallFixUtils.kt[SimpleFunctionDescriptorImpl]

'editor' @ [53:40] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.invoke[ValueParameterDescriptorImpl]

'project' @ [53:48] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix.invoke[ValueParameterDescriptorImpl]

'KotlinQuickFixAction<KtExpression>' @ [61:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtExpression

'expression' @ [61:40] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceImplicitReceiverCallFix.<init>[ValueParameterDescriptorImpl]

'text' @ [62:36] ==> public final val ReplaceImplicitReceiverCallFix.text: String[MyPropertyDescriptor]

'element' @ [67:23] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceImplicitReceiverCallFix[PropertyDescriptorImpl]

'elvisOrEmpty' @ [68:21] ==> public fun elvisOrEmpty(notNullNeeded: Boolean): String defined in org.jetbrains.kotlin.idea.quickfix in file ReplaceCallFixUtils.kt[SimpleFunctionDescriptorImpl]

'notNullNeeded' @ [68:34] ==> private final val notNullNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ReplaceImplicitReceiverCallFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [69:29] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [69:42] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceImplicitReceiverCallFix.invoke[LocalVariableDescriptor]

'createExpressionByPattern' @ [69:51] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'elvis' @ [69:87] ==> val elvis: String defined in org.jetbrains.kotlin.idea.quickfix.ReplaceImplicitReceiverCallFix.invoke[LocalVariableDescriptor]

'element' @ [69:95] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceImplicitReceiverCallFix.invoke[LocalVariableDescriptor]

'element' @ [70:27] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceImplicitReceiverCallFix.invoke[LocalVariableDescriptor]

'replace' @ [70:35] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'newExpression' @ [70:43] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceImplicitReceiverCallFix.invoke[LocalVariableDescriptor]

'notNullNeeded' @ [71:13] ==> private final val notNullNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ReplaceImplicitReceiverCallFix[PropertyDescriptorImpl]

'replacement' @ [72:13] ==> val replacement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceImplicitReceiverCallFix.invoke[LocalVariableDescriptor]

'moveCaretToEnd' @ [72:25] ==> public fun PsiElement.moveCaretToEnd(editor: Editor?, project: Project): Unit defined in org.jetbrains.kotlin.idea.quickfix in file ReplaceCallFixUtils.kt[SimpleFunctionDescriptorImpl]

'editor' @ [72:40] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceImplicitReceiverCallFix.invoke[ValueParameterDescriptorImpl]

'project' @ [72:48] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ReplaceImplicitReceiverCallFix.invoke[ValueParameterDescriptorImpl]

'ReplaceCallFix' @ [80:5] ==> public constructor ReplaceCallFix(expression: KtQualifiedExpression, operation: String, notNullNeeded: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix[ClassConstructorDescriptorImpl]

'expression' @ [80:20] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.<init>[ValueParameterDescriptorImpl]

'notNullNeeded' @ [80:38] ==> value-parameter notNullNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.<init>[ValueParameterDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [84:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [86:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [86:41] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'psiElement' @ [87:39] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.Companion.createAction[LocalVariableDescriptor]

'parent' @ [87:50] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (qualifiedExpression != null) {
                return ReplaceWithSafeCallFix(qualifiedExpression, qualifiedExpression.shouldHaveNotNullType())
            }
            else {
                psiElement as? KtNameReferenceExpression ?: return null
                if (psiElement.getResolvedCall(psiElement.analyze())?.getImplicitReceiverValue() != null) {
                    val expressionToReplace: KtExpression = psiElement.parent as? KtCallExpression ?: psiElement
                    return ReplaceImplicitReceiverCallFix(expressionToReplace, expressionToReplace.shouldHaveNotNullType())
                }
                return null
            }' @ [88:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'qualifiedExpression' @ [88:17] ==> val qualifiedExpression: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.Companion.createAction[LocalVariableDescriptor]

'ReplaceWithSafeCallFix' @ [89:24] ==> public constructor ReplaceWithSafeCallFix(expression: KtDotQualifiedExpression, notNullNeeded: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix[ClassConstructorDescriptorImpl]

'qualifiedExpression' @ [89:47] ==> val qualifiedExpression: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.Companion.createAction[LocalVariableDescriptor]

'qualifiedExpression' @ [89:68] ==> val qualifiedExpression: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.Companion.createAction[LocalVariableDescriptor]

'shouldHaveNotNullType' @ [89:88] ==> public fun KtExpression.shouldHaveNotNullType(): Boolean defined in org.jetbrains.kotlin.idea.quickfix in file ReplaceCallFixUtils.kt[SimpleFunctionDescriptorImpl]

'psiElement' @ [92:17] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.Companion.createAction[LocalVariableDescriptor]

'psiElement' @ [93:21] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.Companion.createAction[LocalVariableDescriptor]

'getResolvedCall' @ [93:32] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [93:48] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.Companion.createAction[LocalVariableDescriptor]

'analyze' @ [93:59] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getImplicitReceiverValue' @ [93:71] ==> public fun ResolvedCall<*>.getImplicitReceiverValue(): ImplicitReceiver? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [94:61] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.Companion.createAction[LocalVariableDescriptor]

'parent' @ [94:72] ==> public final val KtNameReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'psiElement' @ [94:103] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.Companion.createAction[LocalVariableDescriptor]

'ReplaceImplicitReceiverCallFix' @ [95:28] ==> public constructor ReplaceImplicitReceiverCallFix(expression: KtExpression, notNullNeeded: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceImplicitReceiverCallFix[ClassConstructorDescriptorImpl]

'expressionToReplace' @ [95:59] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.Companion.createAction[LocalVariableDescriptor]

'expressionToReplace' @ [95:80] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallFix.Companion.createAction[LocalVariableDescriptor]

'shouldHaveNotNullType' @ [95:100] ==> public fun KtExpression.shouldHaveNotNullType(): Boolean defined in org.jetbrains.kotlin.idea.quickfix in file ReplaceCallFixUtils.kt[SimpleFunctionDescriptorImpl]

'ReplaceCallFix' @ [106:5] ==> public constructor ReplaceCallFix(expression: KtQualifiedExpression, operation: String, notNullNeeded: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix[ClassConstructorDescriptorImpl]

'expression' @ [106:20] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.<init>[ValueParameterDescriptorImpl]

'notNullNeeded' @ [106:38] ==> value-parameter notNullNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.<init>[ValueParameterDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [110:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [112:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [112:38] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'element' @ [113:40] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'getStrictParentOfType' @ [113:48] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtFunctionLiteral? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtFunctionLiteral

'scopeFunctionLiteral' @ [114:39] ==> val scopeFunctionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'getStrictParentOfType' @ [114:60] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtCallExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallExpression

'scopeCallExpression' @ [115:47] ==> val scopeCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'getStrictParentOfType' @ [115:67] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtDotQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDotQualifiedExpression

'scopeCallExpression' @ [117:27] ==> val scopeCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'analyze' @ [117:47] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [118:50] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'FUNCTION' @ [118:73] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'scopeFunctionLiteral' @ [118:83] ==> val scopeFunctionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'scopeCallExpression' @ [119:37] ==> val scopeCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'scopeFunctionKind' @ [119:57] ==> private final fun KtCallExpression.scopeFunctionKind(context: BindingContext): ReplaceWithSafeCallForScopeFunctionFix.Companion.ScopeFunctionKind? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion[SimpleFunctionDescriptorImpl]

'context' @ [119:75] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'element' @ [121:37] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'parent' @ [121:45] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'receiverExpression' @ [121:83] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'internalReceiver' @ [122:46] ==> val internalReceiver: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'getResolvedCall' @ [122:63] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [122:79] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'candidateDescriptor' @ [122:89] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'?:' @ [123:40] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ResolvedCall<out CallableDescriptor>?, right: ResolvedCall<out CallableDescriptor>): ResolvedCall<out CallableDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ResolvedCall<out CallableDescriptor>

'element' @ [123:41] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'getParentOfType' @ [123:49] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtElement

'getResolvedCall' @ [123:94] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [123:110] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'when (scopeFunctionKind) {
                ScopeFunctionKind.WITH_PARAMETER -> {
                    if (internalReceiverDescriptor != scopeFunctionLiteralDescriptor.valueParameters.singleOrNull()) {
                        return null
                    }
                }
                ScopeFunctionKind.WITH_RECEIVER -> {
                    if (internalReceiverDescriptor != scopeFunctionLiteralDescriptor.extensionReceiverParameter &&
                        internalResolvedCall.getImplicitReceiverValue() == null) {
                        return null
                    }
                }
            }' @ [126:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'scopeFunctionKind' @ [126:19] ==> val scopeFunctionKind: ReplaceWithSafeCallForScopeFunctionFix.Companion.ScopeFunctionKind defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'WITH_PARAMETER' @ [127:35] ==> enum entry WITH_PARAMETER defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.ScopeFunctionKind[FakeCallableDescriptorForObject]

'internalReceiverDescriptor' @ [128:25] ==> val internalReceiverDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'scopeFunctionLiteralDescriptor' @ [128:55] ==> val scopeFunctionLiteralDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'valueParameters' @ [128:86] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'singleOrNull' @ [128:102] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.singleOrNull(): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'WITH_RECEIVER' @ [132:35] ==> enum entry WITH_RECEIVER defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.ScopeFunctionKind[FakeCallableDescriptorForObject]

'internalReceiverDescriptor' @ [133:25] ==> val internalReceiverDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'scopeFunctionLiteralDescriptor' @ [133:55] ==> val scopeFunctionLiteralDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'extensionReceiverParameter' @ [133:86] ==> public final val SimpleFunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'internalResolvedCall' @ [134:25] ==> val internalResolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'getImplicitReceiverValue' @ [134:46] ==> public fun ResolvedCall<*>.getImplicitReceiverValue(): ImplicitReceiver? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'ReplaceWithSafeCallForScopeFunctionFix' @ [140:20] ==> public constructor ReplaceWithSafeCallForScopeFunctionFix(expression: KtDotQualifiedExpression, notNullNeeded: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix[ClassConstructorDescriptorImpl]

'scopeDotQualifiedExpression' @ [141:21] ==> val scopeDotQualifiedExpression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'scopeDotQualifiedExpression' @ [141:50] ==> val scopeDotQualifiedExpression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.createAction[LocalVariableDescriptor]

'shouldHaveNotNullType' @ [141:78] ==> public fun KtExpression.shouldHaveNotNullType(): Boolean defined in org.jetbrains.kotlin.idea.quickfix in file ReplaceCallFixUtils.kt[SimpleFunctionDescriptorImpl]

'getResolvedCall' @ [145:30] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [145:46] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.scopeFunctionKind[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [145:56] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'fqNameUnsafe' @ [145:77] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [145:91] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'values' @ [146:38] ==> public final fun values(): Array<ReplaceWithSafeCallForScopeFunctionFix.Companion.ScopeFunctionKind> defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.ScopeFunctionKind[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [146:47] ==> public inline fun <T> Array<out ReplaceWithSafeCallForScopeFunctionFix.Companion.ScopeFunctionKind>.firstOrNull(predicate: (ReplaceWithSafeCallForScopeFunctionFix.Companion.ScopeFunctionKind) -> Boolean): ReplaceWithSafeCallForScopeFunctionFix.Companion.ScopeFunctionKind? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeFunctionKind

'kind' @ [146:69] ==> value-parameter kind: ReplaceWithSafeCallForScopeFunctionFix.Companion.ScopeFunctionKind defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.scopeFunctionKind.<anonymous>[ValueParameterDescriptorImpl]

'names' @ [146:74] ==> public final val names: Array<out String> defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.ScopeFunctionKind[PropertyDescriptorImpl]

'contains' @ [146:80] ==> public operator fun <@OnlyInputTypes T> Array<out String?>.contains(element: String?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'methodName' @ [146:89] ==> val methodName: String? defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.scopeFunctionKind[LocalVariableDescriptor]

'' @ [150:27] ==> private constructor ScopeFunctionKind(vararg names: String) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.ScopeFunctionKind[ClassConstructorDescriptorImpl]

'' @ [151:26] ==> private constructor ScopeFunctionKind(vararg names: String) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithSafeCallForScopeFunctionFix.Companion.ScopeFunctionKind[ClassConstructorDescriptorImpl]

'ReplaceCallFix' @ [156:70] ==> public constructor ReplaceCallFix(expression: KtQualifiedExpression, operation: String, notNullNeeded: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceCallFix[ClassConstructorDescriptorImpl]

'expression' @ [156:85] ==> value-parameter expression: KtSafeQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithDotCallFix.<init>[ValueParameterDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [159:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [161:39] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithDotCallFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [161:50] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getParentOfType' @ [161:61] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtSafeQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSafeQualifiedExpression

'ReplaceWithDotCallFix' @ [162:20] ==> public constructor ReplaceWithDotCallFix(expression: KtSafeQualifiedExpression) defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithDotCallFix[ClassConstructorDescriptorImpl]

'qualifiedExpression' @ [162:42] ==> val qualifiedExpression: KtSafeQualifiedExpression defined in org.jetbrains.kotlin.idea.quickfix.ReplaceWithDotCallFix.Companion.createAction[LocalVariableDescriptor]

