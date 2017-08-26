'JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'assert' @ [48:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'shouldBeInlined' @ [48:37] ==> public open fun shouldBeInlined(@NotNull descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.reference.CallExpressionTranslator[JavaMethodDescriptor]

'descriptor' @ [48:53] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'descriptor' @ [49:77] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'setOf' @ [52:26] ==> public fun <T> setOf(vararg elements: JsName): Set<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'context' @ [52:32] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'aliasedName' @ [52:40] ==> public fun TranslationContext.aliasedName(descriptor: CallableDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.utils in file inlineUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [52:52] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'context' @ [52:65] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'getInnerNameForDescriptor' @ [52:73] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [52:99] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'RecursiveJsVisitor' @ [54:28] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'super' @ [56:13] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitInvocation' @ [56:19] ==> public open fun visitInvocation(invocation: JsInvocation): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'invocation' @ [56:35] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata.<no name provided>.visitInvocation[ValueParameterDescriptorImpl]

'invocation' @ [58:17] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata.<no name provided>.visitInvocation[ValueParameterDescriptorImpl]

'name' @ [58:28] ==> public val JsExpression?.name: JsName? defined in org.jetbrains.kotlin.js.translate.utils in file inlineUtils.kt[PropertyDescriptorImpl]

'candidateNames' @ [58:36] ==> val candidateNames: Set<JsName> defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[LocalVariableDescriptor]

'invocation' @ [59:17] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata.<no name provided>.visitInvocation[ValueParameterDescriptorImpl]

'descriptor' @ [59:28] ==> public var JsInvocation.descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'descriptor' @ [59:41] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'invocation' @ [60:17] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata.<no name provided>.visitInvocation[ValueParameterDescriptorImpl]

'inlineStrategy' @ [60:28] ==> public var JsInvocation.inlineStrategy: InlineStrategy? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'IN_PLACE' @ [60:60] ==> enum entry IN_PLACE defined in org.jetbrains.kotlin.resolve.inline.InlineStrategy[FakeCallableDescriptorForObject]

'invocation' @ [61:17] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata.<no name provided>.visitInvocation[ValueParameterDescriptorImpl]

'psiElement' @ [61:28] ==> public var JsInvocation.psiElement: PsiElement? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'psiElement' @ [61:41] ==> value-parameter psiElement: KtExpression defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'visitor' @ [66:5] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[LocalVariableDescriptor]

'accept' @ [66:13] ==> public open fun <T : JsNode?> accept(node: JsExpression): Unit defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsExpression

'expression' @ [66:20] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'context' @ [68:5] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'addInlineCall' @ [68:13] ==> public open fun addInlineCall(@NotNull descriptor: CallableDescriptor): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [68:27] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'setInlineCallMetadata' @ [76:5] ==> public fun setInlineCallMetadata(expression: JsExpression, psiElement: KtExpression, descriptor: CallableDescriptor, context: TranslationContext): Unit defined in org.jetbrains.kotlin.js.translate.utils in file inlineUtils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [76:27] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'psiElement' @ [76:39] ==> value-parameter psiElement: KtExpression defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'getFunctionDescriptor' @ [76:60] ==> @NotNull public open fun getFunctionDescriptor(resolvedCall: (ResolvedCall<*>..ResolvedCall<*>?)): CallableDescriptor defined in org.jetbrains.kotlin.js.translate.utils.PsiUtils[JavaMethodDescriptor]

'resolvedCall' @ [76:82] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'context' @ [76:97] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'nameRef' @ [84:5] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'descriptor' @ [84:13] ==> public var JsNameRef.descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'descriptor' @ [84:26] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'nameRef' @ [85:5] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'inlineStrategy' @ [85:13] ==> public var JsNameRef.inlineStrategy: InlineStrategy? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'IN_PLACE' @ [85:45] ==> enum entry IN_PLACE defined in org.jetbrains.kotlin.resolve.inline.InlineStrategy[FakeCallableDescriptorForObject]

'nameRef' @ [86:5] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'psiElement' @ [86:13] ==> public var JsNameRef.psiElement: PsiElement? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'psiElement' @ [86:26] ==> value-parameter psiElement: KtExpression defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'context' @ [88:5] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'addInlineCall' @ [88:13] ==> public open fun addInlineCall(@NotNull descriptor: CallableDescriptor): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [88:27] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.utils.setInlineCallMetadata[ValueParameterDescriptorImpl]

'getAliasForDescriptor' @ [92:17] ==> @Nullable public open fun getAliasForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsExpression? defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [92:39] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.utils.aliasedName[ValueParameterDescriptorImpl]

'alias' @ [93:22] ==> val alias: JsExpression? defined in org.jetbrains.kotlin.js.translate.utils.aliasedName[LocalVariableDescriptor]

'name' @ [93:44] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'aliasName' @ [95:12] ==> val aliasName: JsName? defined in org.jetbrains.kotlin.js.translate.utils.aliasedName[LocalVariableDescriptor]

'getNameForDescriptor' @ [95:25] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [95:46] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.utils.aliasedName[ValueParameterDescriptorImpl]

'when (this) {
        is JsInvocation -> {
            val qualifier = this.qualifier

            when {
                isCallInvocation(this) -> (qualifier as JsNameRef).qualifier.name
                else -> qualifier.name
            }
        }
        is JsNameRef -> this.name
        else -> null
    }' @ [99:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsName?, entry1: JsName?, entry2: JsName?): JsName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsName?

'this' @ [99:19] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.name[ReceiverParameterDescriptorImpl]

'this' @ [101:29] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.name[ReceiverParameterDescriptorImpl]

'qualifier' @ [101:34] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'when {
                isCallInvocation(this) -> (qualifier as JsNameRef).qualifier.name
                else -> qualifier.name
            }' @ [103:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsName?, entry1: JsName?): JsName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsName?

'isCallInvocation' @ [104:17] ==> public fun isCallInvocation(invocation: JsInvocation): Boolean defined in org.jetbrains.kotlin.js.inline.util in file invocationUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [104:34] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.name[ReceiverParameterDescriptorImpl]

'qualifier' @ [104:44] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.<get-name>[LocalVariableDescriptor]

'qualifier' @ [104:68] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'name' @ [104:78] ==> public val JsExpression?.name: JsName? defined in org.jetbrains.kotlin.js.translate.utils in file inlineUtils.kt[PropertyDescriptorImpl]

'qualifier' @ [105:25] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.<get-name>[LocalVariableDescriptor]

'name' @ [105:35] ==> public val JsExpression?.name: JsName? defined in org.jetbrains.kotlin.js.translate.utils in file inlineUtils.kt[PropertyDescriptorImpl]

'this' @ [108:25] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.name[ReceiverParameterDescriptorImpl]

'name' @ [108:30] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

