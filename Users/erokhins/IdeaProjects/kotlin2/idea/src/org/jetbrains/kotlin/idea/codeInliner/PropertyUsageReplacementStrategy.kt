'readReplacement' @ [25:43] ==> value-parameter readReplacement: CodeToInline? defined in org.jetbrains.kotlin.idea.codeInliner.PropertyUsageReplacementStrategy.<init>[ValueParameterDescriptorImpl]

'let' @ [25:60] ==> @InlineOnly public inline fun <T, R> CodeToInline.let(block: (CodeToInline) -> CallableUsageReplacementStrategy): CallableUsageReplacementStrategy defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CodeToInline
    <R> -> CallableUsageReplacementStrategy

'CallableUsageReplacementStrategy' @ [25:66] ==> public constructor CallableUsageReplacementStrategy(replacement: CodeToInline) defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy[ClassConstructorDescriptorImpl]

'it' @ [25:99] ==> value-parameter it: CodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.PropertyUsageReplacementStrategy.readReplacementStrategy.<anonymous>[ValueParameterDescriptorImpl]

'writeReplacement' @ [26:44] ==> value-parameter writeReplacement: CodeToInline? defined in org.jetbrains.kotlin.idea.codeInliner.PropertyUsageReplacementStrategy.<init>[ValueParameterDescriptorImpl]

'let' @ [26:62] ==> @InlineOnly public inline fun <T, R> CodeToInline.let(block: (CodeToInline) -> CallableUsageReplacementStrategy): CallableUsageReplacementStrategy defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CodeToInline
    <R> -> CallableUsageReplacementStrategy

'CallableUsageReplacementStrategy' @ [26:68] ==> public constructor CallableUsageReplacementStrategy(replacement: CodeToInline) defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy[ClassConstructorDescriptorImpl]

'it' @ [26:101] ==> value-parameter it: CodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.PropertyUsageReplacementStrategy.writeReplacementStrategy.<anonymous>[ValueParameterDescriptorImpl]

'usage' @ [29:22] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.PropertyUsageReplacementStrategy.createReplacer[ValueParameterDescriptorImpl]

'readWriteAccess' @ [29:28] ==> public fun KtExpression.readWriteAccess(useResolveForReadWrite: Boolean): ReferenceAccess defined in org.jetbrains.kotlin.idea.references[DeserializedSimpleFunctionDescriptor]

'when (access) {
            ReferenceAccess.READ -> readReplacementStrategy?.createReplacer(usage)
            ReferenceAccess.WRITE -> writeReplacementStrategy?.createReplacer(usage)
            ReferenceAccess.READ_WRITE -> null
        }' @ [30:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (() -> KtElement?)?, entry1: (() -> KtElement?)?, entry2: (() -> KtElement?)?): (() -> KtElement?)?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Function0<KtElement?>?

'access' @ [30:22] ==> val access: ReferenceAccess defined in org.jetbrains.kotlin.idea.codeInliner.PropertyUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'READ' @ [31:29] ==> enum entry READ defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'readReplacementStrategy' @ [31:37] ==> private final val readReplacementStrategy: CallableUsageReplacementStrategy? defined in org.jetbrains.kotlin.idea.codeInliner.PropertyUsageReplacementStrategy[PropertyDescriptorImpl]

'createReplacer' @ [31:62] ==> public open fun createReplacer(usage: KtSimpleNameExpression): (() -> KtElement?)? defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy[SimpleFunctionDescriptorImpl]

'usage' @ [31:77] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.PropertyUsageReplacementStrategy.createReplacer[ValueParameterDescriptorImpl]

'WRITE' @ [32:29] ==> enum entry WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'writeReplacementStrategy' @ [32:38] ==> private final val writeReplacementStrategy: CallableUsageReplacementStrategy? defined in org.jetbrains.kotlin.idea.codeInliner.PropertyUsageReplacementStrategy[PropertyDescriptorImpl]

'createReplacer' @ [32:64] ==> public open fun createReplacer(usage: KtSimpleNameExpression): (() -> KtElement?)? defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy[SimpleFunctionDescriptorImpl]

'usage' @ [32:79] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.PropertyUsageReplacementStrategy.createReplacer[ValueParameterDescriptorImpl]

'READ_WRITE' @ [33:29] ==> enum entry READ_WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

