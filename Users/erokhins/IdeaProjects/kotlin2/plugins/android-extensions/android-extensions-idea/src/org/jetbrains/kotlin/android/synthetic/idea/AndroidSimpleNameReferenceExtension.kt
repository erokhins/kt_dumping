'element' @ [34:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isReferenceTo[ValueParameterDescriptorImpl]

'reference' @ [34:35] ==> value-parameter reference: KtSimpleNameReference defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isReferenceTo[ValueParameterDescriptorImpl]

'isReferenceToXmlFile' @ [34:45] ==> private final fun KtSimpleNameReference.isReferenceToXmlFile(xmlFile: XmlFile): Boolean defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension[SimpleFunctionDescriptorImpl]

'element' @ [34:66] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isReferenceTo[ValueParameterDescriptorImpl]

'reference' @ [37:31] ==> value-parameter reference: KtSimpleNameReference defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isLayoutPackageIdentifier[ValueParameterDescriptorImpl]

'element' @ [37:41] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'parent' @ [37:50] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'probablyVariant' @ [38:27] ==> val probablyVariant: KtDotQualifiedExpression defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isLayoutPackageIdentifier[LocalVariableDescriptor]

'receiverExpression' @ [38:43] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'probablyKAS' @ [39:16] ==> val probablyKAS: KtDotQualifiedExpression defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isLayoutPackageIdentifier[LocalVariableDescriptor]

'receiverExpression' @ [39:28] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'text' @ [39:47] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'SYNTHETIC_PACKAGE' @ [39:68] ==> public final val SYNTHETIC_PACKAGE: String defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[DeserializedPropertyDescriptor]

'reference' @ [43:31] ==> value-parameter reference: KtSimpleNameReference defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.handleElementRename[ValueParameterDescriptorImpl]

'resolve' @ [43:41] ==> @Nullable public open fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[JavaMethodDescriptor]

'if (resolvedElement is XmlAttributeValue && AndroidResourceUtil.isIdDeclaration(resolvedElement)) {
            val newSyntheticPropertyName = androidIdToName(newElementName) ?: return null
            return psiFactory.createNameIdentifier(newSyntheticPropertyName.name)
        }
        else if (isLayoutPackageIdentifier(reference)) {
            return psiFactory.createSimpleName(newElementName.removeSuffix(".xml")).getIdentifier()
        }' @ [44:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'resolvedElement' @ [44:13] ==> val resolvedElement: PsiElement? defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.handleElementRename[LocalVariableDescriptor]

'isIdDeclaration' @ [44:73] ==> public open fun isIdDeclaration(@NotNull p0: XmlAttributeValue): Boolean defined in org.jetbrains.android.util.AndroidResourceUtil[JavaMethodDescriptor]

'resolvedElement' @ [44:89] ==> val resolvedElement: PsiElement? defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.handleElementRename[LocalVariableDescriptor]

'androidIdToName' @ [45:44] ==> public fun androidIdToName(id: String): ResourceIdentifier? defined in org.jetbrains.kotlin.android.synthetic[DeserializedSimpleFunctionDescriptor]

'newElementName' @ [45:60] ==> value-parameter newElementName: String defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.handleElementRename[ValueParameterDescriptorImpl]

'psiFactory' @ [46:20] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.handleElementRename[ValueParameterDescriptorImpl]

'createNameIdentifier' @ [46:31] ==> public final fun createNameIdentifier(name: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newSyntheticPropertyName' @ [46:52] ==> val newSyntheticPropertyName: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.handleElementRename[LocalVariableDescriptor]

'name' @ [46:77] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[DeserializedPropertyDescriptor]

'isLayoutPackageIdentifier' @ [48:18] ==> private final fun isLayoutPackageIdentifier(reference: KtSimpleNameReference): Boolean defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension[SimpleFunctionDescriptorImpl]

'reference' @ [48:44] ==> value-parameter reference: KtSimpleNameReference defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.handleElementRename[ValueParameterDescriptorImpl]

'psiFactory' @ [49:20] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.handleElementRename[ValueParameterDescriptorImpl]

'createSimpleName' @ [49:31] ==> public final fun createSimpleName(name: String): KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newElementName' @ [49:48] ==> value-parameter newElementName: String defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.handleElementRename[ValueParameterDescriptorImpl]

'removeSuffix' @ [49:63] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getIdentifier' @ [49:85] ==> public abstract fun getIdentifier(): PsiElement? defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'!' @ [56:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLayoutPackageIdentifier' @ [56:14] ==> private final fun isLayoutPackageIdentifier(reference: KtSimpleNameReference): Boolean defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension[SimpleFunctionDescriptorImpl]

'this' @ [56:40] ==> <this> defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isReferenceToXmlFile[ReceiverParameterDescriptorImpl]

'xmlFile' @ [60:13] ==> value-parameter xmlFile: XmlFile defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isReferenceToXmlFile[ValueParameterDescriptorImpl]

'name' @ [60:21] ==> public final var XmlFile.name: String[MyPropertyDescriptor]

'removeSuffix' @ [60:26] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'element' @ [60:50] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'getReferencedName' @ [60:58] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'xmlFile' @ [64:27] ==> value-parameter xmlFile: XmlFile defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isReferenceToXmlFile[ValueParameterDescriptorImpl]

'virtualFile' @ [64:35] ==> public final val XmlFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'virtualFile' @ [65:25] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isReferenceToXmlFile[LocalVariableDescriptor]

'parent' @ [65:37] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'layoutDir' @ [66:13] ==> val layoutDir: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isReferenceToXmlFile[LocalVariableDescriptor]

'name' @ [66:23] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'!' @ [66:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'layoutDir' @ [66:44] ==> val layoutDir: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isReferenceToXmlFile[LocalVariableDescriptor]

'name' @ [66:54] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'startsWith' @ [66:59] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'?:' @ [70:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: (MutableList<(VirtualFile..VirtualFile?)>?..List<(VirtualFile..VirtualFile?)>?), right: (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>)): (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> (kotlin.collections.MutableList<(com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)>..kotlin.collections.List<(com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)>)

'getInstance' @ [70:48] ==> @Nullable public open fun getInstance(@NotNull p0: PsiElement): AndroidFacet? defined in org.jetbrains.android.facet.AndroidFacet[JavaMethodDescriptor]

'element' @ [70:60] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'allResourceDirectories' @ [70:70] ==> public final val AndroidFacet.allResourceDirectories: (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>)[MyPropertyDescriptor]

'virtualFile' @ [71:33] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isReferenceToXmlFile[LocalVariableDescriptor]

'parent' @ [71:45] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'parent' @ [71:53] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'resourceDirectories' @ [72:16] ==> val resourceDirectories: (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isReferenceToXmlFile[LocalVariableDescriptor]

'any' @ [72:36] ==> public inline fun <T> Iterable<(VirtualFile..VirtualFile?)>.any(predicate: ((VirtualFile..VirtualFile?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'it' @ [72:42] ==> value-parameter it: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isReferenceToXmlFile.<anonymous>[ValueParameterDescriptorImpl]

'resourceDirectory' @ [72:48] ==> val resourceDirectory: VirtualFile defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidSimpleNameReferenceExtension.isReferenceToXmlFile[LocalVariableDescriptor]

