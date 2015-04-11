require connman.inc

SRC_URI  = "${KERNELORG_MIRROR}/linux/network/${BPN}/${BP}.tar.xz \
            file://0001-plugin.h-Change-visibility-to-default-for-debug-symb.patch \
            file://add_xuser_dbus_permission.patch \
	    file://0001-Enable-backtrace-API-only-when-compiling-for-glibc.patch \
	    file://0002-musl-header-fixes.patch \
	    file://0003-resolve-musl-does-not-implement-res_ninit.patch \
	    file://0004-tethering-Fix-duplicate-definitions-issue-with-musl.patch \
            file://connman \
            "
SRC_URI[md5sum] = "6e07c93877f80bb73c9d4dbfc697f3fc"
SRC_URI[sha256sum] = "b1d5e7dd2652725906e220a8b0206477e97080e835272971e3b2fd10943c5c94"

RRECOMMENDS_${PN} = "connman-conf"

