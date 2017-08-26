'KotlinQuickFixAction<KtSimpleNameExpression>' @ [59:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtSimpleNameExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtSimpleNameExpression

'element' @ [59:50] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.<init>[ValueParameterDescriptorImpl]

'element' @ [62:23] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase[PropertyDescriptorImpl]

'!' @ [63:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'super' @ [63:14] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [63:20] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [63:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [63:41] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.isAvailable[ValueParameterDescriptorImpl]

'file' @ [63:49] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.isAvailable[ValueParameterDescriptorImpl]

'buildUsageReplacementStrategy' @ [64:24] ==> private final fun buildUsageReplacementStrategy(element: KtSimpleNameExpression, replaceWith: ReplaceWith, recheckAnnotation: Boolean, editor: Editor? = ...): UsageReplacementStrategy? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion[SimpleFunctionDescriptorImpl]

'element' @ [64:54] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.isAvailable[LocalVariableDescriptor]

'replaceWith' @ [64:63] ==> public final val replaceWith: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase[PropertyDescriptorImpl]

'strategy' @ [65:16] ==> val strategy: UsageReplacementStrategy? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.isAvailable[LocalVariableDescriptor]

'createReplacer' @ [65:26] ==> public abstract fun createReplacer(usage: KtSimpleNameExpression): (() -> KtElement?)? defined in org.jetbrains.kotlin.idea.codeInliner.UsageReplacementStrategy[SimpleFunctionDescriptorImpl]

'element' @ [65:41] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.isAvailable[LocalVariableDescriptor]

'element' @ [69:23] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase[PropertyDescriptorImpl]

'buildUsageReplacementStrategy' @ [70:24] ==> private final fun buildUsageReplacementStrategy(element: KtSimpleNameExpression, replaceWith: ReplaceWith, recheckAnnotation: Boolean, editor: Editor? = ...): UsageReplacementStrategy? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion[SimpleFunctionDescriptorImpl]

'element' @ [70:54] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.invoke[LocalVariableDescriptor]

'replaceWith' @ [70:63] ==> public final val replaceWith: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase[PropertyDescriptorImpl]

'editor' @ [70:112] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.invoke[ValueParameterDescriptorImpl]

'invoke' @ [71:9] ==> protected abstract fun invoke(replacementStrategy: UsageReplacementStrategy, project: Project, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase[SimpleFunctionDescriptorImpl]

'strategy' @ [71:16] ==> val strategy: UsageReplacementStrategy defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.invoke[LocalVariableDescriptor]

'project' @ [71:26] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.invoke[ValueParameterDescriptorImpl]

'editor' @ [71:35] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.invoke[ValueParameterDescriptorImpl]

'descriptor' @ [81:30] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern[ValueParameterDescriptorImpl]

'annotations' @ [81:41] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedPropertyDescriptor]

'findAnnotation' @ [81:53] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'FQ_NAMES' @ [81:83] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'deprecated' @ [81:92] ==> public final val deprecated: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'annotation' @ [82:36] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern[LocalVariableDescriptor]

'argumentValue' @ [82:47] ==> public fun AnnotationDescriptor.argumentValue(parameterName: String): Any? defined in org.jetbrains.kotlin.resolve.annotations[DeserializedSimpleFunctionDescriptor]

'Deprecated' @ [82:68] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'replaceWith' @ [82:80] ==> public final val replaceWith: ReplaceWith defined in kotlin.Deprecated[DeserializedPropertyDescriptor]

'name' @ [82:92] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'replaceWithValue' @ [83:27] ==> val replaceWithValue: AnnotationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern[LocalVariableDescriptor]

'argumentValue' @ [83:44] ==> public fun AnnotationDescriptor.argumentValue(parameterName: String): Any? defined in org.jetbrains.kotlin.resolve.annotations[DeserializedSimpleFunctionDescriptor]

'ReplaceWith' @ [83:65] ==> public constructor ReplaceWith(expression: String, vararg imports: String) defined in kotlin.ReplaceWith[DeserializedClassConstructorDescriptor]

'expression' @ [83:78] ==> public final val expression: String defined in kotlin.ReplaceWith[DeserializedPropertyDescriptor]

'name' @ [83:89] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'pattern' @ [84:17] ==> val pattern: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern[LocalVariableDescriptor]

'isEmpty' @ [84:25] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replaceWithValue' @ [85:32] ==> val replaceWithValue: AnnotationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern[LocalVariableDescriptor]

'argumentValue' @ [85:49] ==> public fun AnnotationDescriptor.argumentValue(parameterName: String): Any? defined in org.jetbrains.kotlin.resolve.annotations[DeserializedSimpleFunctionDescriptor]

'ReplaceWith' @ [85:70] ==> public constructor ReplaceWith(expression: String, vararg imports: String) defined in kotlin.ReplaceWith[DeserializedClassConstructorDescriptor]

'imports' @ [85:83] ==> public final val imports: Array<out String> defined in kotlin.ReplaceWith[DeserializedPropertyDescriptor]

'name' @ [85:91] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'importValues' @ [86:17] ==> val importValues: List<*> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern[LocalVariableDescriptor]

'any' @ [86:30] ==> public inline fun <T> Iterable<Any?>.any(predicate: (Any?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'it' @ [86:36] ==> value-parameter it: Any? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern.<anonymous>[ValueParameterDescriptorImpl]

'importValues' @ [87:27] ==> val importValues: List<*> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern[LocalVariableDescriptor]

'map' @ [87:40] ==> public inline fun <T, R> Iterable<Any?>.map(transform: (Any?) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?
    <R> -> String

'it' @ [87:47] ==> value-parameter it: Any? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [87:66] ==> public open val value: String defined in org.jetbrains.kotlin.resolve.constants.StringValue[DeserializedPropertyDescriptor]

'descriptor' @ [90:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern[ValueParameterDescriptorImpl]

'descriptor' @ [91:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern[ValueParameterDescriptorImpl]

'valueParameters' @ [91:28] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'any' @ [91:44] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.any(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [91:50] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern.<anonymous>[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [91:53] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'OptionalParametersHelper' @ [91:74] ==> public object OptionalParametersHelper defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'defaultParameterValue' @ [91:99] ==> public final fun defaultParameterValue(parameter: ValueParameterDescriptor, project: Project): OptionalParametersHelper.DefaultValue? defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper[DeserializedSimpleFunctionDescriptor]

'it' @ [91:121] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [91:125] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern[ValueParameterDescriptorImpl]

'ReplaceWith' @ [93:20] ==> public constructor ReplaceWith(pattern: String, imports: List<String>) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWith[ClassConstructorDescriptorImpl]

'pattern' @ [93:32] ==> val pattern: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern[LocalVariableDescriptor]

'imports' @ [93:41] ==> val imports: List<String> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.fetchReplaceWithPattern[LocalVariableDescriptor]

'deprecatedDiagnostic' @ [103:30] ==> value-parameter deprecatedDiagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[ValueParameterDescriptorImpl]

'psiElement' @ [103:51] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'when (psiElement) {
                is KtSimpleNameExpression -> psiElement
                is KtConstructorCalleeExpression -> psiElement.constructorReferenceExpression
                else -> null
            }' @ [113:58] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtSimpleNameExpression?, entry1: KtSimpleNameExpression?, entry2: KtSimpleNameExpression?): KtSimpleNameExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtSimpleNameExpression?

'psiElement' @ [113:64] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[LocalVariableDescriptor]

'psiElement' @ [114:46] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[LocalVariableDescriptor]

'psiElement' @ [115:53] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[LocalVariableDescriptor]

'constructorReferenceExpression' @ [115:64] ==> public final val KtConstructorCalleeExpression.constructorReferenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'when (deprecatedDiagnostic.factory) {
                Errors.DEPRECATION -> DiagnosticFactory.cast(deprecatedDiagnostic, Errors.DEPRECATION).a
                Errors.DEPRECATION_ERROR -> DiagnosticFactory.cast(deprecatedDiagnostic, Errors.DEPRECATION_ERROR).a
                Errors.TYPEALIAS_EXPANSION_DEPRECATION ->
                    DiagnosticFactory.cast(deprecatedDiagnostic, Errors.TYPEALIAS_EXPANSION_DEPRECATION).b
                Errors.TYPEALIAS_EXPANSION_DEPRECATION_ERROR ->
                    DiagnosticFactory.cast(deprecatedDiagnostic, Errors.TYPEALIAS_EXPANSION_DEPRECATION_ERROR).b
                else -> throw IllegalStateException("Bad QuickFixRegistrar configuration")
            }' @ [119:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor, entry1: DeclarationDescriptor, entry2: DeclarationDescriptor, entry3: DeclarationDescriptor, entry4: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor

'deprecatedDiagnostic' @ [119:36] ==> value-parameter deprecatedDiagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[ValueParameterDescriptorImpl]

'factory' @ [119:57] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'DEPRECATION' @ [120:24] ==> public final val DEPRECATION: (DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [120:57] ==> @NotNull public open fun <D : (Diagnostic..Diagnostic?)> cast(@NotNull p0: Diagnostic, @NotNull vararg p1: (DiagnosticFactory<out (DiagnosticWithParameters2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticWithParameters2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?)>..DiagnosticFactory<out (DiagnosticWithParameters2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticWithParameters2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?)>?)): DiagnosticWithParameters2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory[JavaMethodDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> (org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters2<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?), (kotlin.String..kotlin.String?)>..org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters2<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?), (kotlin.String..kotlin.String?)>?)

'deprecatedDiagnostic' @ [120:62] ==> value-parameter deprecatedDiagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[ValueParameterDescriptorImpl]

'DEPRECATION' @ [120:91] ==> public final val DEPRECATION: (DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'a' @ [120:104] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>.a: DeclarationDescriptor[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)
    <B : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'DEPRECATION_ERROR' @ [121:24] ==> public final val DEPRECATION_ERROR: (DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [121:63] ==> @NotNull public open fun <D : (Diagnostic..Diagnostic?)> cast(@NotNull p0: Diagnostic, @NotNull vararg p1: (DiagnosticFactory<out (DiagnosticWithParameters2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticWithParameters2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?)>..DiagnosticFactory<out (DiagnosticWithParameters2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticWithParameters2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?)>?)): DiagnosticWithParameters2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory[JavaMethodDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> (org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters2<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?), (kotlin.String..kotlin.String?)>..org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters2<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?), (kotlin.String..kotlin.String?)>?)

'deprecatedDiagnostic' @ [121:68] ==> value-parameter deprecatedDiagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[ValueParameterDescriptorImpl]

'DEPRECATION_ERROR' @ [121:97] ==> public final val DEPRECATION_ERROR: (DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'a' @ [121:116] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>.a: DeclarationDescriptor[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)
    <B : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'TYPEALIAS_EXPANSION_DEPRECATION' @ [122:24] ==> public final val TYPEALIAS_EXPANSION_DEPRECATION: (DiagnosticFactory3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [123:39] ==> @NotNull public open fun <D : (Diagnostic..Diagnostic?)> cast(@NotNull p0: Diagnostic, @NotNull vararg p1: (DiagnosticFactory<out (DiagnosticWithParameters3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticWithParameters3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?)>..DiagnosticFactory<out (DiagnosticWithParameters3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticWithParameters3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?)>?)): DiagnosticWithParameters3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory[JavaMethodDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> (org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters3<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.descriptors.TypeAliasDescriptor..org.jetbrains.kotlin.descriptors.TypeAliasDescriptor?), (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?), (kotlin.String..kotlin.String?)>..org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters3<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.descriptors.TypeAliasDescriptor..org.jetbrains.kotlin.descriptors.TypeAliasDescriptor?), (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?), (kotlin.String..kotlin.String?)>?)

'deprecatedDiagnostic' @ [123:44] ==> value-parameter deprecatedDiagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[ValueParameterDescriptorImpl]

'TYPEALIAS_EXPANSION_DEPRECATION' @ [123:73] ==> public final val TYPEALIAS_EXPANSION_DEPRECATION: (DiagnosticFactory3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'b' @ [123:106] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>.b: DeclarationDescriptor[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.TypeAliasDescriptor..org.jetbrains.kotlin.descriptors.TypeAliasDescriptor?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)
    <C : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'TYPEALIAS_EXPANSION_DEPRECATION_ERROR' @ [124:24] ==> public final val TYPEALIAS_EXPANSION_DEPRECATION_ERROR: (DiagnosticFactory3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [125:39] ==> @NotNull public open fun <D : (Diagnostic..Diagnostic?)> cast(@NotNull p0: Diagnostic, @NotNull vararg p1: (DiagnosticFactory<out (DiagnosticWithParameters3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticWithParameters3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?)>..DiagnosticFactory<out (DiagnosticWithParameters3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticWithParameters3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?)>?)): DiagnosticWithParameters3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory[JavaMethodDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> (org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters3<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.descriptors.TypeAliasDescriptor..org.jetbrains.kotlin.descriptors.TypeAliasDescriptor?), (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?), (kotlin.String..kotlin.String?)>..org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters3<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.descriptors.TypeAliasDescriptor..org.jetbrains.kotlin.descriptors.TypeAliasDescriptor?), (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?), (kotlin.String..kotlin.String?)>?)

'deprecatedDiagnostic' @ [125:44] ==> value-parameter deprecatedDiagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[ValueParameterDescriptorImpl]

'TYPEALIAS_EXPANSION_DEPRECATION_ERROR' @ [125:73] ==> public final val TYPEALIAS_EXPANSION_DEPRECATION_ERROR: (DiagnosticFactory3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'b' @ [125:112] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<(PsiElement..PsiElement?), (TypeAliasDescriptor..TypeAliasDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>.b: DeclarationDescriptor[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.TypeAliasDescriptor..org.jetbrains.kotlin.descriptors.TypeAliasDescriptor?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)
    <C : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'IllegalStateException' @ [126:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'?:' @ [129:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ReplaceWith?, right: ReplaceWith): ReplaceWith[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ReplaceWith

'fetchReplaceWithPattern' @ [129:60] ==> public final fun fetchReplaceWithPattern(descriptor: DeclarationDescriptor, project: Project): ReplaceWith? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [129:84] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[LocalVariableDescriptor]

'nameExpression' @ [129:96] ==> val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[LocalVariableDescriptor]

'project' @ [129:111] ==> public final val KtSimpleNameExpression.project: Project[MyPropertyDescriptor]

'Data' @ [130:20] ==> public constructor Data(nameExpression: KtSimpleNameExpression, replaceWith: ReplaceWith, descriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.Data[ClassConstructorDescriptorImpl]

'nameExpression' @ [130:25] ==> val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[LocalVariableDescriptor]

'replacement' @ [130:41] ==> val replacement: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[LocalVariableDescriptor]

'descriptor' @ [130:54] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.extractDataFromDiagnostic[LocalVariableDescriptor]

'element' @ [134:36] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [134:44] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [135:34] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'analyze' @ [135:51] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'element' @ [135:59] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'PARTIAL' @ [135:84] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [136:26] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'mainReference' @ [136:34] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolveToDescriptors' @ [136:48] ==> public open fun resolveToDescriptors(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [136:69] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'singleOrNull' @ [136:85] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'DeprecatedSymbolUsageFixBase' @ [138:44] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase[FakeCallableDescriptorForObject]

'fetchReplaceWithPattern' @ [138:73] ==> public final fun fetchReplaceWithPattern(descriptor: DeclarationDescriptor, project: Project): ReplaceWith? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion[SimpleFunctionDescriptorImpl]

'target' @ [138:97] ==> var target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'resolutionFacade' @ [138:105] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'project' @ [138:122] ==> public abstract val project: Project defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'replacePatternFromSymbol' @ [139:17] ==> var replacePatternFromSymbol: ReplaceWith? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'target' @ [139:53] ==> var target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'target' @ [140:17] ==> var target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'target' @ [140:26] ==> var target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'containingDeclaration' @ [140:33] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'replacePatternFromSymbol' @ [141:17] ==> var replacePatternFromSymbol: ReplaceWith? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'DeprecatedSymbolUsageFixBase' @ [141:44] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase[FakeCallableDescriptorForObject]

'fetchReplaceWithPattern' @ [141:73] ==> public final fun fetchReplaceWithPattern(descriptor: DeclarationDescriptor, project: Project): ReplaceWith? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion[SimpleFunctionDescriptorImpl]

'target' @ [141:97] ==> var target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'resolutionFacade' @ [141:105] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'project' @ [141:122] ==> public abstract val project: Project defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'recheckAnnotation' @ [145:17] ==> value-parameter recheckAnnotation: Boolean defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'replacePatternFromSymbol' @ [145:38] ==> var replacePatternFromSymbol: ReplaceWith? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'replaceWith' @ [145:66] ==> value-parameter replaceWith: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'when (target) {
                is CallableDescriptor -> {
                    val resolvedCall = element.getResolvedCall(bindingContext) ?: return null
                    if (!resolvedCall.isReallySuccess()) return null
                    val replacement = ReplaceWithAnnotationAnalyzer.analyzeCallableReplacement(replaceWith, target, resolutionFacade) ?: return null
                    return CallableUsageReplacementStrategy(replacement)
                }

                is ClassifierDescriptorWithTypeParameters -> {
                    val replacementType = ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement(replaceWith, target, resolutionFacade)
                    return when {
                        replacementType != null -> {
                            if (editor != null) {
                                val typeAlias = element
                                        .getStrictParentOfType<KtUserType>()
                                        ?.getStrictParentOfType<KtTypeReference>()
                                        ?.getStrictParentOfType<KtTypeAlias>()
                                if (typeAlias != null) {
                                    val usedConstructorWithOwnReplaceWith = usedConstructorsWithOwnReplaceWith(
                                            element.project, target, typeAlias)

                                    if (usedConstructorWithOwnReplaceWith != null) {
                                        val constructorStr = DescriptorRenderer.ONLY_NAMES_WITH_SHORT_TYPES.render(usedConstructorWithOwnReplaceWith)
                                        HintManager.getInstance().showErrorHint(
                                                editor,
                                                "There is own 'ReplaceWith' on '$constructorStr' that is used through this alias. " +
                                                "Please replace usages first.")
                                        return null
                                    }
                                }
                            }

                            //TODO: check that it's really resolved and is not an object otherwise it can be expression as well
                            ClassUsageReplacementStrategy(replacementType, null, element.project)
                        }
                        target is ClassDescriptor -> {
                            val constructor = target.unsubstitutedPrimaryConstructor ?: return null
                            val replacementExpression = ReplaceWithAnnotationAnalyzer.analyzeCallableReplacement(replaceWith, constructor, resolutionFacade) ?: return null
                            ClassUsageReplacementStrategy(null, replacementExpression, element.project)
                        }
                        else -> null
                    }
                }

                else -> return null
            }' @ [147:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'target' @ [147:19] ==> var target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'element' @ [149:40] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'getResolvedCall' @ [149:48] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [149:64] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'!' @ [150:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [150:26] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'isReallySuccess' @ [150:39] ==> public fun ResolvedCall<*>.isReallySuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model[DeserializedSimpleFunctionDescriptor]

'?:' @ [151:39] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: CodeToInline?, right: CodeToInline): CodeToInline[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> CodeToInline

'analyzeCallableReplacement' @ [151:69] ==> public final fun analyzeCallableReplacement(annotation: ReplaceWith, symbolDescriptor: CallableDescriptor, resolutionFacade: ResolutionFacade): CodeToInline? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'replaceWith' @ [151:96] ==> value-parameter replaceWith: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'target' @ [151:109] ==> var target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'resolutionFacade' @ [151:117] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'CallableUsageReplacementStrategy' @ [152:28] ==> public constructor CallableUsageReplacementStrategy(replacement: CodeToInline) defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy[ClassConstructorDescriptorImpl]

'replacement' @ [152:61] ==> val replacement: CodeToInline defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'ReplaceWithAnnotationAnalyzer' @ [156:43] ==> public object ReplaceWithAnnotationAnalyzer defined in org.jetbrains.kotlin.idea.quickfix.replaceWith in file ReplaceWithAnnotationAnalyzer.kt[FakeCallableDescriptorForObject]

'analyzeClassifierReplacement' @ [156:73] ==> public final fun analyzeClassifierReplacement(annotation: ReplaceWith, symbolDescriptor: ClassifierDescriptorWithTypeParameters, resolutionFacade: ResolutionFacade): KtUserType? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'replaceWith' @ [156:102] ==> value-parameter replaceWith: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'target' @ [156:115] ==> var target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'resolutionFacade' @ [156:123] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'when {
                        replacementType != null -> {
                            if (editor != null) {
                                val typeAlias = element
                                        .getStrictParentOfType<KtUserType>()
                                        ?.getStrictParentOfType<KtTypeReference>()
                                        ?.getStrictParentOfType<KtTypeAlias>()
                                if (typeAlias != null) {
                                    val usedConstructorWithOwnReplaceWith = usedConstructorsWithOwnReplaceWith(
                                            element.project, target, typeAlias)

                                    if (usedConstructorWithOwnReplaceWith != null) {
                                        val constructorStr = DescriptorRenderer.ONLY_NAMES_WITH_SHORT_TYPES.render(usedConstructorWithOwnReplaceWith)
                                        HintManager.getInstance().showErrorHint(
                                                editor,
                                                "There is own 'ReplaceWith' on '$constructorStr' that is used through this alias. " +
                                                "Please replace usages first.")
                                        return null
                                    }
                                }
                            }

                            //TODO: check that it's really resolved and is not an object otherwise it can be expression as well
                            ClassUsageReplacementStrategy(replacementType, null, element.project)
                        }
                        target is ClassDescriptor -> {
                            val constructor = target.unsubstitutedPrimaryConstructor ?: return null
                            val replacementExpression = ReplaceWithAnnotationAnalyzer.analyzeCallableReplacement(replaceWith, constructor, resolutionFacade) ?: return null
                            ClassUsageReplacementStrategy(null, replacementExpression, element.project)
                        }
                        else -> null
                    }' @ [157:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UsageReplacementStrategy?, entry1: UsageReplacementStrategy?, entry2: UsageReplacementStrategy?): UsageReplacementStrategy?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UsageReplacementStrategy?

'replacementType' @ [158:25] ==> val replacementType: KtUserType? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'editor' @ [159:33] ==> value-parameter editor: Editor? = ... defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'element' @ [160:49] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [161:42] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'getStrictParentOfType' @ [162:43] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtTypeReference? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'getStrictParentOfType' @ [163:43] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtTypeAlias? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeAlias

'typeAlias' @ [164:37] ==> val typeAlias: KtTypeAlias? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'usedConstructorsWithOwnReplaceWith' @ [165:77] ==> private final fun usedConstructorsWithOwnReplaceWith(project: Project, classifier: ClassifierDescriptorWithTypeParameters, typeAlias: PsiElement): ConstructorDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion[SimpleFunctionDescriptorImpl]

'element' @ [166:45] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'project' @ [166:53] ==> public final val KtSimpleNameExpression.project: Project[MyPropertyDescriptor]

'target' @ [166:62] ==> var target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'typeAlias' @ [166:70] ==> val typeAlias: KtTypeAlias? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'usedConstructorWithOwnReplaceWith' @ [168:41] ==> val usedConstructorWithOwnReplaceWith: ConstructorDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'DescriptorRenderer' @ [169:62] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'ONLY_NAMES_WITH_SHORT_TYPES' @ [169:81] ==> @field:JvmField public final val ONLY_NAMES_WITH_SHORT_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [169:109] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'usedConstructorWithOwnReplaceWith' @ [169:116] ==> val usedConstructorWithOwnReplaceWith: ConstructorDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'getInstance' @ [170:53] ==> public open fun getInstance(): (HintManager..HintManager?) defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'showErrorHint' @ [170:67] ==> public abstract fun showErrorHint(@NotNull p0: Editor, @NotNull p1: String): Unit defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'editor' @ [171:49] ==> value-parameter editor: Editor? = ... defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'+' @ [172:49] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'constructorStr' @ [172:82] ==> val constructorStr: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'ClassUsageReplacementStrategy' @ [180:29] ==> public constructor ClassUsageReplacementStrategy(typeReplacement: KtUserType?, constructorReplacement: CodeToInline?, project: Project) defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy[ClassConstructorDescriptorImpl]

'replacementType' @ [180:59] ==> val replacementType: KtUserType? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'element' @ [180:82] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'project' @ [180:90] ==> public final val KtSimpleNameExpression.project: Project[MyPropertyDescriptor]

'target' @ [182:25] ==> var target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'target' @ [183:47] ==> var target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [183:54] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'?:' @ [184:57] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: CodeToInline?, right: CodeToInline): CodeToInline[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> CodeToInline

'analyzeCallableReplacement' @ [184:87] ==> public final fun analyzeCallableReplacement(annotation: ReplaceWith, symbolDescriptor: CallableDescriptor, resolutionFacade: ResolutionFacade): CodeToInline? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'replaceWith' @ [184:114] ==> value-parameter replaceWith: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'constructor' @ [184:127] ==> val constructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'resolutionFacade' @ [184:140] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'ClassUsageReplacementStrategy' @ [185:29] ==> public constructor ClassUsageReplacementStrategy(typeReplacement: KtUserType?, constructorReplacement: CodeToInline?, project: Project) defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy[ClassConstructorDescriptorImpl]

'replacementExpression' @ [185:65] ==> val replacementExpression: CodeToInline defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[LocalVariableDescriptor]

'element' @ [185:88] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.buildUsageReplacementStrategy[ValueParameterDescriptorImpl]

'project' @ [185:96] ==> public final val KtSimpleNameExpression.project: Project[MyPropertyDescriptor]

'classifier' @ [197:52] ==> value-parameter classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith[ValueParameterDescriptorImpl]

'constructors' @ [197:63] ==> public val ClassifierDescriptorWithTypeParameters.constructors: Collection<ConstructorDescriptor> defined in org.jetbrains.kotlin.util[DeserializedPropertyDescriptor]

'filter' @ [197:76] ==> public inline fun <T> Iterable<ConstructorDescriptor>.filter(predicate: (ConstructorDescriptor) -> Boolean): List<ConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorDescriptor

'DeprecatedSymbolUsageFixBase' @ [198:17] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase[FakeCallableDescriptorForObject]

'fetchReplaceWithPattern' @ [198:46] ==> public final fun fetchReplaceWithPattern(descriptor: DeclarationDescriptor, project: Project): ReplaceWith? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion[SimpleFunctionDescriptorImpl]

'it' @ [198:70] ==> value-parameter it: ConstructorDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [198:74] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith[ValueParameterDescriptorImpl]

'toSet' @ [199:15] ==> public fun <T> Iterable<ConstructorDescriptor>.toSet(): Set<ConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorDescriptor

'specialReplaceWithForConstructor' @ [201:17] ==> val specialReplaceWithForConstructor: Set<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith[LocalVariableDescriptor]

'isEmpty' @ [201:50] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'allScope' @ [205:71] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [205:80] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith[ValueParameterDescriptorImpl]

'restrictToKotlinSources' @ [205:89] ==> public fun GlobalSearchScope.restrictToKotlinSources(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'search' @ [206:30] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'typeAlias' @ [206:37] ==> value-parameter typeAlias: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith[ValueParameterDescriptorImpl]

'searchAliasConstructorUsagesScope' @ [206:48] ==> val searchAliasConstructorUsagesScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith[LocalVariableDescriptor]

'find' @ [206:83] ==> @InlineOnly public inline fun <T> Iterable<(PsiReference..PsiReference?)>.find(predicate: ((PsiReference..PsiReference?)) -> Boolean): PsiReference? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'reference' @ [207:31] ==> value-parameter reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [207:41] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [209:21] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith.<anonymous>[LocalVariableDescriptor]

'element' @ [209:58] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith.<anonymous>[LocalVariableDescriptor]

'isCallee' @ [209:66] ==> public fun KtSimpleNameExpression.isCallee(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [210:45] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith.<anonymous>[LocalVariableDescriptor]

'resolveMainReferenceToDescriptors' @ [210:53] ==> public fun KtElement.resolveMainReferenceToDescriptors(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references[DeserializedSimpleFunctionDescriptor]

'filterIsInstance' @ [210:89] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<TypeAliasConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> TypeAliasConstructorDescriptor

'aliasConstructors' @ [211:50] ==> val aliasConstructors: List<TypeAliasConstructorDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith.<anonymous>[LocalVariableDescriptor]

'referenceConstructor' @ [212:29] ==> val referenceConstructor: TypeAliasConstructorDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith.<anonymous>[LocalVariableDescriptor]

'underlyingConstructorDescriptor' @ [212:50] ==> public abstract val underlyingConstructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor[DeserializedPropertyDescriptor]

'specialReplaceWithForConstructor' @ [212:85] ==> val specialReplaceWithForConstructor: Set<ConstructorDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith[LocalVariableDescriptor]

'referenceConstructor' @ [213:36] ==> val referenceConstructor: TypeAliasConstructorDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.usedConstructorsWithOwnReplaceWith.<anonymous>[LocalVariableDescriptor]

'underlyingConstructorDescriptor' @ [213:57] ==> public abstract val underlyingConstructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor[DeserializedPropertyDescriptor]

