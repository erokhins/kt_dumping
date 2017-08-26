'processings' @ [43:13] ==> public final val processings: Map<PsiElement, Collection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter[PropertyDescriptorImpl]

'isEmpty' @ [43:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'when (expression) {
            is PsiReferenceExpression -> {
                val target = expression.resolve() as? PsiVariable ?: return null
                val forTarget = processings[target] ?: return null
                for (processing in forTarget) {
                    val converted = processing.convertedCodeProcessor?.convertVariableUsage(expression, codeConverter)
                    if (converted != null) return converted
                }
                return null
            }

            is PsiMethodCallExpression -> {
                val target = expression.methodExpression.resolve() as? PsiMethod ?: return null
                val forTarget = processings[target] ?: return null
                for (processing in forTarget) {
                    val converted = processing.convertedCodeProcessor?.convertMethodUsage(expression, codeConverter)
                    if (converted != null) return converted
                }
                return null
            }

            else -> return null
        }' @ [45:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'expression' @ [45:15] ==> value-parameter expression: PsiExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[ValueParameterDescriptorImpl]

'expression' @ [47:30] ==> value-parameter expression: PsiExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[ValueParameterDescriptorImpl]

'resolve' @ [47:41] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'processings' @ [48:33] ==> public final val processings: Map<PsiElement, Collection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter[PropertyDescriptorImpl]

'target' @ [48:45] ==> val target: PsiVariable defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[LocalVariableDescriptor]

'forTarget' @ [49:36] ==> val forTarget: Collection<UsageProcessing> defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[LocalVariableDescriptor]

'processing' @ [50:37] ==> val processing: UsageProcessing defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[LocalVariableDescriptor]

'convertedCodeProcessor' @ [50:48] ==> public abstract val convertedCodeProcessor: ConvertedCodeProcessor? defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessing[PropertyDescriptorImpl]

'convertVariableUsage' @ [50:72] ==> public open fun convertVariableUsage(expression: PsiReferenceExpression, codeConverter: CodeConverter): Expression? defined in org.jetbrains.kotlin.j2k.usageProcessing.ConvertedCodeProcessor[SimpleFunctionDescriptorImpl]

'expression' @ [50:93] ==> value-parameter expression: PsiExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[ValueParameterDescriptorImpl]

'codeConverter' @ [50:105] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[ValueParameterDescriptorImpl]

'converted' @ [51:25] ==> val converted: Expression? defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[LocalVariableDescriptor]

'converted' @ [51:51] ==> val converted: Expression? defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[LocalVariableDescriptor]

'expression' @ [57:30] ==> value-parameter expression: PsiExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[ValueParameterDescriptorImpl]

'methodExpression' @ [57:41] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'resolve' @ [57:58] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'processings' @ [58:33] ==> public final val processings: Map<PsiElement, Collection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter[PropertyDescriptorImpl]

'target' @ [58:45] ==> val target: PsiMethod defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[LocalVariableDescriptor]

'forTarget' @ [59:36] ==> val forTarget: Collection<UsageProcessing> defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[LocalVariableDescriptor]

'processing' @ [60:37] ==> val processing: UsageProcessing defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[LocalVariableDescriptor]

'convertedCodeProcessor' @ [60:48] ==> public abstract val convertedCodeProcessor: ConvertedCodeProcessor? defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessing[PropertyDescriptorImpl]

'convertMethodUsage' @ [60:72] ==> public open fun convertMethodUsage(methodCall: PsiMethodCallExpression, codeConverter: CodeConverter): Expression? defined in org.jetbrains.kotlin.j2k.usageProcessing.ConvertedCodeProcessor[SimpleFunctionDescriptorImpl]

'expression' @ [60:91] ==> value-parameter expression: PsiExpression defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[ValueParameterDescriptorImpl]

'codeConverter' @ [60:103] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[ValueParameterDescriptorImpl]

'converted' @ [61:25] ==> val converted: Expression? defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[LocalVariableDescriptor]

'converted' @ [61:51] ==> val converted: Expression? defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter.convertExpression[LocalVariableDescriptor]

