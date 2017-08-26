'AfterAnalysisHighlightingVisitor' @ [30:11] ==> protected constructor AfterAnalysisHighlightingVisitor(holder: AnnotationHolder, bindingContext: BindingContext) defined in org.jetbrains.kotlin.idea.highlighter.AfterAnalysisHighlightingVisitor[ClassConstructorDescriptorImpl]

'holder' @ [30:44] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.<init>[ValueParameterDescriptorImpl]

'bindingContext' @ [30:52] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.<init>[ValueParameterDescriptorImpl]

'expression' @ [33:22] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'parent' @ [33:33] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [34:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'parent' @ [34:44] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'NameHighlighter' @ [39:13] ==> public object NameHighlighter defined in org.jetbrains.kotlin.idea.highlighter in file NameHighlighter.kt[FakeCallableDescriptorForObject]

'namesHighlightingEnabled' @ [39:29] ==> public final var namesHighlightingEnabled: Boolean defined in org.jetbrains.kotlin.idea.highlighter.NameHighlighter[PropertyDescriptorImpl]

'bindingContext' @ [40:35] ==> protected final var bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor[PropertyDescriptorImpl]

'get' @ [40:50] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [40:69] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [40:87] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'referenceTarget' @ [41:17] ==> var referenceTarget: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'expression' @ [42:35] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getParentOfTypeAndBranch' @ [42:46] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallExpression.() -> PsiElement?): KtCallExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallExpression

'calleeExpression' @ [42:97] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'expression' @ [43:24] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getParentOfTypeAndBranch' @ [43:35] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtSuperTypeCallEntry.() -> PsiElement?): KtSuperTypeCallEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSuperTypeCallEntry

'calleeExpression' @ [43:90] ==> public final val KtSuperTypeCallEntry.calleeExpression: KtConstructorCalleeExpression[MyPropertyDescriptor]

'callElement' @ [44:21] ==> val callElement: {KtCallElement & ASTDelegatePsiElement}? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'referenceTarget' @ [45:21] ==> var referenceTarget: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'referenceTarget' @ [45:39] ==> var referenceTarget: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'containingDeclaration' @ [45:55] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'if (referenceTarget is ClassDescriptor) {
                if (referenceTarget.kind == ClassKind.ANNOTATION_CLASS) {
                    highlightAnnotation(expression)
                }
                else {
                    highlightName(expression, textAttributesKeyForClass(referenceTarget))
                }
            }
            else if (referenceTarget is TypeParameterDescriptor) {
                highlightName(expression, TYPE_PARAMETER)
            }' @ [49:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'referenceTarget' @ [49:17] ==> var referenceTarget: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'if (referenceTarget.kind == ClassKind.ANNOTATION_CLASS) {
                    highlightAnnotation(expression)
                }
                else {
                    highlightName(expression, textAttributesKeyForClass(referenceTarget))
                }' @ [50:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'referenceTarget' @ [50:21] ==> var referenceTarget: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'kind' @ [50:37] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ANNOTATION_CLASS' @ [50:55] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'highlightAnnotation' @ [51:21] ==> private final fun highlightAnnotation(expression: KtSimpleNameExpression): Unit defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [51:41] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'highlightName' @ [54:21] ==> protected final fun highlightName(element: PsiElement, attributesKey: TextAttributesKey, message: String?): Unit defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [54:35] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'textAttributesKeyForClass' @ [54:47] ==> private final fun textAttributesKeyForClass(descriptor: ClassDescriptor): TextAttributesKey defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor[SimpleFunctionDescriptorImpl]

'referenceTarget' @ [54:73] ==> var referenceTarget: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'referenceTarget' @ [57:22] ==> var referenceTarget: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'highlightName' @ [58:17] ==> protected final fun highlightName(element: PsiElement, attributesKey: TextAttributesKey, message: String?): Unit defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [58:31] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'TYPE_PARAMETER' @ [58:43] ==> public final val TYPE_PARAMETER: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'expression' @ [64:21] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.highlightAnnotation[ValueParameterDescriptorImpl]

'textRange' @ [64:32] ==> public final val KtSimpleNameExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'getParentOfType' @ [68:43] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtAnnotationEntry..KtAnnotationEntry?)>, p2: Boolean, @NotNull vararg p3: (Class<out (PsiElement..PsiElement?)>..Class<out (PsiElement..PsiElement?)>?)): KtAnnotationEntry? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtAnnotationEntry

'expression' @ [69:17] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.highlightAnnotation[ValueParameterDescriptorImpl]

'java' @ [69:54] ==> public val <T> KClass<KtAnnotationEntry>.java: Class<KtAnnotationEntry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'KtValueArgumentList' @ [69:81] ==> public constructor KtValueArgumentList(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaClassConstructorDescriptor]

'java' @ [69:108] ==> public val <T> KClass<KtValueArgumentList>.java: Class<KtValueArgumentList> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtValueArgumentList

'annotationEntry' @ [70:13] ==> val annotationEntry: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.highlightAnnotation[LocalVariableDescriptor]

'annotationEntry' @ [71:28] ==> val annotationEntry: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.highlightAnnotation[LocalVariableDescriptor]

'atSymbol' @ [71:44] ==> public final val KtAnnotationEntry.atSymbol: PsiElement?[MyPropertyDescriptor]

'atSymbol' @ [72:17] ==> val atSymbol: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.highlightAnnotation[LocalVariableDescriptor]

'range' @ [73:17] ==> var range: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.highlightAnnotation[LocalVariableDescriptor]

