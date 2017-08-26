'TextEditorHighlightingPass' @ [41:5] ==> protected/*protected and package*/ constructor TextEditorHighlightingPass(@NotNull p0: Project, @Nullable p1: Document?) defined in com.intellij.codeHighlighting.TextEditorHighlightingPass[JavaClassConstructorDescriptor]

'file' @ [41:32] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.<init>[ValueParameterDescriptorImpl]

'project' @ [41:37] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'document' @ [41:46] ==> value-parameter document: Document defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.<init>[ValueParameterDescriptorImpl]

'Volatile' @ [43:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'AnnotationHolderImpl' @ [46:32] ==> public constructor AnnotationHolderImpl(@NotNull p0: AnnotationSession) defined in com.intellij.codeInsight.daemon.impl.AnnotationHolderImpl[JavaClassConstructorDescriptor]

'AnnotationSession' @ [46:53] ==> public constructor AnnotationSession(@NotNull p0: PsiFile) defined in com.intellij.lang.annotation.AnnotationSession[JavaClassConstructorDescriptor]

'file' @ [46:71] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass[PropertyDescriptorImpl]

'BeforeResolveHighlightingVisitor' @ [47:23] ==> public constructor BeforeResolveHighlightingVisitor(holder: AnnotationHolder) defined in org.jetbrains.kotlin.idea.highlighter.BeforeResolveHighlightingVisitor[ClassConstructorDescriptorImpl]

'annotationHolder' @ [47:56] ==> val annotationHolder: AnnotationHolderImpl defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.doCollectInformation[LocalVariableDescriptor]

'file' @ [48:9] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass[PropertyDescriptorImpl]

'accept' @ [48:14] ==> public open fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'PsiRecursiveElementVisitor' @ [48:30] ==> protected/*protected and package*/ constructor PsiRecursiveElementVisitor() defined in com.intellij.psi.PsiRecursiveElementVisitor[JavaClassConstructorDescriptor]

'super' @ [50:17] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.doCollectInformation.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [50:23] ==> public open fun visitElement(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiRecursiveElementVisitor[JavaMethodDescriptor]

'element' @ [50:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.doCollectInformation.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'element' @ [51:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.doCollectInformation.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'accept' @ [51:25] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'visitor' @ [51:32] ==> val visitor: BeforeResolveHighlightingVisitor defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.doCollectInformation[LocalVariableDescriptor]

'this' @ [54:9] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass[LazyClassReceiverParameterDescriptor]

'annotationHolder' @ [54:14] ==> @Volatile private final var annotationHolder: AnnotationHolderImpl? defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass[PropertyDescriptorImpl]

'annotationHolder' @ [54:33] ==> val annotationHolder: AnnotationHolderImpl defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.doCollectInformation[LocalVariableDescriptor]

'annotationHolder' @ [58:13] ==> @Volatile private final var annotationHolder: AnnotationHolderImpl? defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass[PropertyDescriptorImpl]

'annotationHolder' @ [60:21] ==> @Volatile private final var annotationHolder: AnnotationHolderImpl? defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass[PropertyDescriptorImpl]

'map' @ [60:40] ==> public inline fun <T, R> Iterable<(Annotation..Annotation?)>.map(transform: ((Annotation..Annotation?)) -> HighlightInfo): List<HighlightInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.lang.annotation.Annotation..com.intellij.lang.annotation.Annotation?)
    <R> -> HighlightInfo

'fromAnnotation' @ [60:60] ==> @NotNull public open fun fromAnnotation(@NotNull p0: Annotation): HighlightInfo defined in com.intellij.codeInsight.daemon.impl.HighlightInfo[JavaMethodDescriptor]

'it' @ [60:75] ==> value-parameter it: (Annotation..Annotation?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.doApplyInformationToEditor.<anonymous>[ValueParameterDescriptorImpl]

'setHighlightersToEditor' @ [62:32] ==> public open fun setHighlightersToEditor(@NotNull p0: Project, @NotNull p1: Document, p2: Int, p3: Int, @NotNull p4: (MutableCollection<(HighlightInfo..HighlightInfo?)>..Collection<(HighlightInfo..HighlightInfo?)>), @Nullable p5: EditorColorsScheme?, p6: Int): Unit defined in com.intellij.codeInsight.daemon.impl.UpdateHighlightersUtil[JavaMethodDescriptor]

'myProject' @ [62:56] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass[JavaPropertyDescriptor]

'myDocument' @ [62:67] ==> @Nullable protected/*protected and package*/ final val myDocument: Document? defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass[JavaPropertyDescriptor]

'file' @ [62:84] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass[PropertyDescriptorImpl]

'textLength' @ [62:89] ==> public final val KtFile.textLength: Int[MyPropertyDescriptor]

'infos' @ [62:101] ==> val infos: List<HighlightInfo> defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.doApplyInformationToEditor[LocalVariableDescriptor]

'colorsScheme' @ [62:108] ==> public final var KotlinBeforeResolveHighlightingPass.colorsScheme: EditorColorsScheme?[MyPropertyDescriptor]

'id' @ [62:122] ==> public final var KotlinBeforeResolveHighlightingPass.id: Int[MyPropertyDescriptor]

'annotationHolder' @ [63:9] ==> @Volatile private final var annotationHolder: AnnotationHolderImpl? defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass[PropertyDescriptorImpl]

'AbstractProjectComponent' @ [66:87] ==> protected/*protected and package*/ constructor AbstractProjectComponent(p0: (Project..Project?)) defined in com.intellij.openapi.components.AbstractProjectComponent[JavaClassConstructorDescriptor]

'project' @ [66:112] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.Factory.<init>[ValueParameterDescriptorImpl]

'registrar' @ [68:13] ==> value-parameter registrar: TextEditorHighlightingPassRegistrar defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.Factory.<init>[ValueParameterDescriptorImpl]

'registerTextEditorHighlightingPass' @ [68:23] ==> public open fun registerTextEditorHighlightingPass(p0: (TextEditorHighlightingPassFactory..TextEditorHighlightingPassFactory?), p1: (TextEditorHighlightingPassRegistrar.Anchor..TextEditorHighlightingPassRegistrar.Anchor?), p2: Int, p3: Boolean, p4: Boolean): Int defined in com.intellij.codeHighlighting.TextEditorHighlightingPassRegistrar[JavaMethodDescriptor]

'this' @ [68:58] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.Factory[LazyClassReceiverParameterDescriptor]

'BEFORE' @ [68:107] ==> enum entry BEFORE defined in com.intellij.codeHighlighting.TextEditorHighlightingPassRegistrar.Anchor[FakeCallableDescriptorForObject]

'UPDATE_FOLDING' @ [68:120] ==> public const final val UPDATE_FOLDING: Int defined in com.intellij.codeHighlighting.Pass[JavaPropertyDescriptor]

'file' @ [72:17] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.Factory.createHighlightingPass[ValueParameterDescriptorImpl]

'KotlinBeforeResolveHighlightingPass' @ [73:20] ==> public constructor KotlinBeforeResolveHighlightingPass(file: KtFile, document: Document) defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass[ClassConstructorDescriptorImpl]

'file' @ [73:56] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.Factory.createHighlightingPass[ValueParameterDescriptorImpl]

'editor' @ [73:62] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.highlighter.KotlinBeforeResolveHighlightingPass.Factory.createHighlightingPass[ValueParameterDescriptorImpl]

'document' @ [73:69] ==> public final val Editor.document: Document[MyPropertyDescriptor]

