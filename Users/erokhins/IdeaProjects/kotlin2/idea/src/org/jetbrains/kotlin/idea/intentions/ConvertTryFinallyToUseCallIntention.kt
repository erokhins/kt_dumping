'IntentionBasedInspection<KtTryExpression>' @ [35:46] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtTryExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtTryExpression

'ConvertTryFinallyToUseCallIntention' @ [35:88] ==> public constructor ConvertTryFinallyToUseCallIntention() defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention[ClassConstructorDescriptorImpl]

'element' @ [36:63] ==> value-parameter element: KtTryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallInspection.inspectionTarget[ValueParameterDescriptorImpl]

'tryKeyword' @ [36:71] ==> public final val KtTryExpression.tryKeyword: PsiElement?[MyPropertyDescriptor]

'element' @ [36:85] ==> value-parameter element: KtTryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallInspection.inspectionTarget[ValueParameterDescriptorImpl]

'tryBlock' @ [36:93] ==> public final val KtTryExpression.tryBlock: KtBlockExpression[MyPropertyDescriptor]

'SelfTargetingRangeIntention<KtTryExpression>' @ [39:45] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtTryExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtTryExpression

'KtTryExpression' @ [40:9] ==> public constructor KtTryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtTryExpression[JavaClassConstructorDescriptor]

'java' @ [40:32] ==> public val <T> KClass<KtTryExpression>.java: Class<KtTryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtTryExpression

'element' @ [43:30] ==> value-parameter element: KtTryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[ValueParameterDescriptorImpl]

'finallyBlock' @ [43:38] ==> public final val KtTryExpression.finallyBlock: KtFinallySection?[MyPropertyDescriptor]

'finallySection' @ [44:33] ==> val finallySection: KtFinallySection defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'finalExpression' @ [44:48] ==> public final val KtFinallySection.finalExpression: (KtBlockExpression..KtBlockExpression?)[MyPropertyDescriptor]

