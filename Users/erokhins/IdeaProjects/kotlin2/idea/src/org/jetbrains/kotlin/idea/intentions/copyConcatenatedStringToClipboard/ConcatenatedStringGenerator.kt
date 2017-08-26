'element' @ [28:32] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.create[ValueParameterDescriptorImpl]

'getTopmostParentOfType' @ [28:40] ==> public inline fun <reified T : PsiElement> PsiElement.getTopmostParentOfType(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtBinaryExpression

'element' @ [28:89] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.create[ValueParameterDescriptorImpl]

'StringBuilder' @ [29:29] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'binaryExpression' @ [30:9] ==> val binaryExpression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.create[LocalVariableDescriptor]

'appendTo' @ [30:26] ==> private final fun KtBinaryExpression.appendTo(sb: StringBuilder /* = StringBuilder */): Unit defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator[SimpleFunctionDescriptorImpl]

'stringBuilder' @ [30:35] ==> val stringBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.create[LocalVariableDescriptor]

'stringBuilder' @ [31:16] ==> val stringBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.create[LocalVariableDescriptor]

'toString' @ [31:30] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'left' @ [35:9] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'appendTo' @ [35:15] ==> private final fun KtExpression.appendTo(sb: StringBuilder /* = StringBuilder */): Unit defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator[SimpleFunctionDescriptorImpl]

'sb' @ [35:24] ==> value-parameter sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo[ValueParameterDescriptorImpl]

'right' @ [36:9] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'appendTo' @ [36:16] ==> private final fun KtExpression.appendTo(sb: StringBuilder /* = StringBuilder */): Unit defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator[SimpleFunctionDescriptorImpl]

'sb' @ [36:25] ==> value-parameter sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo[ValueParameterDescriptorImpl]

'when (this) {
            is KtBinaryExpression -> this.appendTo(sb)
            is KtConstantExpression -> sb.append(text)
            is KtStringTemplateExpression -> this.appendTo(sb)
            else -> sb.append(convertToValueIfCompileTimeConstant() ?: "?")
        }' @ [40:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Any..Any?), entry1: (Any..Any?), entry2: (Any..Any?), entry3: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'this' @ [40:15] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo[ReceiverParameterDescriptorImpl]

'this' @ [41:38] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo[ReceiverParameterDescriptorImpl]

'appendTo' @ [41:43] ==> private final fun KtBinaryExpression.appendTo(sb: StringBuilder /* = StringBuilder */): Unit defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator[SimpleFunctionDescriptorImpl]

'sb' @ [41:52] ==> value-parameter sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo[ValueParameterDescriptorImpl]

'sb' @ [42:40] ==> value-parameter sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo[ValueParameterDescriptorImpl]

'append' @ [42:43] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'text' @ [42:50] ==> public final val KtConstantExpression.text: (String..String?)[MyPropertyDescriptor]

'this' @ [43:46] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo[ReceiverParameterDescriptorImpl]

'appendTo' @ [43:51] ==> private final fun KtStringTemplateExpression.appendTo(sb: StringBuilder /* = StringBuilder */): Unit defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator[SimpleFunctionDescriptorImpl]

'sb' @ [43:60] ==> value-parameter sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo[ValueParameterDescriptorImpl]

'sb' @ [44:21] ==> value-parameter sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo[ValueParameterDescriptorImpl]

'append' @ [44:24] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'convertToValueIfCompileTimeConstant' @ [44:31] ==> private final fun KtExpression.convertToValueIfCompileTimeConstant(): String? defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator[SimpleFunctionDescriptorImpl]

'collectDescendantsOfType' @ [49:9] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtStringTemplateEntry) -> Boolean = ...): List<KtStringTemplateEntry> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtStringTemplateEntry

'forEach' @ [49:59] ==> @HidesMembers public inline fun <T> Iterable<KtStringTemplateEntry>.forEach(action: (KtStringTemplateEntry) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtStringTemplateEntry

'when (stringTemplate) {
                is KtLiteralStringTemplateEntry -> sb.append(stringTemplate.text)
                is KtEscapeStringTemplateEntry -> sb.append(stringTemplate.unescapedValue)
                else -> sb.append(stringTemplate.expression?.convertToValueIfCompileTimeConstant() ?: "?")
            }' @ [51:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (StringBuilder..StringBuilder?), entry1: (StringBuilder..StringBuilder?), entry2: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'stringTemplate' @ [51:19] ==> value-parameter stringTemplate: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo.<anonymous>[ValueParameterDescriptorImpl]

'sb' @ [52:52] ==> value-parameter sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo[ValueParameterDescriptorImpl]

'append' @ [52:55] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'stringTemplate' @ [52:62] ==> value-parameter stringTemplate: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [52:77] ==> public final val KtLiteralStringTemplateEntry.text: (String..String?)[MyPropertyDescriptor]

'sb' @ [53:51] ==> value-parameter sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo[ValueParameterDescriptorImpl]

'append' @ [53:54] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'stringTemplate' @ [53:61] ==> value-parameter stringTemplate: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo.<anonymous>[ValueParameterDescriptorImpl]

'unescapedValue' @ [53:76] ==> public final val KtEscapeStringTemplateEntry.unescapedValue: (String..String?)[MyPropertyDescriptor]

'sb' @ [54:25] ==> value-parameter sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo[ValueParameterDescriptorImpl]

'append' @ [54:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'stringTemplate' @ [54:35] ==> value-parameter stringTemplate: KtStringTemplateEntry defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.appendTo.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [54:50] ==> public final val KtStringTemplateEntry.expression: KtExpression?[MyPropertyDescriptor]

'convertToValueIfCompileTimeConstant' @ [54:62] ==> private final fun KtExpression.convertToValueIfCompileTimeConstant(): String? defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator[SimpleFunctionDescriptorImpl]

'getResolvedCall' @ [60:28] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'analyze' @ [60:44] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [61:34] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.convertToValueIfCompileTimeConstant[LocalVariableDescriptor]

'resultingDescriptor' @ [61:47] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'propertyDescriptor' @ [62:16] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.intentions.copyConcatenatedStringToClipboard.ConcatenatedStringGenerator.convertToValueIfCompileTimeConstant[LocalVariableDescriptor]

'compileTimeInitializer' @ [62:35] ==> public final val PropertyDescriptor.compileTimeInitializer: ConstantValue<*>?[MyPropertyDescriptor]

'value' @ [62:59] ==> public open val value: Any? defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[DeserializedPropertyDescriptor]

'toString' @ [62:66] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

