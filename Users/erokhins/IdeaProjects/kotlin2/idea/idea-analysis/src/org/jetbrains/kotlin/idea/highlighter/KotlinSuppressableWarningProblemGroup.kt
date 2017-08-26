'assert' @ [35:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'diagnosticFactory' @ [35:17] ==> private final val diagnosticFactory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.highlighter.KotlinSuppressableWarningProblemGroup[PropertyDescriptorImpl]

'severity' @ [35:35] ==> public final val <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.severity: Severity[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(*)

'WARNING' @ [35:56] ==> enum entry WARNING defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'diagnosticFactory' @ [38:37] ==> private final val diagnosticFactory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.highlighter.KotlinSuppressableWarningProblemGroup[PropertyDescriptorImpl]

'name' @ [38:55] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(*)

'element' @ [41:13] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.KotlinSuppressableWarningProblemGroup.getSuppressActions[ValueParameterDescriptorImpl]

'EMPTY_ARRAY' @ [42:44] ==> public final var EMPTY_ARRAY: (Array<(SuppressIntentionAction..SuppressIntentionAction?)>..Array<out (SuppressIntentionAction..SuppressIntentionAction?)>?) defined in com.intellij.codeInspection.SuppressIntentionAction[JavaPropertyDescriptor]

'createSuppressWarningActions' @ [44:16] ==> public fun createSuppressWarningActions(element: PsiElement, diagnosticFactory: DiagnosticFactory<*>): List<SuppressIntentionAction> defined in org.jetbrains.kotlin.idea.highlighter in file KotlinSuppressableWarningProblemGroup.kt[SimpleFunctionDescriptorImpl]

'element' @ [44:45] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.KotlinSuppressableWarningProblemGroup.getSuppressActions[ValueParameterDescriptorImpl]

'diagnosticFactory' @ [44:54] ==> private final val diagnosticFactory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.highlighter.KotlinSuppressableWarningProblemGroup[PropertyDescriptorImpl]

'toTypedArray' @ [44:73] ==> public inline fun <reified T> Collection<SuppressIntentionAction>.toTypedArray(): Array<SuppressIntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> SuppressIntentionAction

'createSuppressWarningActions' @ [50:9] ==> public fun createSuppressWarningActions(element: PsiElement, severity: Severity, suppressionKey: String): List<SuppressIntentionAction> defined in org.jetbrains.kotlin.idea.highlighter in file KotlinSuppressableWarningProblemGroup.kt[SimpleFunctionDescriptorImpl]

'element' @ [50:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[ValueParameterDescriptorImpl]

'diagnosticFactory' @ [50:47] ==> value-parameter diagnosticFactory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[ValueParameterDescriptorImpl]

'severity' @ [50:65] ==> public final val <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.severity: Severity[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(*)

'diagnosticFactory' @ [50:75] ==> value-parameter diagnosticFactory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[ValueParameterDescriptorImpl]

'name' @ [50:93] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(*)

'severity' @ [54:9] ==> value-parameter severity: Severity defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[ValueParameterDescriptorImpl]

'WARNING' @ [54:30] ==> enum entry WARNING defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'emptyList' @ [54:58] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(SuppressIntentionAction..SuppressIntentionAction?)>..List<(SuppressIntentionAction..SuppressIntentionAction?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.codeInspection.SuppressIntentionAction..com.intellij.codeInspection.SuppressIntentionAction?)

'arrayListOf' @ [56:19] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<SuppressIntentionAction> /* = ArrayList<SuppressIntentionAction> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SuppressIntentionAction

'element' @ [57:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[ValueParameterDescriptorImpl]

'current' @ [59:12] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'when {
            current is KtDeclaration && current !is KtDestructuringDeclaration -> {
                val declaration = current
                val kind = DeclarationKindDetector.detect(declaration)
                if (kind != null) {
                    actions.add(KotlinSuppressIntentionAction(declaration, suppressionKey, kind))
                }
                suppressAtStatementAllowed = false
            }

            current is KtExpression && suppressAtStatementAllowed -> {
                // Add suppress action at first statement
                if (current.parent is KtBlockExpression || current.parent is KtDestructuringDeclaration) {
                    val kind = if (current.parent is KtBlockExpression) "statement" else "initializer"
                    actions.add(KotlinSuppressIntentionAction(current, suppressionKey,
                                                              AnnotationHostKind(kind, "", true)))
                    suppressAtStatementAllowed = false
                }
            }

            current is KtFile -> {
                actions.add(KotlinSuppressIntentionAction(current, suppressionKey,
                                                          AnnotationHostKind("file", current.name, true)))
                suppressAtStatementAllowed = false
            }
        }' @ [60:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'current' @ [61:13] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'current' @ [61:41] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'current' @ [62:35] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'DeclarationKindDetector' @ [63:28] ==> private object DeclarationKindDetector : KtVisitor<AnnotationHostKind?, Unit?> defined in org.jetbrains.kotlin.idea.highlighter in file KotlinSuppressableWarningProblemGroup.kt[FakeCallableDescriptorForObject]

'detect' @ [63:52] ==> public final fun detect(declaration: KtDeclaration): AnnotationHostKind? defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector[SimpleFunctionDescriptorImpl]

'declaration' @ [63:59] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'kind' @ [64:21] ==> val kind: AnnotationHostKind? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'actions' @ [65:21] ==> val actions: ArrayList<SuppressIntentionAction> /* = ArrayList<SuppressIntentionAction> */ defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'add' @ [65:29] ==> public open fun add(element: SuppressIntentionAction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'KotlinSuppressIntentionAction' @ [65:33] ==> public constructor KotlinSuppressIntentionAction(suppressAt: KtExpression, suppressKey: String, kind: AnnotationHostKind) defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[ClassConstructorDescriptorImpl]

'declaration' @ [65:63] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'suppressionKey' @ [65:76] ==> value-parameter suppressionKey: String defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[ValueParameterDescriptorImpl]

'kind' @ [65:92] ==> val kind: AnnotationHostKind? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'suppressAtStatementAllowed' @ [67:17] ==> var suppressAtStatementAllowed: Boolean defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'current' @ [70:13] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'suppressAtStatementAllowed' @ [70:40] ==> var suppressAtStatementAllowed: Boolean defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'current' @ [72:21] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'parent' @ [72:29] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'current' @ [72:60] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'parent' @ [72:68] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (current.parent is KtBlockExpression) "statement" else "initializer"' @ [73:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'current' @ [73:36] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'parent' @ [73:44] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'actions' @ [74:21] ==> val actions: ArrayList<SuppressIntentionAction> /* = ArrayList<SuppressIntentionAction> */ defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'add' @ [74:29] ==> public open fun add(element: SuppressIntentionAction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'KotlinSuppressIntentionAction' @ [74:33] ==> public constructor KotlinSuppressIntentionAction(suppressAt: KtExpression, suppressKey: String, kind: AnnotationHostKind) defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[ClassConstructorDescriptorImpl]

'current' @ [74:63] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'suppressionKey' @ [74:72] ==> value-parameter suppressionKey: String defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[ValueParameterDescriptorImpl]

'AnnotationHostKind' @ [75:63] ==> public constructor AnnotationHostKind(kind: String, name: String, newLineNeeded: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.AnnotationHostKind[ClassConstructorDescriptorImpl]

'kind' @ [75:82] ==> val kind: String defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'suppressAtStatementAllowed' @ [76:21] ==> var suppressAtStatementAllowed: Boolean defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'current' @ [80:13] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'actions' @ [81:17] ==> val actions: ArrayList<SuppressIntentionAction> /* = ArrayList<SuppressIntentionAction> */ defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'add' @ [81:25] ==> public open fun add(element: SuppressIntentionAction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'KotlinSuppressIntentionAction' @ [81:29] ==> public constructor KotlinSuppressIntentionAction(suppressAt: KtFile, suppressKey: String, kind: AnnotationHostKind) defined in org.jetbrains.kotlin.idea.quickfix.KotlinSuppressIntentionAction[ClassConstructorDescriptorImpl]

'current' @ [81:59] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'suppressionKey' @ [81:68] ==> value-parameter suppressionKey: String defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[ValueParameterDescriptorImpl]

'AnnotationHostKind' @ [82:59] ==> public constructor AnnotationHostKind(kind: String, name: String, newLineNeeded: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.AnnotationHostKind[ClassConstructorDescriptorImpl]

'current' @ [82:86] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'name' @ [82:94] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'suppressAtStatementAllowed' @ [83:17] ==> var suppressAtStatementAllowed: Boolean defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'current' @ [87:9] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'current' @ [87:19] ==> var current: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'parent' @ [87:27] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'actions' @ [89:12] ==> val actions: ArrayList<SuppressIntentionAction> /* = ArrayList<SuppressIntentionAction> */ defined in org.jetbrains.kotlin.idea.highlighter.createSuppressWarningActions[LocalVariableDescriptor]

'KtVisitor<AnnotationHostKind?, Unit?>' @ [92:42] ==> public constructor KtVisitor<R : (Any..Any?), D : (Any..Any?)>() defined in org.jetbrains.kotlin.psi.KtVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <R : (Any..Any?)> -> AnnotationHostKind?
    <D : (Any..Any?)> -> Unit?

'declaration' @ [94:46] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.detect[ValueParameterDescriptorImpl]

'accept' @ [94:58] ==> public abstract fun <R : (Any..Any?), D : (Any..Any?)> accept(@NotNull visitor: KtVisitor<AnnotationHostKind?, Unit?>, data: Unit?): AnnotationHostKind? defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> AnnotationHostKind?
    <D : (Any..Any?)> -> Unit?

'this' @ [94:65] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector[LazyClassReceiverParameterDescriptor]

'detect' @ [98:56] ==> private final fun detect(declaration: KtDeclaration, kind: String, name: String = ..., newLineNeeded: Boolean = ...): AnnotationHostKind defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector[SimpleFunctionDescriptorImpl]

'd' @ [98:63] ==> value-parameter d: KtClass defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitClass[ValueParameterDescriptorImpl]

'if (d.isInterface()) "interface" else "class"' @ [98:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'd' @ [98:70] ==> value-parameter d: KtClass defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitClass[ValueParameterDescriptorImpl]

'isInterface' @ [98:72] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'detect' @ [100:72] ==> private final fun detect(declaration: KtDeclaration, kind: String, name: String = ..., newLineNeeded: Boolean = ...): AnnotationHostKind defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector[SimpleFunctionDescriptorImpl]

'd' @ [100:79] ==> value-parameter d: KtNamedFunction defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitNamedFunction[ValueParameterDescriptorImpl]

'detect' @ [102:62] ==> private final fun detect(declaration: KtDeclaration, kind: String, name: String = ..., newLineNeeded: Boolean = ...): AnnotationHostKind defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector[SimpleFunctionDescriptorImpl]

'd' @ [102:69] ==> value-parameter d: KtProperty defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitProperty[ValueParameterDescriptorImpl]

'd' @ [102:72] ==> value-parameter d: KtProperty defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitProperty[ValueParameterDescriptorImpl]

'valOrVarKeyword' @ [102:74] ==> public final val KtProperty.valOrVarKeyword: PsiElement[MyPropertyDescriptor]

'text' @ [102:90] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'detect' @ [104:94] ==> private final fun detect(declaration: KtDeclaration, kind: String, name: String = ..., newLineNeeded: Boolean = ...): AnnotationHostKind defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector[SimpleFunctionDescriptorImpl]

'd' @ [104:101] ==> value-parameter d: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'd' @ [104:104] ==> value-parameter d: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'valOrVarKeyword' @ [104:106] ==> public final val KtDestructuringDeclaration.valOrVarKeyword: PsiElement?[MyPropertyDescriptor]

'text' @ [104:123] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'd' @ [105:108] ==> value-parameter d: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'entries' @ [105:110] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'joinToString' @ [105:118] ==> public fun <T> Iterable<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)

'it' @ [105:149] ==> value-parameter it: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitDestructuringDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [105:152] ==> public final val KtDestructuringDeclarationEntry.name: String?[MyPropertyDescriptor]

'detect' @ [107:72] ==> private final fun detect(declaration: KtDeclaration, kind: String, name: String = ..., newLineNeeded: Boolean = ...): AnnotationHostKind defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector[SimpleFunctionDescriptorImpl]

'd' @ [107:79] ==> value-parameter d: KtTypeParameter defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitTypeParameter[ValueParameterDescriptorImpl]

'detect' @ [109:64] ==> private final fun detect(declaration: KtDeclaration, kind: String, name: String = ..., newLineNeeded: Boolean = ...): AnnotationHostKind defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector[SimpleFunctionDescriptorImpl]

'd' @ [109:71] ==> value-parameter d: KtEnumEntry defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitEnumEntry[ValueParameterDescriptorImpl]

'detect' @ [111:64] ==> private final fun detect(declaration: KtDeclaration, kind: String, name: String = ..., newLineNeeded: Boolean = ...): AnnotationHostKind defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector[SimpleFunctionDescriptorImpl]

'd' @ [111:71] ==> value-parameter d: KtParameter defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitParameter[ValueParameterDescriptorImpl]

'detect' @ [113:96] ==> private final fun detect(declaration: KtDeclaration, kind: String, name: String = ..., newLineNeeded: Boolean = ...): AnnotationHostKind defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector[SimpleFunctionDescriptorImpl]

'constructor' @ [113:103] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitSecondaryConstructor[ValueParameterDescriptorImpl]

'd' @ [116:13] ==> value-parameter d: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitObjectDeclaration[ValueParameterDescriptorImpl]

'isCompanion' @ [116:15] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'detect' @ [116:37] ==> private final fun detect(declaration: KtDeclaration, kind: String, name: String = ..., newLineNeeded: Boolean = ...): AnnotationHostKind defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector[SimpleFunctionDescriptorImpl]

'd' @ [116:44] ==> value-parameter d: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitObjectDeclaration[ValueParameterDescriptorImpl]

'd' @ [116:77] ==> value-parameter d: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitObjectDeclaration[ValueParameterDescriptorImpl]

'name' @ [116:79] ==> public final val KtObjectDeclaration.name: String?[MyPropertyDescriptor]

'd' @ [116:90] ==> value-parameter d: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitObjectDeclaration[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [116:92] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'name' @ [116:126] ==> public final val KtClass.name: String?[MyPropertyDescriptor]

'd' @ [117:13] ==> value-parameter d: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitObjectDeclaration[ValueParameterDescriptorImpl]

'parent' @ [117:15] ==> public final val KtObjectDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'detect' @ [118:16] ==> private final fun detect(declaration: KtDeclaration, kind: String, name: String = ..., newLineNeeded: Boolean = ...): AnnotationHostKind defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector[SimpleFunctionDescriptorImpl]

'd' @ [118:23] ==> value-parameter d: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.visitObjectDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [121:81] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.detect[ValueParameterDescriptorImpl]

'name' @ [121:93] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'AnnotationHostKind' @ [122:11] ==> public constructor AnnotationHostKind(kind: String, name: String, newLineNeeded: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.AnnotationHostKind[ClassConstructorDescriptorImpl]

'kind' @ [122:30] ==> value-parameter kind: String defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.detect[ValueParameterDescriptorImpl]

'name' @ [122:36] ==> value-parameter name: String = ... defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.detect[ValueParameterDescriptorImpl]

'newLineNeeded' @ [122:42] ==> value-parameter newLineNeeded: Boolean = ... defined in org.jetbrains.kotlin.idea.highlighter.DeclarationKindDetector.detect[ValueParameterDescriptorImpl]