'TextRange' @ [73:25] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'atSymbol' @ [73:35] ==> val atSymbol: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.highlightAnnotation[LocalVariableDescriptor]

'textRange' @ [73:44] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [73:54] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'expression' @ [73:67] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.highlightAnnotation[ValueParameterDescriptorImpl]

'textRange' @ [73:78] ==> public final val KtSimpleNameExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [73:88] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'highlightName' @ [77:9] ==> protected final fun highlightName(textRange: TextRange, attributesKey: TextAttributesKey, message: String?): Unit defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor[SimpleFunctionDescriptorImpl]

'range' @ [77:23] ==> var range: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.highlightAnnotation[LocalVariableDescriptor]

'ANNOTATION' @ [77:30] ==> public final val ANNOTATION: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'parameter' @ [81:9] ==> value-parameter parameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitTypeParameter[ValueParameterDescriptorImpl]

'nameIdentifier' @ [81:19] ==> public final val KtTypeParameter.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'let' @ [81:35] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'highlightName' @ [81:41] ==> protected final fun highlightName(element: PsiElement, attributesKey: TextAttributesKey, message: String?): Unit defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor[SimpleFunctionDescriptorImpl]

'it' @ [81:55] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitTypeParameter.<anonymous>[ValueParameterDescriptorImpl]

'TYPE_PARAMETER' @ [81:59] ==> public final val TYPE_PARAMETER: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'super' @ [82:9] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor[LazyClassReceiverParameterDescriptor]

'visitTypeParameter' @ [82:15] ==> public open fun visitTypeParameter(@NotNull p0: KtTypeParameter): Unit defined in org.jetbrains.kotlin.idea.highlighter.AfterAnalysisHighlightingVisitor[JavaMethodDescriptor]

'parameter' @ [82:34] ==> value-parameter parameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitTypeParameter[ValueParameterDescriptorImpl]

'classOrObject' @ [86:26] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitClassOrObject[ValueParameterDescriptorImpl]

'nameIdentifier' @ [86:40] ==> public final val KtClassOrObject.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'bindingContext' @ [87:31] ==> protected final var bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor[PropertyDescriptorImpl]

'get' @ [87:46] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?), p1: (PsiElement..PsiElement?)): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> ClassDescriptor

'CLASS' @ [87:65] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'classOrObject' @ [87:72] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitClassOrObject[ValueParameterDescriptorImpl]

'identifier' @ [88:13] ==> val identifier: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitClassOrObject[LocalVariableDescriptor]

'classDescriptor' @ [88:35] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitClassOrObject[LocalVariableDescriptor]

'highlightName' @ [89:13] ==> protected final fun highlightName(element: PsiElement, attributesKey: TextAttributesKey, message: String?): Unit defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor[SimpleFunctionDescriptorImpl]

'identifier' @ [89:27] ==> val identifier: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitClassOrObject[LocalVariableDescriptor]

'textAttributesKeyForClass' @ [89:39] ==> private final fun textAttributesKeyForClass(descriptor: ClassDescriptor): TextAttributesKey defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [89:65] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitClassOrObject[LocalVariableDescriptor]

'super' @ [91:9] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor[LazyClassReceiverParameterDescriptor]

'visitClassOrObject' @ [91:15] ==> public open fun visitClassOrObject(@NotNull p0: KtClassOrObject): Unit defined in org.jetbrains.kotlin.idea.highlighter.AfterAnalysisHighlightingVisitor[JavaMethodDescriptor]

'classOrObject' @ [91:34] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.visitClassOrObject[ValueParameterDescriptorImpl]

'when (descriptor.kind) {
        ClassKind.INTERFACE -> TRAIT
        ClassKind.ANNOTATION_CLASS -> ANNOTATION
        ClassKind.OBJECT -> OBJECT
        ClassKind.ENUM_ENTRY -> ENUM_ENTRY
        else -> if (descriptor.modality === Modality.ABSTRACT) ABSTRACT_CLASS else CLASS
    }' @ [98:93] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TextAttributesKey, entry1: TextAttributesKey, entry2: TextAttributesKey, entry3: TextAttributesKey, entry4: TextAttributesKey): TextAttributesKey[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TextAttributesKey

'descriptor' @ [98:99] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.textAttributesKeyForClass[ValueParameterDescriptorImpl]

'kind' @ [98:110] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [99:19] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'TRAIT' @ [99:32] ==> public final val TRAIT: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'ANNOTATION_CLASS' @ [100:19] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'ANNOTATION' @ [100:39] ==> public final val ANNOTATION: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'OBJECT' @ [101:19] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'OBJECT' @ [101:29] ==> public final val OBJECT: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'ENUM_ENTRY' @ [102:19] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'ENUM_ENTRY' @ [102:33] ==> public final val ENUM_ENTRY: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'if (descriptor.modality === Modality.ABSTRACT) ABSTRACT_CLASS else CLASS' @ [103:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (TextAttributesKey..TextAttributesKey?), elseBranch: (TextAttributesKey..TextAttributesKey?)): (TextAttributesKey..TextAttributesKey?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.openapi.editor.colors.TextAttributesKey..com.intellij.openapi.editor.colors.TextAttributesKey?)

'descriptor' @ [103:21] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.highlighter.TypeKindHighlightingVisitor.textAttributesKeyForClass[ValueParameterDescriptorImpl]

'modality' @ [103:32] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [103:45] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [103:54] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT_CLASS' @ [103:64] ==> public final val ABSTRACT_CLASS: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'CLASS' @ [103:84] ==> public final val CLASS: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

