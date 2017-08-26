'AndroidLayoutXmlFileManager' @ [30:5] ==> public constructor AndroidLayoutXmlFileManager(project: Project) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[ClassConstructorDescriptorImpl]

'project' @ [30:33] ==> value-parameter project: Project defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.<init>[ValueParameterDescriptorImpl]

'AndroidModule' @ [31:34] ==> public constructor AndroidModule(applicationPackage: String, variants: List<AndroidVariant>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModule[ClassConstructorDescriptorImpl]

'applicationPackage' @ [31:48] ==> value-parameter applicationPackage: String defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.<init>[ValueParameterDescriptorImpl]

'variants' @ [31:68] ==> value-parameter variants: List<AndroidVariant> defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.<init>[ValueParameterDescriptorImpl]

'initSAX' @ [33:40] ==> private final fun initSAX(): SAXParser defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'layoutGroup' @ [36:23] ==> value-parameter layoutGroup: AndroidLayoutGroupData defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.doExtractResources[ValueParameterDescriptorImpl]

'layouts' @ [36:35] ==> public final val layouts: List<PsiFile> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutGroupData[PropertyDescriptorImpl]

'map' @ [36:43] ==> public inline fun <T, R> Iterable<PsiFile>.map(transform: (PsiFile) -> AndroidLayout): List<AndroidLayout> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiFile
    <R> -> AndroidLayout

'arrayListOf' @ [37:29] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<AndroidResource> /* = ArrayList<AndroidResource> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidResource

'ByteArrayInputStream' @ [39:31] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'layout' @ [39:52] ==> value-parameter layout: PsiFile defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.doExtractResources.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [39:59] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'contentsToByteArray' @ [39:71] ==> @NotNull public abstract fun contentsToByteArray(): ByteArray defined in org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'saxParser' @ [40:13] ==> private final val saxParser: SAXParser defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager[PropertyDescriptorImpl]

'parse' @ [40:23] ==> public open fun parse(p0: (InputStream..InputStream?), p1: (DefaultHandler..DefaultHandler?)): Unit defined in javax.xml.parsers.SAXParser[JavaMethodDescriptor]

'inputStream' @ [40:29] ==> val inputStream: ByteArrayInputStream defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.doExtractResources.<anonymous>[LocalVariableDescriptor]

'AndroidXmlHandler' @ [40:42] ==> public constructor AndroidXmlHandler(elementCallback: (ResourceIdentifier, String) -> Unit) defined in org.jetbrains.kotlin.android.synthetic.AndroidXmlHandler[ClassConstructorDescriptorImpl]

'resources' @ [41:17] ==> val resources: ArrayList<AndroidResource> /* = ArrayList<AndroidResource> */ defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.doExtractResources.<anonymous>[LocalVariableDescriptor]

'parseAndroidResource' @ [41:30] ==> protected final fun parseAndroidResource(id: ResourceIdentifier, tag: String, sourceElement: PsiElement?): AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'id' @ [41:51] ==> value-parameter id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.doExtractResources.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tag' @ [41:55] ==> value-parameter tag: String defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.doExtractResources.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'AndroidLayout' @ [44:13] ==> public constructor AndroidLayout(resources: List<AndroidResource>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayout[ClassConstructorDescriptorImpl]

'resources' @ [44:27] ==> val resources: ArrayList<AndroidResource> /* = ArrayList<AndroidResource> */ defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.doExtractResources.<anonymous>[LocalVariableDescriptor]

'AndroidLayoutGroup' @ [47:16] ==> public constructor AndroidLayoutGroup(name: String, layouts: List<AndroidLayout>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutGroup[ClassConstructorDescriptorImpl]

'layoutGroup' @ [47:35] ==> value-parameter layoutGroup: AndroidLayoutGroupData defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.doExtractResources[ValueParameterDescriptorImpl]

'name' @ [47:47] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutGroupData[PropertyDescriptorImpl]

'layouts' @ [47:53] ==> val layouts: List<AndroidLayout> defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.doExtractResources[LocalVariableDescriptor]

'newInstance' @ [51:43] ==> public open fun newInstance(): (SAXParserFactory..SAXParserFactory?) defined in javax.xml.parsers.SAXParserFactory[JavaMethodDescriptor]

'saxFactory' @ [52:9] ==> val saxFactory: (SAXParserFactory..SAXParserFactory?) defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.initSAX[LocalVariableDescriptor]

'isNamespaceAware' @ [52:20] ==> public final var SAXParserFactory.isNamespaceAware: Boolean[MyPropertyDescriptor]

'saxFactory' @ [53:16] ==> val saxFactory: (SAXParserFactory..SAXParserFactory?) defined in org.jetbrains.kotlin.android.synthetic.res.CliAndroidLayoutXmlFileManager.initSAX[LocalVariableDescriptor]

'newSAXParser' @ [53:27] ==> public abstract fun newSAXParser(): (SAXParser..SAXParser?) defined in javax.xml.parsers.SAXParserFactory[JavaMethodDescriptor]

