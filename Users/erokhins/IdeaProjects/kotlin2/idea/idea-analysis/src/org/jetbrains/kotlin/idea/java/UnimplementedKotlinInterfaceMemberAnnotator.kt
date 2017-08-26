'element' @ [36:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.annotate[ValueParameterDescriptorImpl]

'element' @ [36:37] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.annotate[ValueParameterDescriptorImpl]

'language' @ [36:45] ==> public final val PsiClass.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [36:72] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'element' @ [38:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.annotate[ValueParameterDescriptorImpl]

'isInterface' @ [38:21] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'element' @ [38:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.annotate[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [38:44] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'ABSTRACT' @ [38:76] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'getAnyMethodToImplement' @ [40:13] ==> @Nullable public open fun getAnyMethodToImplement(@NotNull p0: PsiClass): PsiMethod? defined in com.intellij.codeInsight.ClassUtil[JavaMethodDescriptor]

'element' @ [40:37] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.annotate[ValueParameterDescriptorImpl]

'findUnimplementedMethod' @ [42:9] ==> private final fun findUnimplementedMethod(psiClass: PsiClass): KtLightMethod? defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator[SimpleFunctionDescriptorImpl]

'element' @ [42:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.annotate[ValueParameterDescriptorImpl]

'let' @ [42:43] ==> @InlineOnly public inline fun <T, R> KtLightMethod.let(block: (KtLightMethod) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightMethod
    <R> -> Unit

'report' @ [43:13] ==> private final fun report(method: KtLightMethod, holder: AnnotationHolder, psiClass: PsiClass): Unit defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator[SimpleFunctionDescriptorImpl]

'it' @ [43:20] ==> value-parameter it: KtLightMethod defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.annotate.<anonymous>[ValueParameterDescriptorImpl]

'holder' @ [43:24] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.annotate[ValueParameterDescriptorImpl]

'element' @ [43:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.annotate[ValueParameterDescriptorImpl]

'psiClass' @ [49:46] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.findUnimplementedMethod[ValueParameterDescriptorImpl]

'visibleSignatures' @ [49:55] ==> public final val PsiClass.visibleSignatures: (MutableCollection<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>..Collection<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>)[MyPropertyDescriptor]

'filter' @ [49:73] ==> public inline fun <T> Iterable<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>.filter(predicate: ((HierarchicalMethodSignature..HierarchicalMethodSignature?)) -> Boolean): List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.HierarchicalMethodSignature..com.intellij.psi.HierarchicalMethodSignature?)

'signature' @ [50:13] ==> value-parameter signature: (HierarchicalMethodSignature..HierarchicalMethodSignature?) defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.findUnimplementedMethod.<anonymous>[ValueParameterDescriptorImpl]

'method' @ [50:23] ==> public final val HierarchicalMethodSignature.method: PsiMethod[MyPropertyDescriptor]

'let' @ [50:30] ==> @InlineOnly public inline fun <T, R> PsiMethod.let(block: (PsiMethod) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> Boolean

'it' @ [50:36] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.findUnimplementedMethod.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [50:59] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.findUnimplementedMethod.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [50:62] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'DEFAULT' @ [50:94] ==> public const final val DEFAULT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'ifEmpty' @ [51:11] ==> public inline fun <T, C : Collection<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>> List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>.ifEmpty(body: () -> List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>): List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.HierarchicalMethodSignature..com.intellij.psi.HierarchicalMethodSignature?)
    <C : Collection<T>> -> List<(com.intellij.psi.HierarchicalMethodSignature..com.intellij.psi.HierarchicalMethodSignature?)>

'generateSequence' @ [53:32] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: PsiClass?, nextFunction: (PsiClass) -> PsiClass?): Sequence<PsiClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiClass

'psiClass' @ [53:49] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.findUnimplementedMethod[ValueParameterDescriptorImpl]

'it' @ [53:61] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.findUnimplementedMethod.<anonymous>[ValueParameterDescriptorImpl]

'superClass' @ [53:64] ==> public final val PsiClass.superClass: PsiClass?[MyPropertyDescriptor]

'firstOrNull' @ [53:77] ==> public inline fun <T> Sequence<PsiClass>.firstOrNull(predicate: (PsiClass) -> Boolean): PsiClass? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'it' @ [53:91] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.findUnimplementedMethod.<anonymous>[ValueParameterDescriptorImpl]

'signaturesFromKotlinInterfaces' @ [54:42] ==> val signaturesFromKotlinInterfaces: List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)> defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.findUnimplementedMethod[LocalVariableDescriptor]

'first' @ [54:73] ==> public fun <T> List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>.first(): (HierarchicalMethodSignature..HierarchicalMethodSignature?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.HierarchicalMethodSignature..com.intellij.psi.HierarchicalMethodSignature?)

'method' @ [54:81] ==> public final val HierarchicalMethodSignature.method: PsiMethod[MyPropertyDescriptor]

'kotlinSuperClass' @ [56:56] ==> val kotlinSuperClass: PsiClass defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.findUnimplementedMethod[LocalVariableDescriptor]

'visibleSignatures' @ [56:73] ==> public final val PsiClass.visibleSignatures: (MutableCollection<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>..Collection<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>)[MyPropertyDescriptor]

'signaturesFromKotlinInterfaces' @ [57:16] ==> val signaturesFromKotlinInterfaces: List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)> defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.findUnimplementedMethod[LocalVariableDescriptor]

'firstOrNull' @ [57:47] ==> public inline fun <T> Iterable<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>.firstOrNull(predicate: ((HierarchicalMethodSignature..HierarchicalMethodSignature?)) -> Boolean): HierarchicalMethodSignature? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.HierarchicalMethodSignature..com.intellij.psi.HierarchicalMethodSignature?)

'it' @ [57:61] ==> value-parameter it: (HierarchicalMethodSignature..HierarchicalMethodSignature?) defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.findUnimplementedMethod.<anonymous>[ValueParameterDescriptorImpl]

'signaturesVisibleThroughKotlinSuperClass' @ [57:68] ==> val signaturesVisibleThroughKotlinSuperClass: (MutableCollection<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>..Collection<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>) defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.findUnimplementedMethod[LocalVariableDescriptor]

'method' @ [57:112] ==> public final val HierarchicalMethodSignature.method: PsiMethod[MyPropertyDescriptor]

'if (psiClass is PsiEnumConstantInitializer) "enum.constant.should.implement.method" else "class.must.be.abstract"' @ [61:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'psiClass' @ [61:23] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.report[ValueParameterDescriptorImpl]

'message' @ [62:41] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.codeInsight.daemon.JavaErrorMessages[JavaMethodDescriptor]

'key' @ [62:49] ==> val key: String defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.report[LocalVariableDescriptor]

'formatClass' @ [62:68] ==> @NotNull public open fun formatClass(@NotNull p0: PsiClass, p1: Boolean): String defined in com.intellij.codeInsight.daemon.impl.analysis.HighlightUtil[JavaMethodDescriptor]

'psiClass' @ [62:80] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.report[ValueParameterDescriptorImpl]

'formatMethod' @ [62:116] ==> @NotNull public open fun formatMethod(@NotNull p0: PsiMethod): String defined in com.intellij.codeInsight.daemon.impl.analysis.JavaHighlightUtil[JavaMethodDescriptor]

'method' @ [62:129] ==> value-parameter method: KtLightMethod defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.report[ValueParameterDescriptorImpl]

'formatClass' @ [63:63] ==> @NotNull public open fun formatClass(@NotNull p0: PsiClass, p1: Boolean): String defined in com.intellij.codeInsight.daemon.impl.analysis.HighlightUtil[JavaMethodDescriptor]

'method' @ [63:75] ==> value-parameter method: KtLightMethod defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.report[ValueParameterDescriptorImpl]

'containingClass' @ [63:82] ==> public final val KtLightMethod.containingClass: KtLightClass[MyPropertyDescriptor]

'holder' @ [64:31] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.report[ValueParameterDescriptorImpl]

'createErrorAnnotation' @ [64:38] ==> public abstract fun createErrorAnnotation(@NotNull p0: TextRange, @Nullable p1: String?): (Annotation..Annotation?) defined in com.intellij.lang.annotation.AnnotationHolder[JavaMethodDescriptor]

'getClassDeclarationTextRange' @ [64:60] ==> @NotNull public open fun getClassDeclarationTextRange(@NotNull p0: PsiClass): TextRange defined in com.intellij.codeInsight.daemon.impl.analysis.HighlightNamesUtil[JavaMethodDescriptor]

'psiClass' @ [64:89] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.report[ValueParameterDescriptorImpl]

'message' @ [64:100] ==> val message: (String..String?) defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.report[LocalVariableDescriptor]

'registerFixes' @ [65:9] ==> private final fun registerFixes(errorAnnotation: Annotation, psiClass: PsiClass): Unit defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator[SimpleFunctionDescriptorImpl]

'errorAnnotation' @ [65:23] ==> val errorAnnotation: (Annotation..Annotation?) defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.report[LocalVariableDescriptor]

'psiClass' @ [65:40] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.report[ValueParameterDescriptorImpl]

'getInstance' @ [69:47] ==> public open fun getInstance(): (QuickFixFactory..QuickFixFactory?) defined in com.intellij.codeInsight.intention.QuickFixFactory[JavaMethodDescriptor]

'errorAnnotation' @ [72:9] ==> value-parameter errorAnnotation: Annotation defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.registerFixes[ValueParameterDescriptorImpl]

'registerFix' @ [72:25] ==> public open fun registerFix(@NotNull p0: IntentionAction): Unit defined in com.intellij.lang.annotation.Annotation[JavaMethodDescriptor]

'quickFixFactory' @ [72:37] ==> val quickFixFactory: (QuickFixFactory..QuickFixFactory?) defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.registerFixes[LocalVariableDescriptor]

'createImplementMethodsFix' @ [72:53] ==> @NotNull public abstract fun createImplementMethodsFix(@NotNull p0: PsiClass): LocalQuickFixAndIntentionActionOnPsiElement defined in com.intellij.codeInsight.intention.QuickFixFactory[JavaMethodDescriptor]

'psiClass' @ [72:79] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.registerFixes[ValueParameterDescriptorImpl]

'psiClass' @ [73:13] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.registerFixes[ValueParameterDescriptorImpl]

'!' @ [73:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'psiClass' @ [73:49] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.registerFixes[ValueParameterDescriptorImpl]

'modifierList' @ [73:58] ==> public final val PsiClass.modifierList: PsiModifierList?[MyPropertyDescriptor]

'hasExplicitModifier' @ [73:72] ==> public abstract fun hasExplicitModifier(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String): Boolean defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'FINAL' @ [73:104] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'errorAnnotation' @ [74:13] ==> value-parameter errorAnnotation: Annotation defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.registerFixes[ValueParameterDescriptorImpl]

'registerFix' @ [74:29] ==> public open fun registerFix(@NotNull p0: IntentionAction): Unit defined in com.intellij.lang.annotation.Annotation[JavaMethodDescriptor]

'quickFixFactory' @ [74:41] ==> val quickFixFactory: (QuickFixFactory..QuickFixFactory?) defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.registerFixes[LocalVariableDescriptor]

'createModifierListFix' @ [74:57] ==> @NotNull public abstract fun createModifierListFix(@NotNull p0: PsiModifierListOwner, @PsiModifier.ModifierConstant @NotNull p1: String, p2: Boolean, p3: Boolean): LocalQuickFixAndIntentionActionOnPsiElement defined in com.intellij.codeInsight.intention.QuickFixFactory[JavaMethodDescriptor]

'psiClass' @ [74:79] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.java.UnimplementedKotlinInterfaceMemberAnnotator.registerFixes[ValueParameterDescriptorImpl]

'ABSTRACT' @ [74:101] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

