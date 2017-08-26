'DeprecatedSymbolUsageFixBase' @ [36:5] ==> public constructor DeprecatedSymbolUsageFixBase(element: KtSimpleNameExpression, replaceWith: ReplaceWith) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase[ClassConstructorDescriptorImpl]

'element' @ [36:34] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.<init>[ValueParameterDescriptorImpl]

'replaceWith' @ [36:43] ==> value-parameter replaceWith: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.<init>[ValueParameterDescriptorImpl]

'replaceWith' @ [40:47] ==> public final val replaceWith: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix[PropertyDescriptorImpl]

'pattern' @ [40:59] ==> public final val pattern: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWith[PropertyDescriptorImpl]

'element' @ [43:23] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix[PropertyDescriptorImpl]

'replacementStrategy' @ [44:22] ==> value-parameter replacementStrategy: UsageReplacementStrategy defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.invoke[ValueParameterDescriptorImpl]

'createReplacer' @ [44:42] ==> public abstract fun createReplacer(usage: KtSimpleNameExpression): (() -> KtElement?)? defined in org.jetbrains.kotlin.idea.codeInliner.UsageReplacementStrategy[SimpleFunctionDescriptorImpl]

'element' @ [44:57] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.invoke[LocalVariableDescriptor]

'invoke' @ [44:68] ==> public abstract operator fun invoke(): KtElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'result' @ [45:13] ==> val result: KtElement? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.invoke[LocalVariableDescriptor]

'result' @ [46:27] ==> val result: KtElement? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.invoke[LocalVariableDescriptor]

'getCalleeExpressionIfAny' @ [46:34] ==> public fun KtElement?.getCalleeExpressionIfAny(): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'result' @ [46:64] ==> val result: KtElement? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.invoke[LocalVariableDescriptor]

'textOffset' @ [46:72] ==> public final val KtElement.textOffset: Int[MyPropertyDescriptor]

'editor' @ [47:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.invoke[ValueParameterDescriptorImpl]

'moveCaret' @ [47:21] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'offset' @ [47:31] ==> val offset: Int defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [51:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'component1' @ [53:18] ==> public final operator fun component1(): KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.Data[SimpleFunctionDescriptorImpl]

'component2' @ [53:34] ==> public final operator fun component2(): ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.Data[SimpleFunctionDescriptorImpl]

'?:' @ [53:49] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: DeprecatedSymbolUsageFixBase.Companion.Data?, right: DeprecatedSymbolUsageFixBase.Companion.Data): DeprecatedSymbolUsageFixBase.Companion.Data[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Data

'extractDataFromDiagnostic' @ [53:78] ==> public final fun extractDataFromDiagnostic(deprecatedDiagnostic: Diagnostic): DeprecatedSymbolUsageFixBase.Companion.Data? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [53:104] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.Companion.createAction[ValueParameterDescriptorImpl]

'DeprecatedSymbolUsageFix' @ [54:20] ==> public constructor DeprecatedSymbolUsageFix(element: KtSimpleNameExpression, replaceWith: ReplaceWith) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix[ClassConstructorDescriptorImpl]

'nameExpression' @ [54:45] ==> val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.Companion.createAction[LocalVariableDescriptor]

'replacement' @ [54:61] ==> val replacement: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.Companion.createAction[LocalVariableDescriptor]

'!' @ [58:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'import' @ [58:21] ==> value-parameter import: KtImportDirective defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.Companion.isImportToBeRemoved[ValueParameterDescriptorImpl]

'isAllUnder' @ [58:28] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'import' @ [59:23] ==> value-parameter import: KtImportDirective defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.Companion.isImportToBeRemoved[ValueParameterDescriptorImpl]

'targetDescriptors' @ [59:30] ==> public fun KtImportDirective.targetDescriptors(resolutionFacade: ResolutionFacade = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'all' @ [59:50] ==> public inline fun <T> Iterable<DeclarationDescriptor>.all(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'DeprecatedSymbolUsageFixBase' @ [59:56] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase[FakeCallableDescriptorForObject]

'fetchReplaceWithPattern' @ [59:85] ==> public final fun fetchReplaceWithPattern(descriptor: DeclarationDescriptor, project: Project): ReplaceWith? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion[SimpleFunctionDescriptorImpl]

'it' @ [59:109] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.Companion.isImportToBeRemoved.<anonymous>[ValueParameterDescriptorImpl]

'import' @ [59:113] ==> value-parameter import: KtImportDirective defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFix.Companion.isImportToBeRemoved[ValueParameterDescriptorImpl]

'project' @ [59:120] ==> public final val KtImportDirective.project: Project[MyPropertyDescriptor]

