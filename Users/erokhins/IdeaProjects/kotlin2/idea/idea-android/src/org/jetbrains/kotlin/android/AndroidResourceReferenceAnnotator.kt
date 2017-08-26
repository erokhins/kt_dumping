'element' @ [40:25] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[ValueParameterDescriptorImpl]

'?:' @ [41:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: AndroidFacet?, right: AndroidFacet): AndroidFacet[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> AndroidFacet

'getInstance' @ [41:41] ==> @Nullable public open fun getInstance(@NotNull p0: PsiElement): AndroidFacet? defined in org.jetbrains.android.facet.AndroidFacet[JavaMethodDescriptor]

'element' @ [41:53] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[ValueParameterDescriptorImpl]

'reference' @ [42:31] ==> val reference: KtReferenceExpression defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'getResourceReferenceTargetDescriptor' @ [42:41] ==> private final fun KtReferenceExpression.getResourceReferenceTargetDescriptor(): JavaPropertyDescriptor? defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator[SimpleFunctionDescriptorImpl]

'referenceTarget' @ [43:28] ==> val referenceTarget: JavaPropertyDescriptor defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'getAndroidResourceType' @ [43:44] ==> internal fun JavaPropertyDescriptor.getAndroidResourceType(): ResourceType? defined in org.jetbrains.kotlin.android in file AndroidUtil.kt[SimpleFunctionDescriptorImpl]

'resourceType' @ [45:13] ==> val resourceType: ResourceType defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'COLOR' @ [45:29] ==> enum entry COLOR defined in com.android.resources.ResourceType[FakeCallableDescriptorForObject]

'resourceType' @ [45:38] ==> val resourceType: ResourceType defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'DRAWABLE' @ [45:54] ==> enum entry DRAWABLE defined in com.android.resources.ResourceType[FakeCallableDescriptorForObject]

'resourceType' @ [45:66] ==> val resourceType: ResourceType defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'MIPMAP' @ [45:82] ==> enum entry MIPMAP defined in com.android.resources.ResourceType[FakeCallableDescriptorForObject]

'referenceTarget' @ [49:29] ==> val referenceTarget: JavaPropertyDescriptor defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'getResourceReferenceType' @ [49:45] ==> internal fun JavaPropertyDescriptor.getResourceReferenceType(): AndroidPsiUtils.ResourceReferenceType defined in org.jetbrains.kotlin.android in file AndroidUtil.kt[SimpleFunctionDescriptorImpl]

'pickConfiguration' @ [50:29] ==> @Nullable public open fun pickConfiguration(facet: (AndroidFacet..AndroidFacet?), module: (Module..Module?), file: (PsiFile..PsiFile?)): Configuration? defined in org.jetbrains.kotlin.android.ResourceReferenceAnnotatorUtil[JavaMethodDescriptor]

'androidFacet' @ [50:47] ==> val androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'androidFacet' @ [50:61] ==> val androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'module' @ [50:74] ==> public final val AndroidFacet.module: Module[MyPropertyDescriptor]

'element' @ [50:82] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[ValueParameterDescriptorImpl]

'containingFile' @ [50:90] ==> public final val KtReferenceExpression.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'findResourceValue' @ [51:29] ==> @Nullable public open fun findResourceValue(type: (ResourceType..ResourceType?), name: (String..String?), isFramework: Boolean, module: (Module..Module?), configuration: (Configuration..Configuration?)): ResourceValue? defined in org.jetbrains.kotlin.android.ResourceReferenceAnnotatorUtil[JavaMethodDescriptor]

'resourceType' @ [51:47] ==> val resourceType: ResourceType defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'reference' @ [52:47] ==> val reference: KtReferenceExpression defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'text' @ [52:57] ==> public final val KtReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'referenceType' @ [53:47] ==> val referenceType: AndroidPsiUtils.ResourceReferenceType defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'FRAMEWORK' @ [53:64] ==> enum entry FRAMEWORK defined in com.android.tools.idea.AndroidPsiUtils.ResourceReferenceType[FakeCallableDescriptorForObject]

'androidFacet' @ [54:47] ==> val androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'module' @ [54:60] ==> public final val AndroidFacet.module: Module[MyPropertyDescriptor]

'configuration' @ [55:47] ==> val configuration: Configuration defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'configuration' @ [57:32] ==> val configuration: Configuration defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'resourceResolver' @ [57:46] ==> public final val Configuration.resourceResolver: ResourceResolver?[MyPropertyDescriptor]

'if (resourceType == COLOR) {
            val color = ResourceHelper.resolveColor(resourceResolver, resourceValue, element.project)
            if (color != null) {
                val annotation = holder.createInfoAnnotation(element, null)
                annotation.gutterIconRenderer = ColorRenderer(element, color)
            }
        }
        else {
            var file = ResourceHelper.resolveDrawable(resourceResolver, resourceValue, element.project)
            if (file != null && file.path.endsWith(SdkConstants.DOT_XML)) {
                file = pickBitmapFromXml(file, resourceResolver, element.project)
            }
            val iconFile = AndroidColorAnnotator.pickBestBitmap(file)
            if (iconFile != null) {
                val annotation = holder.createInfoAnnotation(element, null)
                annotation.gutterIconRenderer = GutterIconRenderer(resourceResolver, element, iconFile)
            }
        }' @ [59:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'resourceType' @ [59:13] ==> val resourceType: ResourceType defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'COLOR' @ [59:29] ==> enum entry COLOR defined in com.android.resources.ResourceType[FakeCallableDescriptorForObject]

