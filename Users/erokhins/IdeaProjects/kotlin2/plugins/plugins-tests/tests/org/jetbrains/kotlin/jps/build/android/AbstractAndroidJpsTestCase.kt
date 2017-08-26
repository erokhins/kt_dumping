'BaseKotlinJpsBuildTestCase' @ [29:45] ==> public constructor BaseKotlinJpsBuildTestCase() defined in org.jetbrains.kotlin.jps.build.BaseKotlinJpsBuildTestCase[DeserializedClassConstructorDescriptor]

'addJdkAndAndroidSdk' @ [34:9] ==> private final fun addJdkAndAndroidSdk(): JpsSdk<JpsSimpleElement<JpsAndroidSdkProperties>> defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase[SimpleFunctionDescriptorImpl]

'loadProject' @ [35:9] ==> protected/*protected and package*/ open fun loadProject(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase[JavaMethodDescriptor]

'path' @ [35:21] ==> value-parameter path: String defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase.doTest[ValueParameterDescriptorImpl]

'getTestName' @ [35:28] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase[JavaMethodDescriptor]

'rebuildAllModules' @ [36:9] ==> protected/*protected and package*/ open fun rebuildAllModules(): Unit defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase[JavaMethodDescriptor]

'buildAllModules' @ [37:9] ==> protected/*protected and package*/ open fun buildAllModules(): (BuildResult..BuildResult?) defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase[JavaMethodDescriptor]

'assertSuccessful' @ [37:27] ==> public open fun assertSuccessful(): Unit defined in org.jetbrains.jps.builders.BuildResult[JavaMethodDescriptor]

'delete' @ [38:18] ==> public open fun delete(@NotNull p0: File): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [38:25] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [38:30] ==> value-parameter path: String defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase.doTest[ValueParameterDescriptorImpl]

'addJdk' @ [43:9] ==> protected/*protected and package*/ open fun addJdk(p0: (String..String?)): (JpsSdk<(JpsDummyElement..JpsDummyElement?)>..JpsSdk<(JpsDummyElement..JpsDummyElement?)>?) defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase[JavaMethodDescriptor]

'jdkName' @ [43:16] ==> val jdkName: String defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase.addJdkAndAndroidSdk[LocalVariableDescriptor]

'JpsAndroidSdkProperties' @ [44:26] ==> public constructor JpsAndroidSdkProperties(p0: (String..String?), p1: (String..String?)) defined in org.jetbrains.jps.android.model.JpsAndroidSdkProperties[JavaClassConstructorDescriptor]

'jdkName' @ [44:64] ==> val jdkName: String defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase.addJdkAndAndroidSdk[LocalVariableDescriptor]

'homePath' @ [45:23] ==> protected/*protected and package*/ for synthetic extension final val AbstractAndroidJpsTestCase.homePath: (String..String?)[MyPropertyDescriptor]

'myModel' @ [46:23] ==> protected/*protected and package*/ final var myModel: (JpsModel..JpsModel?) defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase[JavaPropertyDescriptor]

'global' @ [46:31] ==> public final val JpsModel.global: JpsGlobal[MyPropertyDescriptor]

'addSdk' @ [46:38] ==> public abstract fun <P : (JpsElement..JpsElement?)> addSdk(@NotNull p0: String, @Nullable p1: String?, @Nullable p2: String?, @NotNull p3: JpsSdkType<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>, @NotNull p4: JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>): (JpsTypedLibrary<(JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>..JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>?)>..JpsTypedLibrary<(JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>..JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>?)>?) defined in org.jetbrains.jps.model.JpsGlobal[JavaMethodDescriptor]
Inferred types:
    <P : (JpsElement..JpsElement?)> -> (org.jetbrains.jps.model.JpsSimpleElement<(org.jetbrains.jps.android.model.JpsAndroidSdkProperties..org.jetbrains.jps.android.model.JpsAndroidSdkProperties?)>..org.jetbrains.jps.model.JpsSimpleElement<(org.jetbrains.jps.android.model.JpsAndroidSdkProperties..org.jetbrains.jps.android.model.JpsAndroidSdkProperties?)>?)

'SDK_NAME' @ [46:45] ==> private final val SDK_NAME: String defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase[PropertyDescriptorImpl]

'sdkPath' @ [46:55] ==> val sdkPath: String defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase.addJdkAndAndroidSdk[LocalVariableDescriptor]

'INSTANCE' @ [46:86] ==> public final val INSTANCE: (JpsAndroidSdkType..JpsAndroidSdkType?) defined in org.jetbrains.jps.android.model.JpsAndroidSdkType[JavaPropertyDescriptor]

'JpsSimpleElementImpl' @ [46:96] ==> public constructor JpsSimpleElementImpl<D : (Any..Any?)>(p0: (JpsAndroidSdkProperties..JpsAndroidSdkProperties?)) defined in org.jetbrains.jps.model.impl.JpsSimpleElementImpl[JavaClassConstructorDescriptor]
Inferred types:
    <D : (Any..Any?)> -> (org.jetbrains.jps.android.model.JpsAndroidSdkProperties..org.jetbrains.jps.android.model.JpsAndroidSdkProperties?)

'properties' @ [46:117] ==> val properties: JpsAndroidSdkProperties defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase.addJdkAndAndroidSdk[LocalVariableDescriptor]

'library' @ [47:9] ==> val library: (JpsTypedLibrary<(JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>..JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>?)>..JpsTypedLibrary<(JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>..JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>?)>?) defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase.addJdkAndAndroidSdk[LocalVariableDescriptor]

'addRoot' @ [47:17] ==> public abstract fun addRoot(@NotNull p0: File, @NotNull p1: JpsOrderRootType): Unit defined in org.jetbrains.jps.model.library.JpsTypedLibrary[JavaMethodDescriptor]

'File' @ [47:25] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'sdkPath' @ [47:30] ==> val sdkPath: String defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase.addJdkAndAndroidSdk[LocalVariableDescriptor]

'COMPILED' @ [47:95] ==> public final val COMPILED: (JpsOrderRootType..JpsOrderRootType?) defined in org.jetbrains.jps.model.library.JpsOrderRootType[JavaPropertyDescriptor]

'library' @ [48:16] ==> val library: (JpsTypedLibrary<(JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>..JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>?)>..JpsTypedLibrary<(JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>..JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>?)>?) defined in org.jetbrains.kotlin.jps.build.android.AbstractAndroidJpsTestCase.addJdkAndAndroidSdk[LocalVariableDescriptor]

'properties' @ [48:24] ==> public final val <P : (JpsElement..JpsElement?)> JpsTypedLibrary<(JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>..JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>?)>.properties: JpsSdk<(JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>..JpsSimpleElement<(JpsAndroidSdkProperties..JpsAndroidSdkProperties?)>?)>[MyPropertyDescriptor]
Inferred types:
    <P : (JpsElement..JpsElement?)> -> (org.jetbrains.jps.model.library.sdk.JpsSdk<(org.jetbrains.jps.model.JpsSimpleElement<(org.jetbrains.jps.android.model.JpsAndroidSdkProperties..org.jetbrains.jps.android.model.JpsAndroidSdkProperties?)>..org.jetbrains.jps.model.JpsSimpleElement<(org.jetbrains.jps.android.model.JpsAndroidSdkProperties..org.jetbrains.jps.android.model.JpsAndroidSdkProperties?)>?)>..org.jetbrains.jps.model.library.sdk.JpsSdk<(org.jetbrains.jps.model.JpsSimpleElement<(org.jetbrains.jps.android.model.JpsAndroidSdkProperties..org.jetbrains.jps.android.model.JpsAndroidSdkProperties?)>..org.jetbrains.jps.model.JpsSimpleElement<(org.jetbrains.jps.android.model.JpsAndroidSdkProperties..org.jetbrains.jps.android.model.JpsAndroidSdkProperties?)>?)>?)

