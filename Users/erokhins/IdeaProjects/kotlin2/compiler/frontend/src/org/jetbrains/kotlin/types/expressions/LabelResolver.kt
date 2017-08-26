'newLinkedHashSet' @ [38:29] ==> public open fun <E : (Any..Any?)> newLinkedHashSet(): (LinkedHashSet<(KtElement..KtElement?)>..LinkedHashSet<(KtElement..KtElement?)>?) defined in com.google.common.collect.Sets[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'labelExpression' @ [39:35] ==> value-parameter labelExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getElementsByLabelName[ValueParameterDescriptorImpl]

'parent' @ [39:51] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [40:16] ==> var parent: PsiElement? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getElementsByLabelName[LocalVariableDescriptor]

'getLabelNameIfAny' @ [41:24] ==> public final fun getLabelNameIfAny(element: PsiElement): Name? defined in org.jetbrains.kotlin.types.expressions.LabelResolver[SimpleFunctionDescriptorImpl]

'parent' @ [41:42] ==> var parent: PsiElement? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getElementsByLabelName[LocalVariableDescriptor]

'name' @ [42:17] ==> val name: Name? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getElementsByLabelName[LocalVariableDescriptor]

'name' @ [42:33] ==> val name: Name? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getElementsByLabelName[LocalVariableDescriptor]

'labelName' @ [42:41] ==> value-parameter labelName: Name defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getElementsByLabelName[ValueParameterDescriptorImpl]

'elements' @ [43:17] ==> val elements: (LinkedHashSet<(KtElement..KtElement?)>..LinkedHashSet<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getElementsByLabelName[LocalVariableDescriptor]

'add' @ [43:26] ==> public open fun add(element: (KtElement..KtElement?)): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'getExpressionUnderLabel' @ [43:30] ==> private final fun getExpressionUnderLabel(labeledExpression: KtExpression): KtExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver[SimpleFunctionDescriptorImpl]

'parent' @ [43:54] ==> var parent: PsiElement? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getElementsByLabelName[LocalVariableDescriptor]

'parent' @ [45:13] ==> var parent: PsiElement? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getElementsByLabelName[LocalVariableDescriptor]

'parent' @ [45:22] ==> var parent: PsiElement? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getElementsByLabelName[LocalVariableDescriptor]

'parent' @ [45:29] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'elements' @ [47:16] ==> val elements: (LinkedHashSet<(KtElement..KtElement?)>..LinkedHashSet<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getElementsByLabelName[LocalVariableDescriptor]

'when (element) {
            is KtLabeledExpression -> element.getLabelNameAsName()
            is KtFunctionLiteral -> getLabelNameIfAny(element.parent)
            is KtLambdaExpression -> getLabelForFunctionalExpression(element)
            is KtNamedFunction -> element.nameAsName ?: getLabelForFunctionalExpression(element)
            else -> null
        }' @ [51:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Name?, entry1: Name?, entry2: Name?, entry3: Name?, entry4: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Name?

'element' @ [51:22] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getLabelNameIfAny[ValueParameterDescriptorImpl]

'element' @ [52:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getLabelNameIfAny[ValueParameterDescriptorImpl]

'getLabelNameAsName' @ [52:47] ==> public final fun getLabelNameAsName(): Name? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[SimpleFunctionDescriptorImpl]

'getLabelNameIfAny' @ [53:37] ==> public final fun getLabelNameIfAny(element: PsiElement): Name? defined in org.jetbrains.kotlin.types.expressions.LabelResolver[SimpleFunctionDescriptorImpl]

'element' @ [53:55] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getLabelNameIfAny[ValueParameterDescriptorImpl]

'parent' @ [53:63] ==> public final val KtFunctionLiteral.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getLabelForFunctionalExpression' @ [54:38] ==> private final fun getLabelForFunctionalExpression(element: KtExpression): Name? defined in org.jetbrains.kotlin.types.expressions.LabelResolver[SimpleFunctionDescriptorImpl]

'element' @ [54:70] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getLabelNameIfAny[ValueParameterDescriptorImpl]

'element' @ [55:35] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getLabelNameIfAny[ValueParameterDescriptorImpl]

'nameAsName' @ [55:43] ==> public final val KtNamedFunction.nameAsName: Name?[MyPropertyDescriptor]

'getLabelForFunctionalExpression' @ [55:57] ==> private final fun getLabelForFunctionalExpression(element: KtExpression): Name? defined in org.jetbrains.kotlin.types.expressions.LabelResolver[SimpleFunctionDescriptorImpl]

'element' @ [55:89] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getLabelNameIfAny[ValueParameterDescriptorImpl]

'element' @ [61:22] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getLabelForFunctionalExpression[ValueParameterDescriptorImpl]

'parent' @ [61:30] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtLabeledExpression -> getLabelNameIfAny(parent)
            is KtBinaryExpression -> parent.operationReference.getReferencedNameAsName()
            else -> getCallerName(element)
        }' @ [62:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Name?, entry1: Name?, entry2: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Name?

'parent' @ [62:22] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getLabelForFunctionalExpression[LocalVariableDescriptor]

'getLabelNameIfAny' @ [63:39] ==> public final fun getLabelNameIfAny(element: PsiElement): Name? defined in org.jetbrains.kotlin.types.expressions.LabelResolver[SimpleFunctionDescriptorImpl]

'parent' @ [63:57] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getLabelForFunctionalExpression[LocalVariableDescriptor]

'parent' @ [64:38] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getLabelForFunctionalExpression[LocalVariableDescriptor]

'operationReference' @ [64:45] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'getReferencedNameAsName' @ [64:64] ==> public open fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[SimpleFunctionDescriptorImpl]

'getCallerName' @ [65:21] ==> private final fun getCallerName(expression: KtExpression): Name? defined in org.jetbrains.kotlin.types.expressions.LabelResolver[SimpleFunctionDescriptorImpl]

'element' @ [65:35] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getLabelForFunctionalExpression[ValueParameterDescriptorImpl]

'safeDeparenthesize' @ [70:36] ==> @NotNull public open fun safeDeparenthesize(@NotNull expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'labeledExpression' @ [70:55] ==> value-parameter labeledExpression: KtExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getExpressionUnderLabel[ValueParameterDescriptorImpl]

'if (expression is KtLambdaExpression) expression.functionLiteral else expression' @ [71:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'expression' @ [71:20] ==> val expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getExpressionUnderLabel[LocalVariableDescriptor]

'expression' @ [71:54] ==> val expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getExpressionUnderLabel[LocalVariableDescriptor]

'functionLiteral' @ [71:65] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'expression' @ [71:86] ==> val expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getExpressionUnderLabel[LocalVariableDescriptor]

'getContainingCallExpression' @ [75:30] ==> private final fun getContainingCallExpression(expression: KtExpression): KtCallExpression? defined in org.jetbrains.kotlin.types.expressions.LabelResolver[SimpleFunctionDescriptorImpl]

'expression' @ [75:58] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getCallerName[ValueParameterDescriptorImpl]

'callExpression' @ [76:32] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getCallerName[LocalVariableDescriptor]

'calleeExpression' @ [76:47] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'calleeExpression' @ [77:16] ==> val calleeExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getCallerName[LocalVariableDescriptor]

'getReferencedNameAsName' @ [77:34] ==> public abstract fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'expression' @ [82:22] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getContainingCallExpression[ValueParameterDescriptorImpl]

'parent' @ [82:33] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [83:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getContainingCallExpression[LocalVariableDescriptor]

'parent' @ [85:24] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getContainingCallExpression[LocalVariableDescriptor]

'parent' @ [85:31] ==> public final val KtLambdaArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'call' @ [86:17] ==> val call: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getContainingCallExpression[LocalVariableDescriptor]

'call' @ [87:24] ==> val call: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getContainingCallExpression[LocalVariableDescriptor]

'parent' @ [91:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getContainingCallExpression[LocalVariableDescriptor]

'parent' @ [93:27] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getContainingCallExpression[LocalVariableDescriptor]

'parent' @ [93:34] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'argList' @ [94:24] ==> val argList: PsiElement defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getContainingCallExpression[LocalVariableDescriptor]

'parent' @ [94:32] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'call' @ [95:17] ==> val call: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getContainingCallExpression[LocalVariableDescriptor]

'call' @ [96:24] ==> val call: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.getContainingCallExpression[LocalVariableDescriptor]

'expression' @ [103:28] ==> value-parameter expression: KtExpressionWithLabel defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveControlLabel[ValueParameterDescriptorImpl]

'getTargetLabel' @ [103:39] ==> public final fun getTargetLabel(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.KtExpressionWithLabel[SimpleFunctionDescriptorImpl]

'checkReservedYield' @ [104:9] ==> public fun checkReservedYield(expression: KtSimpleNameExpression?, sink: DiagnosticSink): Unit defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'labelElement' @ [104:28] ==> val labelElement: KtSimpleNameExpression? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveControlLabel[LocalVariableDescriptor]

'context' @ [104:42] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveControlLabel[ValueParameterDescriptorImpl]

'trace' @ [104:50] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'expression' @ [106:25] ==> value-parameter expression: KtExpressionWithLabel defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveControlLabel[ValueParameterDescriptorImpl]

'getLabelNameAsName' @ [106:36] ==> public final fun getLabelNameAsName(): Name? defined in org.jetbrains.kotlin.psi.KtExpressionWithLabel[SimpleFunctionDescriptorImpl]

'labelElement' @ [107:13] ==> val labelElement: KtSimpleNameExpression? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveControlLabel[LocalVariableDescriptor]

'labelName' @ [107:37] ==> val labelName: Name? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveControlLabel[LocalVariableDescriptor]

'resolveNamedLabel' @ [109:16] ==> private final fun resolveNamedLabel(labelName: Name, labelExpression: KtSimpleNameExpression, trace: BindingTrace): KtElement? defined in org.jetbrains.kotlin.types.expressions.LabelResolver[SimpleFunctionDescriptorImpl]

'labelName' @ [109:34] ==> val labelName: Name? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveControlLabel[LocalVariableDescriptor]

'labelElement' @ [109:45] ==> val labelElement: KtSimpleNameExpression? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveControlLabel[LocalVariableDescriptor]

'context' @ [109:59] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveControlLabel[ValueParameterDescriptorImpl]

'trace' @ [109:67] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'run' @ [109:77] ==> @InlineOnly public inline fun <T, R> LabelResolver.run(block: LabelResolver.() -> Nothing?): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LabelResolver
    <R> -> Nothing?

'context' @ [110:13] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveControlLabel[ValueParameterDescriptorImpl]

'trace' @ [110:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'report' @ [110:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNRESOLVED_REFERENCE' @ [110:34] ==> public final val UNRESOLVED_REFERENCE: (DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>..DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [110:55] ==> @NotNull public open fun on(@NotNull element: KtReferenceExpression, @NotNull argument: KtReferenceExpression): ParametrizedDiagnostic<(KtReferenceExpression..KtReferenceExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'labelElement' @ [110:58] ==> val labelElement: KtSimpleNameExpression? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveControlLabel[LocalVariableDescriptor]

'labelElement' @ [110:72] ==> val labelElement: KtSimpleNameExpression? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveControlLabel[LocalVariableDescriptor]

'getElementsByLabelName' @ [120:20] ==> private final fun getElementsByLabelName(labelName: Name, labelExpression: KtSimpleNameExpression): Set<KtElement> defined in org.jetbrains.kotlin.types.expressions.LabelResolver[SimpleFunctionDescriptorImpl]

'labelName' @ [120:43] ==> value-parameter labelName: Name defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveNamedLabel[ValueParameterDescriptorImpl]

'labelExpression' @ [120:54] ==> value-parameter labelExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveNamedLabel[ValueParameterDescriptorImpl]

'list' @ [121:13] ==> val list: Set<KtElement> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveNamedLabel[LocalVariableDescriptor]

'isEmpty' @ [121:18] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'list' @ [123:13] ==> val list: Set<KtElement> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveNamedLabel[LocalVariableDescriptor]

'size' @ [123:18] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'trace' @ [124:13] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveNamedLabel[ValueParameterDescriptorImpl]

'report' @ [124:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'LABEL_NAME_CLASH' @ [124:26] ==> public final val LABEL_NAME_CLASH: (DiagnosticFactory0<(KtSimpleNameExpression..KtSimpleNameExpression?)>..DiagnosticFactory0<(KtSimpleNameExpression..KtSimpleNameExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [124:43] ==> @NotNull public open fun on(@NotNull element: KtSimpleNameExpression): SimpleDiagnostic<(KtSimpleNameExpression..KtSimpleNameExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'labelExpression' @ [124:46] ==> value-parameter labelExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveNamedLabel[ValueParameterDescriptorImpl]

'list' @ [127:16] ==> val list: Set<KtElement> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveNamedLabel[LocalVariableDescriptor]

'first' @ [127:21] ==> public fun <T> Iterable<KtElement>.first(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'also' @ [127:29] ==> @InlineOnly @SinceKotlin public inline fun <T> KtElement.also(block: (KtElement) -> Unit): KtElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'trace' @ [127:36] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveNamedLabel[ValueParameterDescriptorImpl]

'record' @ [127:42] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?), key: (KtReferenceExpression..KtReferenceExpression?), value: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> PsiElement

'LABEL_TARGET' @ [127:49] ==> public final val LABEL_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'labelExpression' @ [127:63] ==> value-parameter labelExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveNamedLabel[ValueParameterDescriptorImpl]

'it' @ [127:80] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveNamedLabel.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [135:35] ==> value-parameter expression: KtInstanceExpressionWithLabel defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'instanceReference' @ [135:46] ==> public final val KtInstanceExpressionWithLabel.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'expression' @ [136:27] ==> value-parameter expression: KtInstanceExpressionWithLabel defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'getTargetLabel' @ [136:38] ==> public final fun getTargetLabel(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.KtInstanceExpressionWithLabel[SimpleFunctionDescriptorImpl]

'error' @ [136:58] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'expression' @ [136:64] ==> value-parameter expression: KtInstanceExpressionWithLabel defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'context' @ [138:35] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'scope' @ [138:43] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'getDeclarationsByLabel' @ [138:49] ==> public fun LexicalScope.getDeclarationsByLabel(labelName: Name): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'labelName' @ [138:72] ==> value-parameter labelName: Name defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'declarationsByLabel' @ [139:20] ==> val declarationsByLabel: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'size' @ [139:40] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'when (size) {
            1 -> {
                val declarationDescriptor = declarationsByLabel.single()
                val thisReceiver = when (declarationDescriptor) {
                    is ClassDescriptor -> declarationDescriptor.thisAsReceiverParameter
                    is FunctionDescriptor -> declarationDescriptor.extensionReceiverParameter
                    is PropertyDescriptor -> declarationDescriptor.extensionReceiverParameter
                    else -> throw UnsupportedOperationException("Unsupported descriptor: " + declarationDescriptor) // TODO
                }

                val element = DescriptorToSourceUtils.descriptorToDeclaration(declarationDescriptor)
                              ?: error("No PSI element for descriptor: " + declarationDescriptor)
                context.trace.record(LABEL_TARGET, targetLabel, element)
                context.trace.record(REFERENCE_TARGET, referenceExpression, declarationDescriptor)

                if (declarationDescriptor is ClassDescriptor) {
                    if (!DescriptorResolver.checkHasOuterClassInstance(context.scope, context.trace, targetLabel, declarationDescriptor)) {
                        return LabeledReceiverResolutionResult.labelResolutionFailed()
                    }
                }

                return LabeledReceiverResolutionResult.labelResolutionSuccess(thisReceiver)
            }
            0 -> {
                val element = resolveNamedLabel(labelName, targetLabel, context.trace)
                val declarationDescriptor = context.trace.bindingContext[BindingContext.DECLARATION_TO_DESCRIPTOR, element]
                if (declarationDescriptor is FunctionDescriptor) {
                    val thisReceiver = declarationDescriptor.extensionReceiverParameter
                    if (thisReceiver != null) {
                        context.trace.record(LABEL_TARGET, targetLabel, element)
                        context.trace.record(REFERENCE_TARGET, referenceExpression, declarationDescriptor)
                    }
                    return LabeledReceiverResolutionResult.labelResolutionSuccess(thisReceiver)
                }
                else {
                    context.trace.report(UNRESOLVED_REFERENCE.on(targetLabel, targetLabel))
                }
            }
            else -> BindingContextUtils.reportAmbiguousLabel(context.trace, targetLabel, declarationsByLabel)
        }' @ [140:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'size' @ [140:15] ==> val size: Int defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'declarationsByLabel' @ [142:45] ==> val declarationsByLabel: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'single' @ [142:65] ==> public fun <T> Iterable<DeclarationDescriptor>.single(): DeclarationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'when (declarationDescriptor) {
                    is ClassDescriptor -> declarationDescriptor.thisAsReceiverParameter
                    is FunctionDescriptor -> declarationDescriptor.extensionReceiverParameter
                    is PropertyDescriptor -> declarationDescriptor.extensionReceiverParameter
                    else -> throw UnsupportedOperationException("Unsupported descriptor: " + declarationDescriptor) // TODO
                }' @ [143:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReceiverParameterDescriptor?, entry1: ReceiverParameterDescriptor?, entry2: ReceiverParameterDescriptor?, entry3: ReceiverParameterDescriptor?): ReceiverParameterDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReceiverParameterDescriptor?

'declarationDescriptor' @ [143:42] ==> val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'declarationDescriptor' @ [144:43] ==> val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [144:65] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'declarationDescriptor' @ [145:46] ==> val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'extensionReceiverParameter' @ [145:68] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'declarationDescriptor' @ [146:46] ==> val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'extensionReceiverParameter' @ [146:68] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'UnsupportedOperationException' @ [147:35] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'+' @ [147:65] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'declarationDescriptor' @ [147:94] ==> val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [150:31] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [150:55] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'declarationDescriptor' @ [150:79] ==> val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'error' @ [151:34] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [151:40] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'declarationDescriptor' @ [151:76] ==> val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'context' @ [152:17] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'trace' @ [152:25] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'record' @ [152:31] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?), key: (KtReferenceExpression..KtReferenceExpression?), value: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> PsiElement

'LABEL_TARGET' @ [152:38] ==> public final val LABEL_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'targetLabel' @ [152:52] ==> val targetLabel: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'element' @ [152:65] ==> val element: PsiElement defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'context' @ [153:17] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'trace' @ [153:25] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'record' @ [153:31] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?), value: (DeclarationDescriptor..DeclarationDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [153:38] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'referenceExpression' @ [153:56] ==> val referenceExpression: KtReferenceExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'declarationDescriptor' @ [153:77] ==> val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'declarationDescriptor' @ [155:21] ==> val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'!' @ [156:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkHasOuterClassInstance' @ [156:45] ==> public open fun checkHasOuterClassInstance(@NotNull scope: LexicalScope, @NotNull trace: BindingTrace, @NotNull reportErrorsOn: PsiElement, @NotNull target: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'context' @ [156:72] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'scope' @ [156:80] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'context' @ [156:87] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'trace' @ [156:95] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'targetLabel' @ [156:102] ==> val targetLabel: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'declarationDescriptor' @ [156:115] ==> val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'LabeledReceiverResolutionResult' @ [157:32] ==> public companion object defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult[FakeCallableDescriptorForObject]

'labelResolutionFailed' @ [157:64] ==> public final fun labelResolutionFailed(): LabelResolver.LabeledReceiverResolutionResult defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult.Companion[SimpleFunctionDescriptorImpl]

'LabeledReceiverResolutionResult' @ [161:24] ==> public companion object defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult[FakeCallableDescriptorForObject]

'labelResolutionSuccess' @ [161:56] ==> public final fun labelResolutionSuccess(receiverParameterDescriptor: ReceiverParameterDescriptor?): LabelResolver.LabeledReceiverResolutionResult defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult.Companion[SimpleFunctionDescriptorImpl]

'thisReceiver' @ [161:79] ==> val thisReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'resolveNamedLabel' @ [164:31] ==> private final fun resolveNamedLabel(labelName: Name, labelExpression: KtSimpleNameExpression, trace: BindingTrace): KtElement? defined in org.jetbrains.kotlin.types.expressions.LabelResolver[SimpleFunctionDescriptorImpl]

'labelName' @ [164:49] ==> value-parameter labelName: Name defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'targetLabel' @ [164:60] ==> val targetLabel: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'context' @ [164:73] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'trace' @ [164:81] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'context' @ [165:45] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'trace' @ [165:53] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'bindingContext' @ [165:59] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [165:89] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [165:116] ==> val element: KtElement? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'if (declarationDescriptor is FunctionDescriptor) {
                    val thisReceiver = declarationDescriptor.extensionReceiverParameter
                    if (thisReceiver != null) {
                        context.trace.record(LABEL_TARGET, targetLabel, element)
                        context.trace.record(REFERENCE_TARGET, referenceExpression, declarationDescriptor)
                    }
                    return LabeledReceiverResolutionResult.labelResolutionSuccess(thisReceiver)
                }
                else {
                    context.trace.report(UNRESOLVED_REFERENCE.on(targetLabel, targetLabel))
                }' @ [166:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declarationDescriptor' @ [166:21] ==> val declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'declarationDescriptor' @ [167:40] ==> val declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'extensionReceiverParameter' @ [167:62] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'thisReceiver' @ [168:25] ==> val thisReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'context' @ [169:25] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'trace' @ [169:33] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'record' @ [169:39] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?), key: (KtReferenceExpression..KtReferenceExpression?), value: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> PsiElement

'LABEL_TARGET' @ [169:46] ==> public final val LABEL_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'targetLabel' @ [169:60] ==> val targetLabel: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'element' @ [169:73] ==> val element: KtElement? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'context' @ [170:25] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'trace' @ [170:33] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'record' @ [170:39] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?), value: (DeclarationDescriptor..DeclarationDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [170:46] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'referenceExpression' @ [170:64] ==> val referenceExpression: KtReferenceExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'declarationDescriptor' @ [170:85] ==> val declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'LabeledReceiverResolutionResult' @ [172:28] ==> public companion object defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult[FakeCallableDescriptorForObject]

'labelResolutionSuccess' @ [172:60] ==> public final fun labelResolutionSuccess(receiverParameterDescriptor: ReceiverParameterDescriptor?): LabelResolver.LabeledReceiverResolutionResult defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult.Companion[SimpleFunctionDescriptorImpl]

'thisReceiver' @ [172:83] ==> val thisReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'context' @ [175:21] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'trace' @ [175:29] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'report' @ [175:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNRESOLVED_REFERENCE' @ [175:42] ==> public final val UNRESOLVED_REFERENCE: (DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>..DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [175:63] ==> @NotNull public open fun on(@NotNull element: KtReferenceExpression, @NotNull argument: KtReferenceExpression): ParametrizedDiagnostic<(KtReferenceExpression..KtReferenceExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'targetLabel' @ [175:66] ==> val targetLabel: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'targetLabel' @ [175:79] ==> val targetLabel: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'reportAmbiguousLabel' @ [178:41] ==> public open fun reportAmbiguousLabel(@NotNull trace: BindingTrace, @NotNull targetLabel: KtSimpleNameExpression, @NotNull declarationsByLabel: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>)): Unit defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'context' @ [178:62] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[ValueParameterDescriptorImpl]

'trace' @ [178:70] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'targetLabel' @ [178:77] ==> val targetLabel: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'declarationsByLabel' @ [178:90] ==> val declarationsByLabel: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.types.expressions.LabelResolver.resolveThisOrSuperLabel[LocalVariableDescriptor]

'LabeledReceiverResolutionResult' @ [180:16] ==> public companion object defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult[FakeCallableDescriptorForObject]

'labelResolutionFailed' @ [180:48] ==> public final fun labelResolutionFailed(): LabelResolver.LabeledReceiverResolutionResult defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult.Companion[SimpleFunctionDescriptorImpl]

'code' @ [194:20] ==> public final val code: LabelResolver.LabeledReceiverResolutionResult.Code defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult[PropertyDescriptorImpl]

'SUCCESS' @ [194:33] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult.Code[FakeCallableDescriptorForObject]

'assert' @ [198:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'success' @ [198:20] ==> public final fun success(): Boolean defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult[SimpleFunctionDescriptorImpl]

'+' @ [198:33] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'code' @ [198:99] ==> public final val code: LabelResolver.LabeledReceiverResolutionResult.Code defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult[PropertyDescriptorImpl]

'receiverParameterDescriptor' @ [199:20] ==> private final val receiverParameterDescriptor: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult[PropertyDescriptorImpl]

'receiverParameterDescriptor' @ [204:21] ==> value-parameter receiverParameterDescriptor: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult.Companion.labelResolutionSuccess[ValueParameterDescriptorImpl]

'LabeledReceiverResolutionResult' @ [205:28] ==> private constructor LabeledReceiverResolutionResult(code: LabelResolver.LabeledReceiverResolutionResult.Code, receiverParameterDescriptor: ReceiverParameterDescriptor?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult[ClassConstructorDescriptorImpl]

'NO_THIS' @ [205:65] ==> enum entry NO_THIS defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult.Code[FakeCallableDescriptorForObject]

'LabeledReceiverResolutionResult' @ [207:24] ==> private constructor LabeledReceiverResolutionResult(code: LabelResolver.LabeledReceiverResolutionResult.Code, receiverParameterDescriptor: ReceiverParameterDescriptor?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult[ClassConstructorDescriptorImpl]

'SUCCESS' @ [207:61] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult.Code[FakeCallableDescriptorForObject]

'receiverParameterDescriptor' @ [207:70] ==> value-parameter receiverParameterDescriptor: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult.Companion.labelResolutionSuccess[ValueParameterDescriptorImpl]

'LabeledReceiverResolutionResult' @ [211:24] ==> private constructor LabeledReceiverResolutionResult(code: LabelResolver.LabeledReceiverResolutionResult.Code, receiverParameterDescriptor: ReceiverParameterDescriptor?) defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult[ClassConstructorDescriptorImpl]

'LABEL_RESOLUTION_ERROR' @ [211:61] ==> enum entry LABEL_RESOLUTION_ERROR defined in org.jetbrains.kotlin.types.expressions.LabelResolver.LabeledReceiverResolutionResult.Code[FakeCallableDescriptorForObject]