'resolveColor' @ [60:40] ==> @Nullable public open fun resolveColor(@NotNull p0: RenderResources, @Nullable p1: ResourceValue?, @NotNull p2: Project): Color? defined in com.android.tools.idea.res.ResourceHelper[JavaMethodDescriptor]

'resourceResolver' @ [60:53] ==> val resourceResolver: ResourceResolver defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'resourceValue' @ [60:71] ==> val resourceValue: ResourceValue defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'element' @ [60:86] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[ValueParameterDescriptorImpl]

'project' @ [60:94] ==> public final val KtReferenceExpression.project: Project[MyPropertyDescriptor]

'color' @ [61:17] ==> val color: Color? defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'holder' @ [62:34] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[ValueParameterDescriptorImpl]

'createInfoAnnotation' @ [62:41] ==> public abstract fun createInfoAnnotation(@NotNull p0: PsiElement, @Nullable p1: String?): (Annotation..Annotation?) defined in com.intellij.lang.annotation.AnnotationHolder[JavaMethodDescriptor]

'element' @ [62:62] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[ValueParameterDescriptorImpl]

'annotation' @ [63:17] ==> val annotation: (Annotation..Annotation?) defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'gutterIconRenderer' @ [63:28] ==> public final var Annotation.gutterIconRenderer: GutterIconRenderer?[MyPropertyDescriptor]

'ColorRenderer' @ [63:49] ==> public/*package*/ constructor ColorRenderer(@NotNull element: PsiElement, @Nullable color: Color?) defined in org.jetbrains.kotlin.android.ResourceReferenceAnnotatorUtil.ColorRenderer[JavaClassConstructorDescriptor]

'element' @ [63:63] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[ValueParameterDescriptorImpl]

'color' @ [63:72] ==> val color: Color? defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'resolveDrawable' @ [67:39] ==> @Nullable public open fun resolveDrawable(@NotNull p0: RenderResources, @Nullable p1: ResourceValue?, @NotNull p2: Project): File? defined in com.android.tools.idea.res.ResourceHelper[JavaMethodDescriptor]

'resourceResolver' @ [67:55] ==> val resourceResolver: ResourceResolver defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'resourceValue' @ [67:73] ==> val resourceValue: ResourceValue defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'element' @ [67:88] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[ValueParameterDescriptorImpl]

'project' @ [67:96] ==> public final val KtReferenceExpression.project: Project[MyPropertyDescriptor]

'file' @ [68:17] ==> var file: File? defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'file' @ [68:33] ==> var file: File? defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'path' @ [68:38] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [68:43] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DOT_XML' @ [68:65] ==> public const final val DOT_XML: String defined in com.android.SdkConstants[JavaPropertyDescriptor]

'file' @ [69:17] ==> var file: File? defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'pickBitmapFromXml' @ [69:24] ==> @Nullable public open fun pickBitmapFromXml(@NotNull file: File, @NotNull resourceResolver: ResourceResolver, @NotNull project: Project): File? defined in org.jetbrains.kotlin.android.ResourceReferenceAnnotatorUtil[JavaMethodDescriptor]

'file' @ [69:42] ==> var file: File? defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'resourceResolver' @ [69:48] ==> val resourceResolver: ResourceResolver defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'element' @ [69:66] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[ValueParameterDescriptorImpl]

'project' @ [69:74] ==> public final val KtReferenceExpression.project: Project[MyPropertyDescriptor]

'pickBestBitmap' @ [71:50] ==> @Nullable public open fun pickBestBitmap(@Nullable p0: File?): File? defined in org.jetbrains.android.AndroidColorAnnotator[JavaMethodDescriptor]

'file' @ [71:65] ==> var file: File? defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'iconFile' @ [72:17] ==> val iconFile: File? defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'holder' @ [73:34] ==> value-parameter holder: AnnotationHolder defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[ValueParameterDescriptorImpl]

'createInfoAnnotation' @ [73:41] ==> public abstract fun createInfoAnnotation(@NotNull p0: PsiElement, @Nullable p1: String?): (Annotation..Annotation?) defined in com.intellij.lang.annotation.AnnotationHolder[JavaMethodDescriptor]

'element' @ [73:62] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[ValueParameterDescriptorImpl]

'annotation' @ [74:17] ==> val annotation: (Annotation..Annotation?) defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'gutterIconRenderer' @ [74:28] ==> public final var Annotation.gutterIconRenderer: GutterIconRenderer?[MyPropertyDescriptor]

'GutterIconRenderer' @ [74:49] ==> public constructor GutterIconRenderer(p0: (ResourceResolver..ResourceResolver?), @NotNull p1: PsiElement, @Nullable p2: File?) defined in com.android.tools.idea.rendering.GutterIconRenderer[JavaClassConstructorDescriptor]

'resourceResolver' @ [74:68] ==> val resourceResolver: ResourceResolver defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'element' @ [74:86] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[ValueParameterDescriptorImpl]

'iconFile' @ [74:95] ==> val iconFile: File? defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.annotate[LocalVariableDescriptor]

'analyze' @ [80:13] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [80:37] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'REFERENCE_TARGET' @ [80:61] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [80:79] ==> <this> defined in org.jetbrains.kotlin.android.AndroidResourceReferenceAnnotator.getResourceReferenceTargetDescriptor[ReceiverParameterDescriptorImpl]