'statements' @ [44:64] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'single' @ [44:75] ==> public fun <T> List<(KtExpression..KtExpression?)>.single(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'finallyExpression' @ [45:42] ==> val finallyExpression: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'receiverExpression' @ [45:88] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'finallyExpressionReceiver' @ [46:33] ==> val finallyExpressionReceiver: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'resourceReference' @ [47:28] ==> val resourceReference: KtNameReferenceExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'getReferencedNameAsName' @ [47:47] ==> public open fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [49:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [49:36] ==> value-parameter element: KtTryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[ValueParameterDescriptorImpl]

'factory' @ [51:33] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'buildExpression' @ [51:41] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'if (resourceName != null) {
                appendName(resourceName)
                appendFixedText(".")
            }
            else if (finallyExpressionReceiver is KtThisExpression) {
                appendFixedText(finallyExpressionReceiver.text)
                appendFixedText(".")
            }' @ [52:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'resourceName' @ [52:17] ==> val resourceName: Name? defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'appendName' @ [53:17] ==> public final fun appendName(name: Name): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'resourceName' @ [53:28] ==> val resourceName: Name? defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'appendFixedText' @ [54:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'finallyExpressionReceiver' @ [56:22] ==> val finallyExpressionReceiver: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'appendFixedText' @ [57:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'finallyExpressionReceiver' @ [57:33] ==> val finallyExpressionReceiver: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'text' @ [57:59] ==> public final val KtThisExpression.text: (String..String?)[MyPropertyDescriptor]

'appendFixedText' @ [58:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [60:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'resourceName' @ [62:17] ==> val resourceName: Name? defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'appendName' @ [63:17] ==> public final fun appendName(name: Name): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'resourceName' @ [63:28] ==> val resourceName: Name? defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'appendFixedText' @ [64:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [66:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendChildRange' @ [68:13] ==> public final fun appendChildRange(range: PsiChildRange): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'element' @ [68:30] ==> value-parameter element: KtTryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[ValueParameterDescriptorImpl]

'tryBlock' @ [68:38] ==> public final val KtTryExpression.tryBlock: KtBlockExpression[MyPropertyDescriptor]

'contentRange' @ [68:47] ==> public fun KtBlockExpression.contentRange(): PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [69:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'element' @ [72:22] ==> value-parameter element: KtTryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [72:30] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtTryExpression[DeserializedSimpleFunctionDescriptor]

'useCallExpression' @ [72:38] ==> val useCallExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'when (result) {
            is KtQualifiedExpression -> result.selectorExpression as? KtCallExpression ?: return
            is KtCallExpression -> result
            else -> return
        }' @ [73:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtCallExpression, entry1: KtCallExpression, entry2: KtCallExpression): KtCallExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtCallExpression

'result' @ [73:26] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'result' @ [74:41] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'selectorExpression' @ [74:48] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'result' @ [75:36] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'call' @ [78:22] ==> val call: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'lambdaArguments' @ [78:27] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'firstOrNull' @ [78:43] ==> public fun <T> List<(KtLambdaArgument..KtLambdaArgument?)>.firstOrNull(): KtLambdaArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'lambda' @ [79:31] ==> val lambda: KtLambdaArgument defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'getLambdaExpression' @ [79:38] ==> public open fun getLambdaExpression(): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [79:60] ==> public final val KtLambdaExpression.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'firstOrNull' @ [79:76] ==> public fun <T> List<(KtParameter..KtParameter?)>.firstOrNull(): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'editor' @ [80:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[ValueParameterDescriptorImpl]

'selectionModel' @ [80:17] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'setSelection' @ [80:33] ==> public abstract fun setSelection(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'lambdaParameter' @ [80:46] ==> val lambdaParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'startOffset' @ [80:62] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'lambdaParameter' @ [80:75] ==> val lambdaParameter: KtParameter defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applyTo[LocalVariableDescriptor]

'endOffset' @ [80:91] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [85:30] ==> value-parameter element: KtTryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[ValueParameterDescriptorImpl]

'finallyBlock' @ [85:38] ==> public final val KtTryExpression.finallyBlock: KtFinallySection?[MyPropertyDescriptor]

'finallySection' @ [86:33] ==> val finallySection: KtFinallySection defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'finalExpression' @ [86:48] ==> public final val KtFinallySection.finalExpression: (KtBlockExpression..KtBlockExpression?)[MyPropertyDescriptor]

'statements' @ [86:64] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'singleOrNull' @ [86:75] ==> public fun <T> List<(KtExpression..KtExpression?)>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'element' @ [87:13] ==> value-parameter element: KtTryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[ValueParameterDescriptorImpl]

'catchClauses' @ [87:21] ==> public final val KtTryExpression.catchClauses: (MutableList<(KtCatchClause..KtCatchClause?)>..List<(KtCatchClause..KtCatchClause?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [87:34] ==> @InlineOnly public inline fun <T> Collection<(KtCatchClause..KtCatchClause?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtCatchClause..org.jetbrains.kotlin.psi.KtCatchClause?)

'element' @ [89:23] ==> value-parameter element: KtTryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[ValueParameterDescriptorImpl]

'analyze' @ [89:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'finallyExpression' @ [90:28] ==> val finallyExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'getResolvedCall' @ [90:46] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [90:62] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'resolvedCall' @ [91:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'candidateDescriptor' @ [91:26] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'name' @ [91:46] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [91:51] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'resolvedCall' @ [92:13] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'extensionReceiver' @ [92:26] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resolvedCall' @ [93:24] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'dispatchReceiver' @ [93:37] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'receiver' @ [94:13] ==> val receiver: ReceiverValue defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'type' @ [94:22] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'supertypes' @ [94:27] ==> public fun KotlinType.supertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'all' @ [94:40] ==> public inline fun <T> Iterable<KotlinType>.all(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [95:13] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [95:16] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [95:28] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'fqNameSafe' @ [95:51] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [95:63] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'let' @ [95:74] ==> @InlineOnly public inline fun <T, R> String?.let(block: (String?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?
    <R> -> Boolean

'it' @ [96:17] ==> value-parameter it: String? defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [96:46] ==> value-parameter it: String? defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'when (receiver) {
            is ExpressionReceiver -> {
                val expression = receiver.expression
                if (expression !is KtThisExpression) {
                    val resourceReference = expression as? KtReferenceExpression ?: return null
                    val resourceDescriptor =
                            context[BindingContext.REFERENCE_TARGET, resourceReference] as? VariableDescriptor ?: return null
                    if (resourceDescriptor.isVar) return null
                }
            }
            is ImplicitReceiver -> {}
            else -> return null
        }' @ [100:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'receiver' @ [100:15] ==> val receiver: ReceiverValue defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'receiver' @ [102:34] ==> val receiver: ReceiverValue defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'expression' @ [102:43] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'expression' @ [103:21] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'expression' @ [104:45] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'context' @ [106:29] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [106:52] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'resourceReference' @ [106:70] ==> val resourceReference: KtReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'resourceDescriptor' @ [107:25] ==> val resourceDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[LocalVariableDescriptor]

'isVar' @ [107:44] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'TextRange' @ [114:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'element' @ [114:26] ==> value-parameter element: KtTryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[ValueParameterDescriptorImpl]

'startOffset' @ [114:34] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [114:47] ==> value-parameter element: KtTryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[ValueParameterDescriptorImpl]

'tryBlock' @ [114:55] ==> public final val KtTryExpression.tryBlock: KtBlockExpression[MyPropertyDescriptor]

'lBrace' @ [114:64] ==> public final val KtBlockExpression.lBrace: PsiElement?[MyPropertyDescriptor]

'endOffset' @ [114:72] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [114:85] ==> value-parameter element: KtTryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTryFinallyToUseCallIntention.applicabilityRange[ValueParameterDescriptorImpl]

'endOffset' @ [114:93] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

